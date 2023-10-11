package uz.mlsoft.myfourpics.data

data class QuestionData(
    val id: Int,
    val image1: Int,
    val image2: Int,
    val image3: Int,
    val image4: Int,
    val variant: String,
    val answer: String
)