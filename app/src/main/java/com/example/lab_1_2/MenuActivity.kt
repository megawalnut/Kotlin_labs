package com.example.lab_1_2

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MenuActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val menuStart = findViewById<Button>(R.id.menuStart)
        menuStart.setOnClickListener {
            Log.d("MenuActivity", "Нажата кнопка 'Страт'")
        }

        val menuProfile = findViewById<Button>(R.id.menuProfile)
        menuProfile.setOnClickListener {
            Log.d("MenuActivity", "Нажата кнопка 'Профиль'")
            val intent = Intent(this, ListActivity::class.java)
            startActivity(intent)
        }

        val menuSettings = findViewById<Button>(R.id.menuSettings)
        menuSettings.setOnClickListener {
            Log.d("MenuActivity", "Нажата кнопка 'Настройки'")
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }

        val menuReport = findViewById<Button>(R.id.menuReport)
        menuReport.setOnClickListener {
            Log.d("MenuActivity", "Нажата кнопка 'Сообщить о проблеме'")
            val intent = Intent(this, ReportActivity::class.java)
            startActivity(intent)
        }

        val menuExit = findViewById<Button>(R.id.menuExit)
        menuExit.setOnClickListener {
            Log.d("MenuActivity", "Нажата кнопка 'Выход'")
            finish()
        }
    }
}

