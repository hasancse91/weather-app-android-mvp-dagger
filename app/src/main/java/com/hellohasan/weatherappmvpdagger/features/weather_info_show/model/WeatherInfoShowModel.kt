package com.hellohasan.weatherappmvpdagger.features.weather_info_show.model

import com.hellohasan.weatherappmvpdagger.common.RequestCompleteListener
import com.hellohasan.weatherappmvpdagger.features.weather_info_show.model.data_class.City
import com.hellohasan.weatherappmvpdagger.features.weather_info_show.model.data_class.WeatherInfoResponse

interface WeatherInfoShowModel {
    fun getCityList(callback: RequestCompleteListener<MutableList<City>>)
    fun getWeatherInformation(cityId: Int, callback: RequestCompleteListener<WeatherInfoResponse>)
}