package com.example.momonyan.for_studying_app

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

//レイアウト管理を行う
class layout_Switch_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var layout = intent.getStringExtra("layout")
        when (layout) {
            "relative" -> setContentView(R.layout.relative)
            "constant" -> setContentView(R.layout.constant)
            "grid" -> setContentView(R.layout.grid)
            "liner" -> setContentView(R.layout.liner)
            else -> error("error;code=1")
        }

        when(layout) {
            "relative" -> setTitle(R.string.Relative)
            "constant"-> setTitle(R.string.Constant)
            "grid" -> setTitle(R.string.Grid)
            "liner" -> setTitle(R.string.Liner)
            else -> error("error;code=2")
        }
    }
}