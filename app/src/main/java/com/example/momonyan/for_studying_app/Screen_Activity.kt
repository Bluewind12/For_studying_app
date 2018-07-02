package com.example.momonyan.for_studying_app

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText

class Screen_Activity:AppCompatActivity(){
    private lateinit var button: Button
private lateinit var editText: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.screen1)

        button = findViewById(R.id.Sc1_button)
        editText = findViewById(R.id.Sc1_editText)

        button.setOnClickListener {
            val intent = Intent(this,Screen2_Activity::class.java)
            //画面推移間の情報の受け渡し
            intent.putExtra("Edit",editText.text)
            //画面遷移
            startActivity(intent)
        }
    }
}