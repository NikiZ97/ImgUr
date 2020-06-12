package com.nikiz.imgur.ui.fragment.auth

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.snackbar.Snackbar
import com.nikiz.imgur.R
import com.nikiz.imgur.extensions.animateWithScaling
import kotlinx.android.synthetic.main.greeting_fragment.*

class GreetingFragment : Fragment() {

    companion object {
        fun newInstance() = GreetingFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.greeting_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        skipAuthorization.setOnClickListener {
            it.animateWithScaling(Runnable {
                Snackbar.make(greetingRoot, "Test", Snackbar.LENGTH_SHORT).show()
            })
        }
    }
}