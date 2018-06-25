package com.example.momonyan.for_studying_app

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Edit_Activity :AppCompatActivity(){
    //初期宣言
    private lateinit var edit:EditText
    private lateinit var text:TextView
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.edittext_layout)

        //関連付け
        edit = findViewById(R.id.edit_edit)
        text = findViewById(R.id.edit_text)
        button = findViewById(R.id.edit_button)

        //ボタンが押されたときの処理
        button.setOnClickListener {
            text.text = edit.text
        }
    }
}
