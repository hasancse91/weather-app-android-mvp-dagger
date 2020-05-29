package com.hellohasan.weatherappmvpdagger.di

import com.hellohasan.weatherappmvpdagger.features.weather_info_show.view.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingsModule {

    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    abstract fun mainActivityInjector(): MainActivity

}