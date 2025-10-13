package com.example.lab_1_2

import android.annotation.SuppressLint
import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Switch

class Autorisation : Activity() {
    @SuppressLint("UseSwitchCompatOrMaterialCode")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.autoris)


        val avatarButton = findViewById<Button>(R.id.avatar)
        val nextButton = findViewById<Button>(R.id.next)
        val addButton = findViewById<Button>(R.id.addButton)
        val login = findViewById<EditText>(R.id.editLogin)
        val password = findViewById<EditText>(R.id.editPassword)
        val fullName = findViewById<EditText>(R.id.editFullName)
        val birthDate = findViewById<EditText>(R.id.editBirthDate)
        val switch = findViewById<Switch>(R.id.switchMW)

        avatarButton.setOnClickListener {
            Log.d("Form", "Нажата кнопка выбора аватара")
        }

        nextButton.setOnClickListener {
            Log.d("Form", "Нажата кнопка '→' — смена аватара")
        }

        login.setOnFocusChangeListener { _, hasFocus ->
            if (!hasFocus) {
                Log.d("Form", "Логин введён: ${login.text}")
            }
        }

        password.setOnFocusChangeListener { _, hasFocus ->
            if (!hasFocus) {
                Log.d("Form", "Пароль введён: ${password.text}")
            }
        }

        fullName.setOnFocusChangeListener { _, hasFocus ->
            if (!hasFocus) {
                Log.d("Form", "ФИО введено: ${fullName.text}")
            }
        }

        birthDate.setOnFocusChangeListener { _, hasFocus ->
            if (!hasFocus) {
                Log.d("Form", "Дата рождения введена: ${birthDate.text}")
            }
        }

        switch.setOnCheckedChangeListener { _, isChecked ->
            Log.d("Form", "Пол выбран: ${if (isChecked) "М" else "Ж"}")
        }

        addButton.setOnClickListener {
            Log.d("Form", "Нажата 'Добавить'")
        }
    }
}
