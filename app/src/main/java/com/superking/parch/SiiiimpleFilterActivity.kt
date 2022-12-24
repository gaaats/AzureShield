package com.superking.parch

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.orhanobut.hawk.Hawk
import com.superking.parch.deddeeded.GammmiActivity
import com.superking.parch.ffvfvfvv.HardFiiilterActivity
import com.superking.parch.frrffrfr.AppplicaationClasa
import com.superking.parch.frrffrfr.AppplicaationClasa.Companion.hyhyhyhyhy
import com.superking.parch.frrffrfr.AppplicaationClasa.Companion.appsCheckfrr6
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class SiiiimpleFilterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_siiiimple_filter)
        checkCountryfrfrfrr()
    }


    private fun checkCountryfrfrfrr() {

        val checkfrrrf = ftgthyggt()

        if (checkfrrrf == "0") {
            intALonehyhyyfrrf()

        } else {
            GlobalScope.launch(Dispatchers.Default) {
                gtgtgttgfgfrrf()
            }
            afbftgttgtgtttgtgt()
        }
    }



    private fun ftgthyggt(): String? {
        val restCheckftgtgtgtt: String? = Hawk.get(appsCheckfrr6)
        return restCheckftgtgtgtt
    }


    private fun intALonehyhyyfrrf() {
        val ddede = Intent(this@SiiiimpleFilterActivity, GammmiActivity::class.java)
        Hawk.put(AppplicaationClasa.geomeogtgt, null)
        Hawk.put(AppplicaationClasa.bgbhhuju, null)
        Hawk.put(AppplicaationClasa.appsCheckfrr6, null)
        startActivity(ddede)
        finish()
    }

    private fun gtgtgttgfgfrrf() {
        val idClient = AdvertisingIdClient(applicationContext)
        idClient.start()
        val infofrrrf = idClient.info.id
        Hawk.put(hyhyhyhyhy, infofrrrf)
    }

    private fun afbftgttgtgtttgtgt() {
        val ghyyhyhhy = Intent(this@SiiiimpleFilterActivity, HardFiiilterActivity::class.java)
        startActivity(ghyyhyhhy)
        finish()
    }

}