package uz.mlsoft.myfourpics.presentation.main

import uz.mlsoft.myfourpics.data.QuestionData

interface MainContract {
    interface Model {
        fun getCurrentAnswer(currentPosition: Int): QuestionData
        fun getCurrentPosition(): Int
    }

    interface View {
        fun describeQuestion()
    }

    interface Presenter {
        fun loadQuestion()
        fun getCurrentAnswer(currentPosition: Int): QuestionData
        fun getCurrentPosition(): Int
    }
}