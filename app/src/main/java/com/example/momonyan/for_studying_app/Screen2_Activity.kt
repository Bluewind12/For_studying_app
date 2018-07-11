package com.example.momonyan.for_studying_app

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class Screen2_Activity : AppCompatActivity() {
    private lateinit var button: Button
    private lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.screen2)
        val editData =intent.getStringExtra("Edit")

        button = findViewById(R.id.Sc2_button)
        textView = findViewById(R.id.Sc2_textView2)
        textView.text = editData

        button.setOnClickListener{
            val intent = Intent(this,Screen_Activity::class.java)
            //画面遷移
            startActivity(intent)
        }
    }
}