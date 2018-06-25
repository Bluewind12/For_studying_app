package com.example.momonyan.for_studying_app

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

//レイアウト管理を行う
class layout_Switch_Activity : AppCompatActivity() {
    private val layout = Intent("layout")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        when{
            layout.equals("relative") -> setContentView(R.layout.relative)

        }
    }
}