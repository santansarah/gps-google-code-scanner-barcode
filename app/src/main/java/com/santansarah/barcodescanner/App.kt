package com.santansarah.barcodescanner

import android.app.Application
import android.util.Log
import coil.ImageLoader
import coil.ImageLoaderFactory
import com.santansarah.barcodescanner.utils.logging.DebugTree
import com.santansarah.barcodescanner.utils.logging.ReleaseTree
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp
class App : Application(), ImageLoaderFactory {

    override fun newImageLoader(): ImageLoader {
        Timber.tag("test").d("i am called")
        return ImageLoader.Builder(this)
            .crossfade(true)
            .build()
    }

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(DebugTree())
        } else
            Timber.plant(ReleaseTree())

    }


}