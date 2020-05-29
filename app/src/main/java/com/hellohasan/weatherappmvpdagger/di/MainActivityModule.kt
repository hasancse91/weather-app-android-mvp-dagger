package com.hellohasan.weatherappmvpdagger.di

import com.hellohasan.weatherappmvpdagger.features.weather_info_show.model.WeatherInfoShowModel
import com.hellohasan.weatherappmvpdagger.features.weather_info_show.model.WeatherInfoShowModelImpl
import com.hellohasan.weatherappmvpdagger.features.weather_info_show.presenter.WeatherInfoShowPresenter
import com.hellohasan.weatherappmvpdagger.features.weather_info_show.presenter.WeatherInfoShowPresenterImpl
import com.hellohasan.weatherappmvpdagger.features.weather_info_show.view.MainActivity
import com.hellohasan.weatherappmvpdagger.features.weather_info_show.view.MainActivityView
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class MainActivityModule {

    @Binds
    abstract fun bindView(mainActivity: MainActivity): MainActivityView

    @Binds
    abstract fun bindModel(weatherInfoShowModelImpl: WeatherInfoShowModelImpl): WeatherInfoShowModel

    companion object {

        @Provides
        fun providesPresenter(view: MainActivityView, model: WeatherInfoShowModel) : WeatherInfoShowPresenter {
            return WeatherInfoShowPresenterImpl(view, model)
        }
    }
}