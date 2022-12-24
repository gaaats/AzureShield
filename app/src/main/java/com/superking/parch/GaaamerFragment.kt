package com.superking.parch

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.superking.parch.databinding.FragmentGaaamerBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.random.Random


class GaaamerFragment : Fragment() {

    var damage = 0
    val sumGamage = 100

    private var gaaamerBinding: FragmentGaaamerBinding? = null
    private val gaaamerBinding1
        get() = gaaamerBinding ?: throw RuntimeException("FragmentGaaamerBinding = null")

    private val liiist by lazy {
        listOf(
            gaaamerBinding1.imgDovn,
            gaaamerBinding1.imgRight,
            gaaamerBinding1.imgLeft,
            gaaamerBinding1.imgRight,
        ).shuffled()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        gaaamerBinding = FragmentGaaamerBinding.inflate(inflater, container, false)
        return gaaamerBinding1.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            eachTiiiime()

            val novv = liiist.random()
            novv.visibility = View.VISIBLE
            novv.isEnabled = true




            gaaamerBinding1.imgDovn.setOnClickListener {

                lifecycleScope.launch {
                    gaaamerBinding1.imgDovn.isEnabled = false
                    if (damage == sumGamage) {
                        gaaamerBinding1.imgDovn.isEnabled = true
                        findNavController().navigate(R.id.action_gaaamerFragment_to_reeeeeloadFragment)
                        return@launch
                    }
                    hjyhyjhjyihyji()
                    gaaamerBinding1.progBarHalth.progress = damage
                    gaaamerBinding1.imgDovn.isEnabled = true

                    delay(100)
                    raaandom()
                }
            }

            gaaamerBinding1.imgTop.setOnClickListener {
                lifecycleScope.launch {
                    gaaamerBinding1.imgTop.isEnabled = false
                    if (damage == sumGamage) {
                        gaaamerBinding1.imgTop.isEnabled = true
                        findNavController().navigate(R.id.action_gaaamerFragment_to_reeeeeloadFragment)
                        return@launch
                    }
                    hjyhyjhjyihyji()
                    gaaamerBinding1.progBarHalth.progress = damage
                    gaaamerBinding1.imgTop.isEnabled = true

                    delay(100)
                    raaandom()
                }
            }

            gaaamerBinding1.imgLeft.setOnClickListener {
                lifecycleScope.launch {
                    gaaamerBinding1.imgLeft.isEnabled = false
                    if (damage == sumGamage) {
                        gaaamerBinding1.imgLeft.isEnabled = true
                        findNavController().navigate(R.id.action_gaaamerFragment_to_reeeeeloadFragment)
                        return@launch
                    }
                    hjyhyjhjyihyji()
                    gaaamerBinding1.progBarHalth.progress = damage
                    gaaamerBinding1.imgLeft.isEnabled = true

                    delay(100)
                    raaandom()
                }
            }

            gaaamerBinding1.imgRight.setOnClickListener {
                lifecycleScope.launch {
                    gaaamerBinding1.imgRight.isEnabled = false
                    if (damage == sumGamage) {
                        gaaamerBinding1.imgRight.isEnabled = true
                        findNavController().navigate(R.id.action_gaaamerFragment_to_reeeeeloadFragment)
                        return@launch
                    }
                    hjyhyjhjyihyji()
                    gaaamerBinding1.progBarHalth.progress = damage
                    gaaamerBinding1.imgRight.isEnabled = true

                    delay(100)
                    raaandom()
                }
            }


        } catch (e: Exception) {
            vfvvf()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    private fun eachTiiiime() {
        gaaamerBinding1.imgLeft.visibility = View.INVISIBLE
        gaaamerBinding1.imgLeft.isEnabled = false

        gaaamerBinding1.imgRight.visibility = View.INVISIBLE
        gaaamerBinding1.imgRight.isEnabled = false

        gaaamerBinding1.imgTop.visibility = View.INVISIBLE
        gaaamerBinding1.imgTop.isEnabled = false

        gaaamerBinding1.imgDovn.visibility = View.INVISIBLE
        gaaamerBinding1.imgDovn.isEnabled = false
    }

    private fun raaandom() {
        eachTiiiime()

        val rrrr = liiist.random()
        rrrr.visibility = View.VISIBLE
        rrrr.isEnabled = true

    }

    private fun hjyhyjhjyihyji() {
        damage += 1
    }


    override fun onPause() {
        onDestroy()
        super.onPause()
    }

    override fun onDestroy() {
        gaaamerBinding = null
        super.onDestroy()
    }

    private fun vfvvf() {
        Snackbar.make(
            gaaamerBinding1.root,
            "Some error...",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }
}