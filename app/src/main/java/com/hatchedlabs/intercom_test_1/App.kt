package com.hatchedlabs.intercom_test_1

import android.app.Application
import io.intercom.android.sdk.Intercom
import io.intercom.android.sdk.identity.Registration




class App : Application() {
    override fun onCreate() {
        super.onCreate()

        Intercom.initialize(this, "android_sdk-a18b13f7219f7f9319de5cca33c75763db189957", "zfhueoa1")
        val registration = Registration.create().withUserId("123456")
        Intercom.client().registerIdentifiedUser(registration)
    }
}