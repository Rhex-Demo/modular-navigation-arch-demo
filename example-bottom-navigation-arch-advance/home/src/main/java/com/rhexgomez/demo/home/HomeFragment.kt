package com.rhexgomez.demo.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment(R.layout.fragment_home) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        button.setOnClickListener {
            findNavController().navigate(HomeFragmentDirections.actionOpenSecondFragment())
        }
    }
}