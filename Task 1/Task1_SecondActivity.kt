package com.example.assignment

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Task1_SecondActivity : AppCompatActivity()
{
    lateinit var btn2 :Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.task1_second_activity)

        btn2=findViewById(R.id.btn2)
        btn2.setOnClickListener {
            var secondIntent = Intent(applicationContext,Task1_FirstActivity::class.java)
            startActivity(secondIntent)
        }
    }
}