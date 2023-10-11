package uz.mlsoft.myfourpics.app

import android.app.Application
import uz.mlsoft.myfourpics.data.SharedPrefer

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        SharedPrefer.init(this)
    }
}