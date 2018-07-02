package com.example.momonyan.for_studying_app

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.R.raw
import android.media.AudioManager
import android.media.MediaPlayer
import android.media.SoundPool


class Sound_Activity : AppCompatActivity() {
    //初期宣言（仮）
    private lateinit var questionButton: Button
    private lateinit var collectButton: Button
    private lateinit var unCollectButton: Button
    private lateinit var bgmButton: Button

    //音データは app/res/raw(作る)の中に入れて使う

    //サウンドプール用の宣言・SEに適している
    val soundPool = SoundPool.Builder().build()
    val sound1 = soundPool.load(this, R.raw.question1, 1)
    val sound2 = soundPool.load(this, R.raw.correct1, 1)
    val sound3 = soundPool.load(this, R.raw.incorrect1, 1)

    //メディアプレイヤー用の宣言・BGMに適している(Webから音源を持ってくることも可能)
    val mediaPlayerBGM = MediaPlayer.create(getApplicationContext(),R.raw.bgm)
    //再生中かの判別
    private var isPlaying = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sound_layout)

        //初期宣言
        questionButton = findViewById(R.id.So_button)
        collectButton = findViewById(R.id.So_button2)
        unCollectButton = findViewById(R.id.So_button3)
        bgmButton = findViewById(R.id.So_buttonBGM)

        questionButton.setOnClickListener {
            soundPool.play(sound1, 1.0f, 1.0f, 0, 0, 1.0f)
        }
        collectButton.setOnClickListener {
            soundPool.play(sound2, 1.0f, 1.0f, 0, 0, 1.0f)
        }
        unCollectButton.setOnClickListener {
            soundPool.play(sound3, 1.0f, 1.0f, 0, 0, 1.0f)
        }

        bgmButton.setOnClickListener {
            if (isPlaying) {
                mediaPlayerBGM.stop()
                mediaPlayerBGM.prepare()
                bgmButton.text = "BGM再生"
                isPlaying = false
            } else {
                mediaPlayerBGM.start()
                bgmButton.text = "BGM停止"
                isPlaying = true
            }
        }
    }
}