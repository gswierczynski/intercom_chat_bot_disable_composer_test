package com.hatchedlabs.intercom_test_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.intercom.android.sdk.Intercom
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        open_chat_button.setOnClickListener {
            Intercom.client().displayMessenger()
        }
    }
}