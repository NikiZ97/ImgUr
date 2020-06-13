package com.nikiz.imgur

import android.app.Application
import com.nikiz.imgur.di.components.BaseComponent
import com.nikiz.imgur.di.components.DaggerBaseComponent
import com.nikiz.imgur.di.modules.ContextModule

class App: Application() {

    companion object {
        lateinit var baseComponent: BaseComponent
    }

    override fun onCreate() {
        super.onCreate()
        baseComponent = DaggerBaseComponent.builder()
            .contextModule(ContextModule(applicationContext))
            .build()
    }
}