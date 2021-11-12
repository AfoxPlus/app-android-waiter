package com.afoxplus.waiter.di

import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class WaiterGsonConverterFactory

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class WaiterHttpLoggingInterceptor

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class WaiterInterceptor

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class WaiterRetrofit

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class WaiterOkHttpClient

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class WaiterBaseURL