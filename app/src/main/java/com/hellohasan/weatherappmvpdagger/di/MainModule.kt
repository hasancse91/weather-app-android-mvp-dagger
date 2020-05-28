package com.hellohasan.weatherappmvpdagger.di

import android.app.Application
import android.content.Context
import com.hellohasan.weatherappmvpdagger.features.weather_info_show.model.WeatherInfoShowModel
import com.hellohasan.weatherappmvpdagger.features.weather_info_show.model.WeatherInfoShowModelImpl
import com.hellohasan.weatherappmvpdagger.features.weather_info_show.presenter.WeatherInfoShowPresenter
import com.hellohasan.weatherappmvpdagger.features.weather_info_show.presenter.WeatherInfoShowPresenterImpl
import com.hellohasan.weatherappmvpdagger.features.weather_info_show.view.MainActivity
import com.hellohasan.weatherappmvpdagger.features.weather_info_show.view.MainActivityView
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainModule {

    @Binds
    @ApplicationContext
    abstract fun provideContext(application: Application): Context

    @ContributesAndroidInjector
    abstract fun bindMainActivity(): MainActivity

    @Binds
    abstract fun bindWeatherInfoView(view: MainActivity): MainActivityView

    @Binds
    abstract fun bindWeatherInfoPresenter(presenter: WeatherInfoShowPresenterImpl): WeatherInfoShowPresenter

    @Binds
    abstract fun bindWeatherInfoModel(model: WeatherInfoShowModelImpl): WeatherInfoShowModel
}