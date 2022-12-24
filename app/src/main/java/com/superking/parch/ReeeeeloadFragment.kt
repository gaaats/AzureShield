package com.superking.parch

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.superking.parch.databinding.FragmentReeeeeloadBinding
import kotlinx.coroutines.delay
import kotlin.random.Random


class ReeeeeloadFragment : Fragment() {
    private var fragmentReeeeeloadBinding: FragmentReeeeeloadBinding? = null
    private val binding get() = fragmentReeeeeloadBinding ?: throw RuntimeException("FragmentReeeeeloadBinding = null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentReeeeeloadBinding = FragmentReeeeeloadBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {
            val kiijkjukuj = Random.nextInt(from = 100, until = 5000)
            jkkjkoo(kiijkjukuj)

            jukujkjukujk()


        } catch (e: Exception) {
            vfvvf()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    private fun jukujkjukujk() {
        lifecycleScope.launchWhenCreated {
            delay(1900)
            findNavController().navigate(R.id.action_reeeeeloadFragment_to_launchhhhFragment)
        }
    }

    override fun onPause() {
        onDestroy()
        super.onPause()
    }

    override fun onDestroy() {
        fragmentReeeeeloadBinding = null
        super.onDestroy()
    }

    private fun vfvvf() {
        Snackbar.make(
            binding.root,
            "Some error...",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }


    private fun jkkjkoo(currentPoint: Int) {
        Snackbar.make(
            binding.root,
            "You recived $currentPoint points",
            Snackbar.LENGTH_LONG
        ).show()
    }


}