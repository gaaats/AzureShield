package com.superking.parch

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.superking.parch.databinding.FragmentLaunchhhhBinding


class LaunchhhhFragment : Fragment() {

    private fun initClickFrfr() {
        jkiikikik.easy.setOnClickListener {
            initAlertDialog("easy")
        }
        jkiikikik.normal.setOnClickListener {
            initAlertDialog("normal")
        }
        jkiikikik.hard.setOnClickListener {
            initAlertDialog("hard")
        }
        jkiikikik.superman.setOnClickListener {
            initAlertDialog("superman")
        }
        jkiikikik.imgPhotos.setOnClickListener {
            findNavController().navigate(R.id.action_launchhhhFragment_to_phoootosFragment)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        nnhmknhmnhmnh = FragmentLaunchhhhBinding.inflate(inflater, container, false)
        return jkiikikik.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            initClickFrfr()

        } catch (e: Exception) {
            juujujjuuj()
        }


        super.onViewCreated(view, savedInstanceState)
    }


    override fun onDestroy() {
        nnhmknhmnhmnh = null
        super.onDestroy()
    }

    private fun juujujjuuj() {
        Snackbar.make(
            jkiikikik.root,
            "Error 111...",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    private fun initAlertDialog(text: String) {
        AlertDialog.Builder(requireContext())
            .setTitle("Start game")
            .setMessage("It is $text level. Start game?")
            .setPositiveButton("Yes, start") { _, _ ->
                findNavController().navigate(R.id.action_launchhhhFragment_to_gaaamerFragment)
            }
            .setNegativeButton("Deny") { _, _ ->
            }
            .setCancelable(true)
            .create()
            .show()
    }


    private var nnhmknhmnhmnh: FragmentLaunchhhhBinding? = null
    private val jkiikikik get() = nnhmknhmnhmnh ?: throw RuntimeException("FragmentLaunchhhhBinding = null")


}