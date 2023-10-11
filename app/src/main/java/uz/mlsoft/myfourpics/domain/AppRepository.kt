package uz.mlsoft.myfourpics.domain

import android.util.Log
import uz.mlsoft.myfourpics.R
import uz.mlsoft.myfourpics.data.QuestionData
import uz.mlsoft.myfourpics.data.SharedPrefer

class AppRepository private constructor() {

    private var sharedPref = SharedPrefer.getInstance()

    companion object {
        private lateinit var instance: AppRepository

        fun getInstance(): AppRepository {
            if (!(::instance.isInitialized)) {
                instance = AppRepository()
            }
            return instance
        }
    }

    val list = ArrayList<QuestionData>()

    init {
        load()
    }

    private fun load() {
        list.add(
            QuestionData(
                1,
                R.drawable.marker1,
                R.drawable.marker2,
                R.drawable.marker3,
                R.drawable.marker4,
                "SMAKERRETKHUJKIL",
                "MARKER"
            )
        )

        list.add(
            QuestionData(
                2,
                R.drawable.milk1,
                R.drawable.milk2,
                R.drawable.milk3,
                R.drawable.milk4,
                "EAFMTWILDHPIITCK",
                "MILK"
            )
        )

        list.add(
            QuestionData(
                3,
                R.drawable.miner1,
                R.drawable.miner2,
                R.drawable.miner3,
                R.drawable.miner4,
                "NGAFMNTWKEIETNCR",
                "MINER"
            )
        )

        list.add(
            QuestionData(
                4,
                R.drawable.panda1,
                R.drawable.panda2,
                R.drawable.panda3,
                R.drawable.panda4,
                "NBPALFDAEIEUTNCK",
                "PANDA"
            )
        )

        list.add(
            QuestionData(
                5,
                R.drawable.pensil1,
                R.drawable.pensil2,
                R.drawable.pensil3,
                R.drawable.pensil4,
                "YNPGEOAEILTNLCKW",
                "PENCIL"
            )
        )

        list.add(
            QuestionData(
                6,
                R.drawable.pasta1,
                R.drawable.pasta2,
                R.drawable.pasta3,
                R.drawable.pasta4,
                "YSBIGENOPAEUASTN",
                "PASTA"
            )
        )

        list.add(
            QuestionData(
                7,
                R.drawable.pilot1,
                R.drawable.pilot2,
                R.drawable.pilot3,
                R.drawable.pilot4,
                "YNOBIRPEULPKLTEN",
                "PILOT"
            )
        )

        list.add(
            QuestionData(
                8,
                R.drawable.pizza1,
                R.drawable.pizza2,
                R.drawable.pizza3,
                R.drawable.pizza4,
                "EBIRNPZZAULRPOEN",
                "PIZZA"
            )
        )

        list.add(
            QuestionData(
                9,
                R.drawable.rabbit1,
                R.drawable.rabbit2,
                R.drawable.rabbit3,
                R.drawable.rabbit4,
                "RNRPEGAUBBEITYEN",
                "RABBIT"
            )
        )

        list.add(
            QuestionData(
                10,
                R.drawable.ruler1,
                R.drawable.ruler2,
                R.drawable.ruler3,
                R.drawable.ruler4,
                "WRPENGOAUBLOYERN",
                "RULER"
            )
        )
//        list.add(
//            QuestionData(
//                11,
//                R.drawable.snake1,
//                R.drawable.snake2,
//                R.drawable.snake3,
//                R.drawable.snake4,
//                "WRPENSAAUKLOYERN",
//                "SNAKE"
//            )
//        )
//        list.add(
//            QuestionData(
//                12,
//                R.drawable.teacher1,
//                R.drawable.teacher2,
//                R.drawable.teacher3,
//                R.drawable.teacher4,
//                "WTAENGCHUBLOYERN",
//                "TEACHER"
//            )
//        )
//        list.add(
//            QuestionData(
//                13,
//                R.drawable.owl1,
//                R.drawable.owl2,
//                R.drawable.owl3,
//                R.drawable.owl4,
//                "WRPENGOAUBLOYERN",
//                "OWL"
//            )
//        )
//        list.add(
//            QuestionData(
//                14,
//                R.drawable.ferrari_1,
//                R.drawable.ferrari_2,
//                R.drawable.ferrari_3,
//                R.drawable.ferrari_4,
//                "WRPEFGOIRALOYERN",
//                "FERRARI"
//            )
//        )
//        list.add(
//            QuestionData(
//                15,
//                R.drawable.photo1_1,
//                R.drawable.photo1_2,
//                R.drawable.photo1_3,
//                R.drawable.photo1_4,
//                "WRPENCDAUBLOYERN",
//                "COLD"
//            )
//        )
//        list.add(
//            QuestionData(
//                16,
//                R.drawable.shark1,
//                R.drawable.shark2,
//                R.drawable.shark3,
//                R.drawable.shark4,
//                "WRPESHOAKBLOYERN",
//                "SHARK"
//            )
//        )

    }

    fun setCurrentPosition(currentPos: Int) {
        Log.d("RRRR", "setCurrentPosition -> $currentPos")
        sharedPref.currentPosition = currentPos
    }

    fun getCurrentPosition(): Int {
        return sharedPref.currentPosition
    }

    fun addCash() {
        sharedPref.cash += 50
    }

    fun getCash(): Int {
        return sharedPref.cash
    }

    fun cutCash() {
        sharedPref.cash -= 20
    }

    fun setFinishCurrentPosition(position: Int) {
        sharedPref.currentPosition = position
    }

    fun setCoin() {
        sharedPref.cash = 100
    }
}