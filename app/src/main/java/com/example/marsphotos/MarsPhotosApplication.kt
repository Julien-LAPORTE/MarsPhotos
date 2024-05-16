package com.example.marsphotos

import android.app.Application
import com.example.marsphotos.di.AppContainer
import com.example.marsphotos.di.DefaultAppContainer

class MarsPhotosApplication: Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}