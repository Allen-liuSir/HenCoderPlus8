package com.example.core

import android.app.Application
import android.content.Context

class BaseApplication : Application() {

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        application = this
    }

    companion object {
        lateinit var application: Context
            private set
    }
}