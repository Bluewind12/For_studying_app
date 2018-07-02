package com.example.momonyan.for_studying_app

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView
import java.util.*

class Picture_Activity :AppCompatActivity(){
    private lateinit var changeButton: Button
private lateinit var imageView: ImageView
    private val random = Random()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.picture)
        //初期宣言
        changeButton = findViewById(R.id.Picture_button)
        imageView = findViewById(R.id.Picture_imageView)

        changeButton.setOnClickListener {
            //randomで画像を決定する
            var i = random.nextInt(5)
            when {
            i==0 ->imageView.setImageResource(R.drawable.bird_gan)
            i==1 ->imageView.setImageResource(R.drawable.milk_fruit)
            i==2 ->imageView.setImageResource(R.drawable.nenryou_sekitan)
            i==3 ->imageView.setImageResource(R.drawable.pose_inoru_woman)
            i==4 ->imageView.setImageResource(R.drawable.tabibito)
            }
        }
    }
}