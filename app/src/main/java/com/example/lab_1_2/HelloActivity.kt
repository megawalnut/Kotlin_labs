package com.example.lab_1_2

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class HelloActivity : Activity() {

    private lateinit var loginEditText: EditText
    private lateinit var passwordEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_helloact)

        loginEditText = findViewById(R.id.startLogin)
        passwordEditText = findViewById(R.id.startPassword)

        savedInstanceState?.let {
            loginEditText.setText(it.getString("login"))
            passwordEditText.setText(it.getString("password"))
        }

        val exit = findViewById<Button>(R.id.exit)
        exit.setOnClickListener {
            Log.d("HelloActivity", "Нажата кнопка 'Выход'")
            finish()
        }

        val entry = findViewById<Button>(R.id.entry)
        entry.setOnClickListener {
            Log.d("HelloActivity", "Нажата кнопка 'Вход'")
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }

        val registry = findViewById<Button>(R.id.registry)
        registry.setOnClickListener {
            Log.d("HelloActivity", "Нажата кнопка 'Регистрация'")
            val intent = Intent(this, Autorisation::class.java)
            startActivity(intent)
        }

        Log.d("HelloActivity", "onCreate")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("login", loginEditText.text.toString())
        outState.putString("password", passwordEditText.text.toString())
    }

    override fun onStart() {
        super.onStart()
        Log.d("HelloActivity", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("HelloActivity", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("HelloActivity", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("HelloActivity", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("HelloActivity", "onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("HelloActivity", "onRestart")
    }
}
