package com.rhexgomez.demo.authnavigationarch

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_log_in.*

class LogInFragment : Fragment(R.layout.fragment_log_in) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        register.setOnClickListener {
            findNavController().navigate(LogInFragmentDirections.actionOpenRegistration())
        }

        next.setOnClickListener {
            if (username.text!!.isNotEmpty() && password.text!!.isNotEmpty())
                findNavController().navigate(LogInFragmentDirections.actionGotoHome())
            else
                findNavController().navigate(LogInFragmentDirections.actionShowError())
        }
    }
}