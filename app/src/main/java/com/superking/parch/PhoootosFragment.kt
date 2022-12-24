package com.superking.parch

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar
import com.superking.parch.databinding.FragmentPhoootosBinding
import com.superking.parch.fffrag.AdapterPager


class PhoootosFragment : Fragment() {

    private fun imgForPager(): List<Int> {
        return listOf(
            R.drawable.m1,
            R.drawable.m2,
            R.drawable.m3,
            )
    }

    private var fragmentPhoootosBinding: FragmentPhoootosBinding? = null
    private val phoootosBinding get() = fragmentPhoootosBinding ?: throw RuntimeException("FragmentPhoootosBinding = null")

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {
            phoootosBinding.btnImgExit.setOnClickListener {
                alertDialogForExit()
            }
            phoootosBinding.btnImgExit.setOnClickListener {
                requireActivity().onBackPressed()
            }

            val listOfImages = imgForPager()
            val pagerAdapter = AdapterPager(listOfImages)
            phoootosBinding.pager.adapter = pagerAdapter
            phoootosBinding.circleIndicatorPhotoGalery.setViewPager(phoootosBinding.pager)


        } catch (e: Exception) {
            barError()
        }

        super.onViewCreated(view, savedInstanceState)
    }


    private fun barError() {
        Snackbar.make(
            phoootosBinding.root,
            "There is some error, try again",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    private fun alertDialogForExit() {
        AlertDialog.Builder(requireContext())
            .setTitle("Exit")
            .setMessage("Are you definitely want to log out, the current data will not be saved?")
            .setPositiveButton("Yes, Exit") { _, _ ->
                requireActivity().onBackPressed()
            }
            .setNegativeButton("Deny") { _, _ ->
            }
            .setCancelable(true)
            .create()
            .show()
    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentPhoootosBinding = FragmentPhoootosBinding.inflate(inflater, container, false)
        return phoootosBinding.root
    }
}