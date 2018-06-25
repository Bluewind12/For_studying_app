package com.example.momonyan.for_studying_app

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.util.*

class Button_Activity : AppCompatActivity() {

    private lateinit var buttonUP: Button
    private lateinit var buttonDOWN: Button
    private lateinit var textView: TextView

    private lateinit var buttonScreenChange: Button
    private lateinit var imageView: ImageView

    private var i = 0 //Int型

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.button_layout)

        //初期宣言
        buttonUP = findViewById(R.id.buttonArea_UP)
        buttonDOWN = findViewById(R.id.buttonArea_Down)
        textView = findViewById(R.id.buttonArea_Text)

        buttonScreenChange =findViewById(R.id.buttonScreen)
        //Buttonが押されたときの動作
        buttonUP.setOnClickListener {
            i = i + 1
            //i++
            textView.text = i.toString()    //iの表示
        }
        buttonDOWN.setOnClickListener {
            i--
            //i -= 1
            textView.text = i.toString()
        }

    }
}