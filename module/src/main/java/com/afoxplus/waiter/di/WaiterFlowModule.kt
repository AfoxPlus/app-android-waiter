package com.afoxplus.waiter.di

import com.afoxplus.waiter.delivery.flow.WaiterFlow
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
object WaiterFlowModule {
    @Provides
    fun provideWaiterFlow(): WaiterFlow = WaiterFlow.build()
}