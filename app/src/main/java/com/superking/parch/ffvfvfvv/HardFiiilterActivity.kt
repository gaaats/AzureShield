package com.superking.parch.ffvfvfvv

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.superking.parch.ffffff.VeeebbbViiieeevActivity
import com.superking.parch.frrffrfr.AppplicaationClasa.Companion.bggbhnnhnh
import com.superking.parch.frrffrfr.AppplicaationClasa.Companion.juujjujugff
import com.superking.parch.frrffrfr.AppplicaationClasa.Companion.appsCheckfrr6
import com.superking.parch.frrffrfr.AppplicaationClasa.Companion.bgbhhuju
import com.superking.parch.frrffrfr.AppplicaationClasa.Companion.geomeogtgt
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import com.orhanobut.hawk.Hawk
import com.superking.parch.databinding.ActivityHardFiiilterBinding
import com.superking.parch.deddeeded.GammmiActivity


class HardFiiilterActivity : AppCompatActivity() {



    private fun bgbgbgbgbgh() {
        val bhnhnhhnnnbnb = Intent(this@HardFiiilterActivity, VeeebbbViiieeevActivity::class.java)
        Hawk.put(geomeogtgt, null)
        Hawk.put(bgbhhuju, null)
        Hawk.put(appsCheckfrr6, null)
        startActivity(bhnhnhhnnnbnb)
        finish()
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        gtgtgt = ActivityHardFiiilterBinding.inflate(layoutInflater)
        setContentView(gtgtgt.root)

        val vbvbvvbv: String? = Hawk.get(appsCheckfrr6, "null")

        if (vbvbvvbv == "1") {
            AppsFlyerLib.getInstance()
                .init("JcdHsLouyKzc3snauYSqVb", ggggg, applicationContext)
            AppsFlyerLib.getInstance().start(this)
        }

        vbvvbbv()

    }


    private fun ggggg() {
        val yuytrrd = Intent(this@HardFiiilterActivity, GammmiActivity::class.java)
        Hawk.put(geomeogtgt, null)
        Hawk.put(bgbhhuju, null)
        Hawk.put(appsCheckfrr6, null)
        startActivity(yuytrrd)
        finish()
    }

    private val ggggg = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(data: MutableMap<String, Any>?) {
            val hklotgrf = data?.get("campaign").toString()
            Hawk.put(bggbhnnhnh, hklotgrf)
        }
        override fun onConversionDataFail(p0: String?) {}
        override fun onAppOpenAttribution(p0: MutableMap<String, String>?) {}
        override fun onAttributionFailure(p0: String?) {}
    }


    private fun vbvvbbv() {

        val huikikikik: String = Hawk.get(geomeogtgt)
        val cvcvcv: String = Hawk.get(bgbhhuju, "null")
        val vffvfgggg: String? = Hawk.get(appsCheckfrr6, "null")
        var hyujjujukikik: String? = Hawk.get(bggbhnnhnh)
        val nnhnhnhnhnh: String? = Hawk.get(juujjujugff, "null")


        if (vffvfgggg == "1") {


            val gfgfgfgf = Executors.newSingleThreadScheduledExecutor()
            gfgfgfgf.scheduleAtFixedRate({
                if (hyujjujukikik != null) {

                    if (hyujjujukikik!!.contains("tdb2") || huikikikik.contains(cvcvcv) || nnhnhnhnhnh!!.contains("tdb2")) {
                        gfgfgfgf.shutdown()
                        bgbgbgbgbgh()
                    } else {
                        gfgfgfgf.shutdown()
                        ggggg()

                    }
                } else {
                    hyujjujukikik = Hawk.get(bggbhnnhnh)

                }
            }, 0, 1, TimeUnit.SECONDS)
        }  else if (huikikikik.contains(cvcvcv)) {

            bgbgbgbgbgh()
        } else {

            ggggg()
        }

    }

    lateinit var gtgtgt: ActivityHardFiiilterBinding

}