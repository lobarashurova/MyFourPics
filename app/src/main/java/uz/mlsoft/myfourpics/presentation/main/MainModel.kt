package uz.mlsoft.myfourpics.presentation.main

import uz.mlsoft.myfourpics.data.QuestionData
import uz.mlsoft.myfourpics.domain.AppRepository

class MainModel : MainContract.Model {
    private val repository = AppRepository.getInstance()

    private val list = ArrayList<QuestionData>()

    init {
        list.addAll(repository.list)
    }

    override fun getCurrentAnswer(currentPosition: Int): QuestionData {
        return if (currentPosition < list.size) {
            list[currentPosition]
        } else {
            list[0]
        }
    }

    override fun getCurrentPosition(): Int {
        return repository.getCurrentPosition()
    }
}
