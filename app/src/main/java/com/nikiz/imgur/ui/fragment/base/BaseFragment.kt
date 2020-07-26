package com.nikiz.imgur.ui.fragment.base

import android.os.Bundle
import androidx.fragment.app.Fragment

abstract class BaseFragment(resId: Int): Fragment(resId) {

    abstract fun subscribeUi()

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        subscribeUi()
    }
}