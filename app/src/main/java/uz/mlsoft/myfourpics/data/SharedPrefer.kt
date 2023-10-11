package uz.mlsoft.myfourpics.data

import android.content.Context
import android.content.SharedPreferences

class SharedPrefer private constructor(context: Context) {

    private val SHARED_PREF = "shared_pref"
    private val CURRENT_POSITION = "current_position"
    private val CASH = "cash"


    private val sharedPreference: SharedPreferences =
        context.getSharedPreferences(SHARED_PREF, Context.MODE_PRIVATE)

    private val editor: SharedPreferences.Editor = sharedPreference.edit()

    var currentPosition: Int
        set(value) = editor.putInt(CURRENT_POSITION, value).apply()
        get() = sharedPreference.getInt(CURRENT_POSITION, 0)

    var cash: Int
        get() = sharedPreference.getInt(CASH, 100)
        set(value) = editor.putInt(CASH,value).apply()

    companion object {
        private lateinit var instance: SharedPrefer

        fun init(context: Context) {
            instance = SharedPrefer(context)
        }

        fun getInstance() = instance
    }
}