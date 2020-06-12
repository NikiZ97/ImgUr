package com.nikiz.imgur.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import androidx.core.content.ContextCompat
import com.nikiz.imgur.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setStatusBar()
    }

    private fun setStatusBar() {
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.statusBarColor = ContextCompat.getColor(this, R.color.colorWhite)
    }
}