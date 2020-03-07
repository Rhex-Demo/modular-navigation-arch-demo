package com.rhexgomez.demo.authnavigationarch

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_issue.*

class IssueFragment : Fragment(R.layout.fragment_issue) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        close.setOnClickListener {
            requireActivity().onBackPressedDispatcher.onBackPressed()
        }
    }
}