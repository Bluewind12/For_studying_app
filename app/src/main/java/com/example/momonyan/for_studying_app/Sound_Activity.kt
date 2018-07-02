package com.example.momonyan.for_studying_app

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class Sound_Activity : AppCompatActivity() {
    private lateinit var questionButton: Button
    private lateinit var collectButton: Button
    private lateinit var unCollectButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sound_layout)

        questionButton = findViewById(R.id.So_button)
        collectButton = findViewById(R.id.So_button2)
        unCollectButton = findViewById(R.id.So_button3)

        questionButton.setOnClickListener {

        }
        collectButton.setOnClickListener {

        }
        unCollectButton.setOnClickListener {

        }
    }
}