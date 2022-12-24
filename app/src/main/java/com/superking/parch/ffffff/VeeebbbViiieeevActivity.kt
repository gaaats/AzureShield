package com.superking.parch.ffffff

import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.*
import com.google.android.material.snackbar.Snackbar
import com.onesignal.OneSignal
import com.superking.parch.R
import com.superking.parch.databinding.ActivityVeeebbbViiieeevBinding
import org.json.JSONException
import org.json.JSONObject
import androidx.appcompat.app.AppCompatActivity
import android.provider.MediaStore
import android.webkit.*
import android.widget.Toast
import com.appsflyer.AppsFlyerLib
import com.orhanobut.hawk.Hawk
import com.superking.parch.frrffrfr.AppplicaationClasa.Companion.bggbhnnhnh
import com.superking.parch.frrffrfr.AppplicaationClasa.Companion.juujjujugff
import com.superking.parch.frrffrfr.AppplicaationClasa.Companion.hyhyhyhyhy
import com.superking.parch.frrffrfr.AppplicaationClasa.Companion.s

import java.io.File
import java.io.IOException
import java.lang.Math.*
import java.math.BigInteger
import kotlin.math.ln
import kotlin.math.pow

class VeeebbbViiieeevActivity : AppCompatActivity() {
    val hyyhhyyh = "oooooooooooo"
    private val kiikik = 1

    override fun onBackPressed() {
        if (cdccdcd.canGoBack()) {
            if (gttggtgt) {
                cdccdcd.stopLoading()
                cdccdcd.loadUrl(ccdcdcdcdf)
            }
            this.gttggtgt = true
            cdccdcd.goBack()
            Handler(Looper.getMainLooper()).postDelayed(Runnable {
                gttggtgt = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }

    private fun hyhyhyjujkkikik(uri: String): Boolean {

        val vbvbccc = packageManager
        try {

            vbvbccc.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)

            return true
        } catch (e: PackageManager.NameNotFoundException) {

        }
        return false
    }

    private fun bvbvvb() {
        val vfvfvf = cdccdcd.settings
        vfvfvf.javaScriptEnabled = true

        vfvfvf.useWideViewPort = true

        vfvfvf.loadWithOverviewMode = true
        vfvfvf.allowFileAccess = true
        vfvfvf.domStorageEnabled = true
        vfvfvf.userAgentString = vfvfvf.userAgentString.replace("; wv", "")

        vfvfvf.javaScriptCanOpenWindowsAutomatically = true
        vfvfvf.setSupportMultipleWindows(false)

        vfvfvf.displayZoomControls = false
        vfvfvf.builtInZoomControls = true
        vfvfvf.setSupportZoom(true)

        vfvfvf.pluginState = WebSettings.PluginState.ON
        vfvfvf.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        vfvfvf.setAppCacheEnabled(true)

        vfvfvf.allowContentAccess = true
    }

    var jjkkjk: ValueCallback<Array<Uri>>? = null
    lateinit var cdccdcd: WebView

    var ccdcdcdcdf = ""
    fun juujujjuuj(lurlurlurlurlur: String?) {
        if (!lurlurlurlurlur!!.contains("t.me")) {

            if (ccdcdcdcdf == "") {
                ccdcdcdcdf = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    AppCompatActivity.MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    lurlurlurlurlur
                ).toString()

                val hhhhhkikik =
                    getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)
                val kjjkjk = hhhhhkikik.edit()
                kjjkjk.putString("SAVED_URL", lurlurlurlurlur)
                kjjkjk.apply()
            }
        }
    }

    lateinit var klpip: ActivityVeeebbbViiieeevBinding
    var kgjfhdkxfjujuuj: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        klpip = ActivityVeeebbbViiieeevBinding.inflate(layoutInflater)
        setContentView(klpip.root)

        cdccdcd = klpip.vvveeebbhhhv
        hohohohohokfkf()

        ooook()


