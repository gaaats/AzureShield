package com.superking.parch.frrffrfr

import android.app.Application
import com.onesignal.OneSignal
import com.orhanobut.hawk.Hawk

class AppplicaationClasa:Application() {

    override fun onCreate() {
        super.onCreate()
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)

        OneSignal.initWithContext(this)
        OneSignal.setAppId(sfrgtftrgt)
        Hawk.init(this).build()
    }


    companion object {
        const val sfrgtftrgt = "abbafc73-f049-445b-a8f3-9de3d74a2f58"
        var appsCheckfrr6 = "appsChecker"
        var hyhyhyhyhy: String? = "mainid"
        var juujjujugff: String? = "d11"
        var bgbhhuju: String? = "countryCode"
        var geomeogtgt = "geo"
        var bggbhnnhnh: String? = "c11"
        var s = "link"


    }


}
