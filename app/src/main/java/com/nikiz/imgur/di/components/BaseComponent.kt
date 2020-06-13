package com.nikiz.imgur.di.components

import com.nikiz.imgur.di.modules.ContextModule
import dagger.Component

@Component(modules = [ContextModule::class])
interface BaseComponent {

}