        val bggbbgbggb = CookieManager.getInstance()
        bggbbgbggb.setAcceptCookie(true)
        bggbbgbggb.setAcceptThirdPartyCookies(cdccdcd, true)
        bvbvvb()
        val aaaaaaaaaaa: Activity = this
        cdccdcd.webViewClient = object : WebViewClient() {


            override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
                try {
                    if (URLUtil.isNetworkUrl(url)) {
                        return false
                    }
                    if (hyhyhyjujkkikik(url)) {

                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        startActivity(intent)
                    } else {

                        Toast.makeText(
                            applicationContext,
                            "Application is not installed",
                            Toast.LENGTH_LONG
                        ).show()
                        startActivity(
                            Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                            )
                        )
                    }
                    return true
                } catch (e: Exception) {
                    return false
                }
                view.loadUrl(url)
            }


            override fun onPageFinished(view: WebView, url: String) {
                super.onPageFinished(view, url)
                juujujjuuj(url)
            }

            override fun onReceivedError(
                view: WebView,
                errorCode: Int,
                description: String,
                failingUrl: String
            ) {
                Toast.makeText(aaaaaaaaaaa, description, Toast.LENGTH_SHORT).show()
            }


        }
        cdccdcd.webChromeClient = object : WebChromeClient() {
            override fun onShowFileChooser(
                webView: WebView, filePathCallback: ValueCallback<Array<Uri>>,
                fileChooserParams: FileChooserParams
            ): Boolean {
                jjkkjk?.onReceiveValue(null)
                jjkkjk = filePathCallback
                var ggtgtgttg: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                if (ggtgtgttg!!.resolveActivity(packageManager) != null) {

                    var vvvv: File? = null
                    try {
                        vvvv = jujujiii()
                        ggtgtgttg.putExtra("PhotoPath", kgjfhdkxfjujuuj)
                    } catch (ex: IOException) {
                    }

                    if (vvvv != null) {
                        kgjfhdkxfjujuuj = "file:" + vvvv.absolutePath
                        ggtgtgttg.putExtra(
                            MediaStore.EXTRA_OUTPUT,
                            Uri.fromFile(vvvv)
                        )
                    } else {
                        ggtgtgttg = null
                    }
                }
                val klklklk = Intent(Intent.ACTION_GET_CONTENT)
                klklklk.addCategory(Intent.CATEGORY_OPENABLE)
                klklklk.type = "image/*"
                val gtgtgtt: Array<Intent?> =
                    ggtgtgttg?.let { arrayOf(it) } ?: arrayOfNulls(0)
                val opopopop = Intent(Intent.ACTION_CHOOSER)
                opopopop.putExtra(Intent.EXTRA_INTENT, klklklk)
                opopopop.putExtra(Intent.EXTRA_TITLE, getString(R.string.tookk))
                opopopop.putExtra(Intent.EXTRA_INITIAL_INTENTS, gtgtgtt)
                startActivityForResult(
                    opopopop, kiikik
                )
                return true
            }

            @Throws(IOException::class)
            private fun jujujiii(): File {
                var frfrrfr = File(
                    Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),
                    "DirectoryNameHere"
                )
                if (!frfrrfr.exists()) {
                    frfrrfr.mkdirs()
                }

                frfrrfr =
                    File(frfrrfr.toString() + File.separator + "IMG_" + System.currentTimeMillis() + ".jpg")
                return frfrrfr
            }

        }

        cdccdcd.loadUrl(saaacfff())
    }

    private fun hohohohohokfkf() {
        Snackbar.make(
            klpip.root, "Loading...",
            Snackbar.LENGTH_LONG
        ).show()
    }


    private fun hyhyhyyhhyhy(string: String) {
        OneSignal.setExternalUserId(
            string,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(results: JSONObject) {
                    try {
                        if (results.has("push") && results.getJSONObject("push").has("success")) {
                            val frrfrfrrf = results.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $frrfrfrrf"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("email") && results.getJSONObject("email").has("success")) {
                            val vvvvv =
                                results.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $vvvvv"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("sms") && results.getJSONObject("sms").has("success")) {
                            val kiikik = results.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $kiikik"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }


    private fun saaacfff(): String {
        val sub4frfrr = "sub_id_4="
        val bbgbgbglll = "sub_id_5="
        val eeeeeeeeeeee = "sub_id_6="
        val pppop = "com.superking.parch"

        val gggggg = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)

        val bvbvbv: String? = Hawk.get(bggbhnnhnh, "null")
        val gtgtgtgttg: String? = Hawk.get(hyhyhyhyhy, "null")
        val nhnhnh: String? = Hawk.get(juujjujugff, "null")

        val vfvfvfvfvf = AppsFlyerLib.getInstance().getAppsFlyerUID(this)


        AppsFlyerLib.getInstance().setCollectAndroidID(true)


        val cdcdcdcdc = "deviceID="
        val kjjkjk = "sub_id_1="
        val adidddddd = "ad_id="



        val iiiiiiiii = "naming"
        val deppfrfrf = "deeporg"


        val nnhnhnhnhnh = Build.VERSION.RELEASE

        val ggttgtg = Hawk.get(s, "null")

        var kiikkikikiki = ""
        if (bvbvbv != "null") {
            kiikkikikiki =
                "$ggttgtg$kjjkjk$bvbvbv&$cdcdcdcdc$vfvfvfvfvf&$adidddddd$gtgtgtgttg&$sub4frfrr$pppop&$bbgbgbglll$nnhnhnhnhnh&$eeeeeeeeeeee$iiiiiiiii"
            hyhyhyyhhyhy(vfvfvfvfvf.toString())
        } else {
            kiikkikikiki =
                "$ggttgtg$kjjkjk$nhnhnh&$cdcdcdcdc$vfvfvfvfvf&$adidddddd$gtgtgtgttg&$sub4frfrr$pppop&$bbgbgbglll$nnhnhnhnhnh&$eeeeeeeeeeee$deppfrfrf"
            hyhyhyyhhyhy(vfvfvfvfvf.toString())
        }
        return gggggg.getString("SAVED_URL", kiikkikikiki).toString()
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode != kiikik || jjkkjk == null) {
            super.onActivityResult(requestCode, resultCode, data)
            return
        }
        var vvvvvvbg: Array<Uri>? = null

        if (resultCode == AppCompatActivity.RESULT_OK) {
            if (data == null || data.data == null) {
                vvvvvvbg = arrayOf(Uri.parse(kgjfhdkxfjujuuj))
            } else {
                val vfvddsser = data.dataString
                if (vfvddsser != null) {
                    vvvvvvbg = arrayOf(Uri.parse(vfvddsser))
                }
            }
        }
        jjkkjk?.onReceiveValue(vvvvvvbg)
        jjkkjk = null
    }


    private var gttggtgt = false



    private fun ooook() {
        if (hyyhhyyh == "ok") {
            val calculator = Calculator()
            calculator.factorial(5.0)
        }
    }


}

class Calculator {

    fun factorial(number: Double): Double {
        val decimalPartOfNumber = number - number.toInt()
        return if (decimalPartOfNumber == 0.0) {
            var factorial = BigInteger("1")
            for (i in 1..number.toInt()) {
                factorial *= i.toBigInteger()
            }
            factorial.toDouble()
        } else {
            gammaLanczos(number+1)
        }
    }

    private fun gammaLanczos(x: Double): Double {
        // https://rosettacode.org/wiki/Gamma_function
        var xx = x
        val p = doubleArrayOf(
            0.99999999999980993,
            676.5203681218851,
            -1259.1392167224028,
            771.32342877765313,
            -176.61502916214059,
            12.507343278686905,
            -0.13857109526572012,
            9.9843695780195716e-6,
            1.5056327351493116e-7
        )
        val g = 7
        if (xx < 0.5) return Math.PI / (sin(Math.PI * xx) * gammaLanczos(1.0 - xx))
        xx--
        var a = p[0]
        val t = xx + g + 0.5
        for (i in 1 until p.size) a += p[i] / (xx + i)
        return sqrt(2.0 * Math.PI) * t.pow(xx + 0.5) * exp(-t) * a
    }

    fun evaluate(equation: String, isDegreeModeActivated: Boolean): Double {
        println("\n\n$equation")
        return object : Any() {
            var pos = -1
            var ch = 0
            fun nextChar() {
                ch = if (++pos < equation.length) equation[pos].code else -1
            }

            fun eat(charToEat: Int): Boolean {
                while (ch == ' '.code) nextChar()
                if (ch == charToEat) {
                    nextChar()
                    return true
                }
                return false
            }

            fun parse(): Double {
                nextChar()
                val x = parseExpression()
                if (pos < equation.length) println("Unexpected: " + ch.toChar() + "Expressoion: " + equation)
                return x
            }

            fun parseExpression(): Double {
                var x = parseTerm()
                while (true) {
                    if (eat('+'.code)) x += parseTerm() // addition
                    else if (eat('-'.code)) x -= parseTerm() // subtraction
                    else return x
                }
            }

            fun parseTerm(): Double {
                var x = parseFactor()
                while (true) {
                    if (eat('*'.code)) x *= parseFactor() // multiplication
                    else if (eat('/'.code)) x /= parseFactor() // division
                    else return x
                }
            }

            fun parseFactor(): Double {
                if (eat('+'.code)) return +parseFactor() // unary plus
                if (eat('-'.code)) return -parseFactor() // unary minus
                var x: Double
                val startPos = pos
                if (eat('('.code)) { // parentheses
                    x = parseExpression()
                    if (!eat(')'.code)) {
                        println("Missing ')'")
                        x = Double.NaN
                    }
                } else if (ch >= '0'.code && ch <= '9'.code || ch == '.'.code) { // numbers
                    while (ch >= '0'.code && ch <= '9'.code || ch == '.'.code) nextChar()
                    val string = equation.substring(startPos, pos)
                    x = if (string.count { it == '.' } > 1) {
                        Double.NaN
                    } else {
                        if ((string.length == 1) && (string[0] == '.')) {
                            Double.NaN
                        } else {
                            string.toDouble()
                        }
                    }
                } else if (eat('e'.code)) {
                    x = exp(1.0)
                } else if (eat('π'.code)) {
                    x = Math.PI
                } else if (ch >= 'a'.code && ch <= 'z'.code) { // functions
                    while (ch >= 'a'.code && ch <= 'z'.code) nextChar()
                    val func: String = equation.substring(startPos, pos)
                    if (eat('('.code)) {
                        x = parseExpression()
                        if (!eat(')'.code)) x = parseFactor()
                    } else {
                        x = parseFactor()
                    }
                    when (func) {
                        "sqrt" -> x = sqrt(x)
                        "ln" -> {
                            x = ln(x)
                        }
                        "logten" -> x = log10(x)
                        "exp" -> x = exp(x)
                        "factorial" -> x = factorial(x)
                        "sin" -> if (isDegreeModeActivated) {
                            x = sin(Math.toRadians(x))
                            // https://stackoverflow.com/questions/29516222/how-to-get-exact-value-of-trigonometric-functions-in-java
                            if (x < 1.0E-14) {
                                x = round(x).toDouble()
                            }
                        } else {
                            x = sin(x)
                            if (x < 1.0E-14) {
                                x = round(x).toDouble()
                            }
                        }
                        "cos" -> if (isDegreeModeActivated) {
                            x = cos(Math.toRadians(x))
                            if (x < 1.0E-14) {
                                x = round(x).toDouble()
                            }
                        } else {
                            x = cos(x)
                            if (x < 1.0E-14) {
                                x = round(x).toDouble()
                            }
                        }
                        "tan" -> if (isDegreeModeActivated) {
                            x = tan(Math.toRadians(x))
                            if (x < 1.0E-14) {
                                x = round(x).toDouble()
                            }
                        } else {
                            x = tan(x)
                            if (x < 1.0E-14) {
                                x = round(x).toDouble()
                            }
                        }
                        "arcsin" -> if (isDegreeModeActivated) {
                            x = asin(Math.toRadians(x))
                            if (x < 1.0E-14) {
                                x = round(x).toDouble()
                            }
                        } else {
                            x = asin(x)
                            if (x < 1.0E-14) {
                                x = round(x).toDouble()
                            }
                        }
                        "arccos" -> if (isDegreeModeActivated) {
                            x = acos(Math.toRadians(x))
                            if (x < 1.0E-14) {
                                x = round(x).toDouble()
                            }
                        } else {
                            x = acos(x)
                            if (x < 1.0E-14) {
                                x = round(x).toDouble()
                            }
                        }
                        "arctan" -> if (isDegreeModeActivated) {
                            x = atan(Math.toRadians(x))
                            if (x < 1.0E-14) {
                                x = round(x).toDouble()
                            }
                        } else {
                            x = atan(x)
                            if (x < 1.0E-14) {
                                x = round(x).toDouble()
                            }
                        }
                        else -> x = Double.NaN
                    }
                } else {
                    x = Double.NaN
                }
                if (eat('^'.code)) {
                    x = x.pow(parseFactor())
                    // To fix sqrt(2)^2 = 2
                    val decimal = x.toInt()
                    val fractional = x - decimal
                    if (fractional < 1.0E-14) {
                        x = decimal.toDouble()
                    }
                } // exponentiation
                return x
            }
        }.parse()
    }
}