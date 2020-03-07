package com.rhexgomez.demo.authnavigationarch

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_register.*

class RegistrationFragment : Fragment(R.layout.fragment_register) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        next.setOnClickListener {
            findNavController().navigate(RegistrationFragmentDirections.actionGotoHome())
        }
    }

}