package com.hanfeng.digitalself

import com.google.android.play.core.splitcompat.SplitCompatApplication
import timber.log.Timber

class DigitalSelfApp : SplitCompatApplication() {

    override fun onCreate() {
        super.onCreate()
        initTimber()
    }

    /**
     * Initialize log library Timber only on debug build.
     */
    private fun initTimber() {
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}