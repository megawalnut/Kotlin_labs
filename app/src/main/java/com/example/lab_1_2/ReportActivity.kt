package com.example.lab_1_2

import android.app.Activity
import android.content.ActivityNotFoundException
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button

class ReportActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_report)

        val menuStart = findViewById<Button>(R.id.report)
        menuStart.setOnClickListener {
            Log.d("MenuActivity", "Нажата кнопка 'Сообщить о проблеме'")
            val emailIntent = Intent(Intent.ACTION_SEND).apply {
                type = "message/rfc822"
                putExtra(Intent.EXTRA_EMAIL, arrayOf("support@example.com"))
                putExtra(Intent.EXTRA_SUBJECT, "Сообщение о проблеме")
                putExtra(Intent.EXTRA_TEXT, "Опишите вашу проблему...")
            }

            try {
                startActivity(Intent.createChooser(emailIntent, "Отправить письмо через:"))
            } catch (e: ActivityNotFoundException) {
                Log.e("MenuActivity", "Нет почтового приложения")
            }
        }

        val reportExit = findViewById<Button>(R.id.reportExit)
        reportExit.setOnClickListener {
            Log.d("MenuActivity", "Нажата кнопка 'Выход'")
            finish()
        }
    }
}

