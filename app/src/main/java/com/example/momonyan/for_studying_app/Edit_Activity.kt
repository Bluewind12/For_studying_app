package com.example.momonyan.for_studying_app

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.EditText
import android.widget.TextView

class Edit_Activity :AppCompatActivity(){
    private lateinit var edit:EditText
    private lateinit var text:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.edittext_layout)

        edit = findViewById(R.id.editText_edit)
        text = findViewById(R.id.editText_edit)

    }
}
