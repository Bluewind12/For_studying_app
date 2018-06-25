package com.example.momonyan.for_studying_app

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var button_Text: Button
    private lateinit var button_Button: Button
    private lateinit var button_Edit: Button
    private lateinit var button_Relative: Button
    private lateinit var button_Constant: Button
    private lateinit var button_Liner: Button
    private lateinit var button_Grid: Button
    private lateinit var button_Screen: Button
    private lateinit var button_Image: Button
    private lateinit var button_Sound: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUp()//初期宣言とか色々

        button_Text.setOnClickListener {
            val intent = Intent(this, TextView_Activity::class.java)
            startActivity(intent)
        }
        button_Button.setOnClickListener {
            val intent = Intent(this, Button_Activity::class.java)
            startActivity(intent)
        }
        button_Edit.setOnClickListener {

        }
        button_Relative.setOnClickListener {

        }
        button_Constant.setOnClickListener {

        }
        button_Liner.setOnClickListener {

        }
        button_Grid.setOnClickListener {

        }
        button_Screen.setOnClickListener {

        }
        button_Image.setOnClickListener {

        }
        button_Sound.setOnClickListener {

        }

    }

    fun setUp() {
        button_Text = findViewById(R.id.button_Text)
        button_Button = findViewById(R.id.button_Button)
        button_Edit = findViewById(R.id.button_Edit)
        button_Relative = findViewById(R.id.button_Layout0)
        button_Constant = findViewById(R.id.button_Layout1)
        button_Liner = findViewById(R.id.button_Layout2)
        button_Grid = findViewById(R.id.button_Layout4)
        button_Screen = findViewById(R.id.button_Screen)
        button_Image = findViewById(R.id.button_Image)
        button_Sound = findViewById(R.id.button_Sound)

    }
}
