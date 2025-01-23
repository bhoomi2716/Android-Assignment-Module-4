package com.example.assignment

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Task2_UserRegistrationForm : AppCompatActivity()
{
    lateinit var UserName : EditText
    lateinit var EmailId : EditText
    lateinit var PhnNum : EditText
    lateinit var SubmitBtn : Button
    val emailPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}\$"
    val phNumPattern = "^(\\+91|\\+91\\-|0)?[789]\\d{9}\$"

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.task2_user_registration_form)

        UserName=findViewById(R.id.username)
        EmailId=findViewById(R.id.email)
        PhnNum=findViewById(R.id.phNum)
        SubmitBtn=findViewById(R.id.uploadBtn)

        SubmitBtn.setOnClickListener {

            var mail = EmailId.text.toString()
            var phno = PhnNum.text.toString()

            if (isVelidPhNum(phno))
            {
                Toast.makeText(applicationContext,"valid PhNum",Toast.LENGTH_SHORT).show()
            }
            else
            {
                Toast.makeText(applicationContext,"Invalid PhNum",Toast.LENGTH_SHORT).show()
            }

            if (isVelidEmail(mail))
            {
                Toast.makeText(applicationContext,"valid Email",Toast.LENGTH_SHORT).show()
            }
            else
            {
                Toast.makeText(applicationContext,"Invalid Email",Toast.LENGTH_SHORT).show()
            }
        }
    }

    fun isVelidPhNum(phnum : String) : Boolean
    {
        return phnum.matches(phNumPattern.toRegex())
    }

    fun isVelidEmail(email : String) : Boolean
    {
        return email.matches(emailPattern.toRegex())
    }
}