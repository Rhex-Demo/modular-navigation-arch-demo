package com.rhexgomez.demo.dashboard

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_dashboard.*

class DashboardFragment : Fragment(R.layout.fragment_dashboard) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        button.setOnClickListener {
            findNavController().navigate(DashboardFragmentDirections.actionOpenSecondFragment())
        }
    }

}