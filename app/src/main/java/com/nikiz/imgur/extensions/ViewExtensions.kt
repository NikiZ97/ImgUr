package com.nikiz.imgur.extensions

import android.view.View

fun View.animateWithScaling(action: Runnable) {
    animate().setDuration(100).scaleX(0.9f).scaleY(0.9f).withEndAction {
        animate().setDuration(100).scaleX(1f).scaleY(1f).withEndAction(action)
    }
}