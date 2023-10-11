package uz.mlsoft.myfourpics.presentation.game

import uz.mlsoft.myfourpics.data.QuestionData
import uz.mlsoft.myfourpics.domain.AppRepository

class GameModel : GameContract.Model {
    private val repository = AppRepository.getInstance()
    private val list = ArrayList<QuestionData>()
    private var currentPos = repository.getCurrentPosition()

    init {
        list.addAll(repository.list)
    }

    override fun loadNextQuestion(): QuestionData {
        repository.setCurrentPosition(currentPos)
        return list[currentPos++]
    }

    override fun getQuestionByIndex(index: Int): QuestionData {
        return list[index]
    }

    override fun getCurrentAnswer(): QuestionData {
        return list[currentPos - 1]
    }

    override fun setCurrentPosition(currentPosition: Int) {
        repository.setCurrentPosition(currentPosition)
    }

    override fun getCurrentPosition(): Int {
        return repository.getCurrentPosition()
    }

    override fun addCash() {
        repository.addCash()
    }

    override fun getCash(): Int {
        return repository.getCash()
    }

    override fun cutCash() {
        repository.cutCash()
    }

    override fun setFinishCurrentPosition(position: Int) {
        list.clear()
        repository.setFinishCurrentPosition(position)
    }

    override fun setCoin() {
        repository.setCoin()
    }
}