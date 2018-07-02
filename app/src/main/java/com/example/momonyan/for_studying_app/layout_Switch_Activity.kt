package com.example.momonyan.for_studying_app

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

//レイアウト管理を行う
class layout_Switch_Activity : AppCompatActivity() {
    private val thisIntent = Intent()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val layout = thisIntent.extras.get("layout").toString()
        when {
            layout.equals("relative") -> setContentView(R.layout.relative)
            layout.equals("constant") -> setContentView(R.layout.relative)
            layout.equals("grid") -> setContentView(R.layout.relative)
            layout.equals("liner") -> setContentView(R.layout.relative)
            else -> error("error;code=1")
        }

        when {
            layout.equals("relative") -> setTitle(R.string.Relative)
            layout.equals("constant") -> setTitle(R.string.Constant)
            layout.equals("grid") -> setTitle(R.string.Grid)
            layout.equals("liner") -> setTitle(R.string.Liner)
            else -> error("error;code=2")
        }
    }
}