package com.example.lab_1_2

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class HelloActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_helloact)

        val startButton = findViewById<Button>(R.id.startForm)
        startButton.setOnClickListener {
            Log.d("HelloActivity", "Нажата кнопка 'Регистрация'")
        }

        val startButtonList = findViewById<Button>(R.id.startList)
        startButtonList.setOnClickListener {
            Log.d("HelloActivity", "Нажата кнопка 'Список пользователей'")
        }
    }
}

