package com.hellohasan.weatherappmvpdagger.di

import javax.inject.Scope

@Scope
annotation class ActivityScope

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class PerActivity