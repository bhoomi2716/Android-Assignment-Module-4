package com.example.assignment

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Task1_FirstActivity : AppCompatActivity()
{
    lateinit var btn1 : Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.task1_first_activity)

        btn1=findViewById(R.id.btn1)

        btn1.setOnClickListener {
            var firstIntent = Intent(applicationContext,Task1_SecondActivity::class.java)
            startActivity(firstIntent)
        }
    }
}