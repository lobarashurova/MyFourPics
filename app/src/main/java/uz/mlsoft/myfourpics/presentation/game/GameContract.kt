package uz.mlsoft.myfourpics.presentation.game

import uz.mlsoft.myfourpics.data.QuestionData

interface GameContract {
    companion object {
        const val MAX_ANSWER_COUNT = 8
        const val MAX_VARIANT_COUNT = 16
    }

    interface Model {
        fun loadNextQuestion(): QuestionData?
        fun getQuestionByIndex(index: Int): QuestionData
        fun getCurrentAnswer(): QuestionData
        fun setCurrentPosition(currentPosition: Int)
        fun getCurrentPosition(): Int
        fun addCash()
        fun getCash(): Int
        fun cutCash()
        fun setFinishCurrentPosition(position: Int)
        fun setCoin()
    }

    interface View {
        fun describeQuestion(question: QuestionData)
        fun getFirstEmptyPosition(): Int
        fun showCash(cash: Int)
        fun showValueToAnswer(text: String, position: Int)
        fun showValueToVariant(text: String, index: Int, tagPos: Int)
    }

    interface Presenter {
        fun loadNextQuestion()
        fun getCurrentAnswer(): QuestionData
        fun setCurrentPosition(currentPosition: Int)
        fun getCurrentPosition(): Int
        fun addCash()
        fun showCash()
        fun getCash(): Int
        fun cutCash()
        fun setFinishCurrentPosition(position: Int)
        fun setCoin()
        fun btnVariantClicked(text: String, index: Int)
        fun btnAnswerClicked(text: String, index: Int, tagPos: Int)
    }
}