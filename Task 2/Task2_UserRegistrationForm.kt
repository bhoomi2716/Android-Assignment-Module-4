package com.example.assignment

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class Task2_UserRegistrationForm : AppCompatActivity()
{
    lateinit var UserName : EditText
    lateinit var EmailId : EditText
    lateinit var mail : String
    lateinit var phno : String
    lateinit var PhnNum : EditText
    lateinit var SubmitBtn : Button
    val emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.task2_user_registration_form)

        UserName=findViewById(R.id.username)
        EmailId=findViewById(R.id.email)
        mail = EmailId.text.toString().trim()
        PhnNum=findViewById(R.id.phNum)
        phno = PhnNum.text.toString().trim()
        SubmitBtn=findViewById(R.id.uploadBtn)

        SubmitBtn.setOnClickListener {
            if (!(mail.matches(emailPattern.toRegex())))
            {
                EmailId.setError("Please Valid Email Address")
            }
            if (phno.length<10 || phno.length>10)
            {
                PhnNum.setError("Please Valid Mobile Number")
            }
        }
    }
}