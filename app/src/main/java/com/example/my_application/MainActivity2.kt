package com.example.my_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        splash()


    }
    fun splash(){
        object : CountDownTimer(5000,1000){
            override fun onTick(p0: Long) {
            }

            override fun onFinish() {
                val intento = Intent(applicationContext,MainActivity::class.java).apply{ }
                startActivity(intento)
                finish()
            }

        }.start()
    }
}