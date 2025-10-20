package com.example.lab_1_2

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Switch

class Autorisation : Activity() {

    private lateinit var login: EditText
    private lateinit var password: EditText
    private lateinit var fullName: EditText
    private lateinit var birthDate: EditText
    private lateinit var switchMW: Switch

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.autoris)

        Log.d("Autorisation", "onCreate")

        login = findViewById(R.id.editLogin)
        password = findViewById(R.id.editPassword)
        fullName = findViewById(R.id.editFullName)
        birthDate = findViewById(R.id.editBirthDate)
        switchMW = findViewById(R.id.switchMW)

        savedInstanceState?.let {
            login.setText(it.getString("login"))
            password.setText(it.getString("password"))
            fullName.setText(it.getString("fullName"))
            birthDate.setText(it.getString("birthDate"))
            switchMW.isChecked = it.getBoolean("isMale", false)
        }

        findViewById<Button>(R.id.avatar).setOnClickListener {
            Log.d("Autorisation", "Нажата кнопка выбора аватара")
        }

        findViewById<Button>(R.id.next).setOnClickListener {
            Log.d("Autorisation", "Нажата кнопка '→' — смена аватара")
        }

        findViewById<Button>(R.id.addButton).setOnClickListener {
            Log.d("Autorisation", "Нажата 'Добавить'")
        }

        findViewById<Button>(R.id.autExit).setOnClickListener {
            Log.d("Autorisation", "Нажата 'Выход'")
            finish()
        }

        login.setOnFocusChangeListener { _, hasFocus -> if (!hasFocus)
            Log.d("Autorisation", "Логин: ${login.text}")
        }
        password.setOnFocusChangeListener { _, hasFocus -> if (!hasFocus)
            Log.d("Autorisation", "Пароль: ${password.text}")
        }
        fullName.setOnFocusChangeListener { _, hasFocus -> if (!hasFocus)
            Log.d("Autorisation", "ФИО: ${fullName.text}")
        }
        birthDate.setOnFocusChangeListener { _, hasFocus -> if (!hasFocus)
            Log.d("Autorisation", "Дата рождения: ${birthDate.text}")
        }
        switchMW.setOnCheckedChangeListener { _, isChecked ->
            Log.d("Autorisation", "Пол: ${if (isChecked) "М" else "Ж"}")
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("login", login.text.toString())
        outState.putString("password", password.text.toString())
        outState.putString("fullName", fullName.text.toString())
        outState.putString("birthDate", birthDate.text.toString())
        outState.putBoolean("isMale", switchMW.isChecked)
    }

    override fun onStart() {
        super.onStart();
        Log.d("Autorisation", "onStart")
    }
    override fun onResume() {
        super.onResume();
        Log.d("Autorisation", "onResume")
    }
    override fun onPause() {
        super.onPause();
        Log.d("Autorisation", "onPause")
    }
    override fun onStop() {
        super.onStop();
        Log.d("Autorisation", "onStop")
    }
    override fun onDestroy() {
        super.onDestroy();
        Log.d("Autorisation", "onDestroy")
    }
    override fun onRestart() {
        super.onRestart();
        Log.d("Autorisation", "onRestart")
    }
}
