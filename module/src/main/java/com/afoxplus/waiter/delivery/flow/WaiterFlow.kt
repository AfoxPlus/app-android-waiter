package com.afoxplus.waiter.delivery.flow

import javax.inject.Inject

interface WaiterFlow {
    //TODO: All public flows for access to module
    companion object {
        fun build(): WaiterFlow = WaiterFlowImpl()
    }
}

internal class WaiterFlowImpl @Inject constructor() : WaiterFlow {

}