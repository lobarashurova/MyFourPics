package uz.mlsoft.myfourpics.presentation.main

import uz.mlsoft.myfourpics.data.QuestionData

class MainPresenter(
    private val view: MainContract.View
) : MainContract.Presenter {
    private val model = MainModel()

    override fun loadQuestion() {
        view.describeQuestion()
    }

    override fun getCurrentAnswer(currentPosition: Int): QuestionData {
        return model.getCurrentAnswer(currentPosition)
    }

    override fun getCurrentPosition(): Int {
        return model.getCurrentPosition()
    }
}