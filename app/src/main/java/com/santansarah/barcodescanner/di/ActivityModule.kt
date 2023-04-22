package com.santansarah.barcodescanner.di

import android.content.Context
import androidx.activity.ComponentActivity
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ActivityContext

@InstallIn(ActivityComponent::class)
@Module
object ActivityModule {

    @Provides
    fun provideActivity(@ActivityContext activity: Context) =
        (activity as? ComponentActivity)
            ?: throw IllegalArgumentException("You must use ComponentActivity")

}



