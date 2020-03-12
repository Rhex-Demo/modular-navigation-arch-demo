package com.rhexgomez.demo.bottomnavigationbasic.ui.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.rhexgomez.demo.bottomnavigationbasic.R
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment(R.layout.fragment_home) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        button.setOnClickListener {
            findNavController().navigate(HomeFragmentDirections.actionOpenSecondFragment())
        }
    }
}