package uz.mlsoft.myfourpics.presentation.game

import uz.mlsoft.myfourpics.data.QuestionData

class GamePresenter(
    private val view: GameContract.View
) : GameContract.Presenter {
    private val model = GameModel()

    override fun loadNextQuestion() {
        view.describeQuestion(model.loadNextQuestion())
    }

    override fun getCurrentAnswer(): QuestionData {
        return model.getCurrentAnswer()
    }

    override fun setCurrentPosition(currentPosition: Int) {
        model.setCurrentPosition(currentPosition)
    }

    override fun getCurrentPosition(): Int {
        return model.getCurrentPosition()
    }

    override fun addCash() {
        model.addCash()
    }

    override fun showCash() {
        val cash = model.getCash()
        view.showCash(cash)
    }

    override fun getCash(): Int {
        return model.getCash()
    }

    override fun cutCash() {
        model.cutCash()
    }

    override fun setFinishCurrentPosition(position: Int) {
        model.setFinishCurrentPosition(position)
    }

    override fun setCoin() {
        model.setCoin()
    }

    override fun btnVariantClicked(text: String, index: Int) {
        view.showValueToAnswer(text, index)
    }

    override fun btnAnswerClicked(text: String, index: Int, tagPos: Int) {
        view.showValueToVariant(text, index, tagPos)
    }
}