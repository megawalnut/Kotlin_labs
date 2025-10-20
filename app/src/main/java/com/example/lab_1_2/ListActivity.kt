package com.example.lab_1_2

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listusers)


        val users = findViewById<RecyclerView>(R.id.userRecyclerView)
        val exitButton = findViewById<Button>(R.id.exit)
        val addButton = findViewById<Button>(R.id.add)

        val listus = ArrayList<User>()

        listus.add(User(
            avatar = "",
            login = "login1",
            passwd = "pass1",
            fullName = "Иван Иванов",
            birthDate = "01.01.2000",
            sex = "М"
        ))

        listus.add(User(
            avatar = "",
            login = "login2",
            passwd = "pass2",
            fullName = "Мария Петрова",
            birthDate = "02.02.2001",
            sex = "Ж"
        ))

        users.layoutManager = LinearLayoutManager(this)

        val adapter = UsrAdapter(listus)

        users.adapter = adapter

        addButton.setOnClickListener {
            Log.d("ListUsers", "Переход на создание пользователя")
            val intent = Intent(this, Autorisation::class.java)
            startActivity(intent)
        }

        exitButton.setOnClickListener {
            Log.d("ListUsers", "Нажата кнопка Выход")
            finish()
        }
    }
}
