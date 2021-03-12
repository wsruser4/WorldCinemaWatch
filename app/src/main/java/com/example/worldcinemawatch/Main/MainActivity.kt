package com.example.worldcinemawatch.Main

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.wearable.activity.WearableActivity
import com.example.worldcinemawatch.MainScreen.MainScreen
import com.example.worldcinemawatch.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : WearableActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gone.setOnClickListener{
            val intent = Intent(this, MainScreen::class.java)
            startActivity(intent)
        }


        setAmbientEnabled()

    }
}