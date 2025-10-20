package com.example.lab_1_2

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Switch
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate

class SettingsActivity : AppCompatActivity() {
    @SuppressLint("UseSwitchCompatOrMaterialCode")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val styleSwitch = findViewById<Switch>(R.id.styleSwitch)
        styleSwitch.setOnCheckedChangeListener  { _, isChecked ->
            Log.d("MenuActivity", "Нажата кнопка 'Смена стиля'")
            if (isChecked) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }
        }

        val settingsExit = findViewById<Button>(R.id.settingsExit)
        settingsExit.setOnClickListener {
            Log.d("MenuActivity", "Нажата кнопка 'Выход'")
            finish()
        }
    }
}

