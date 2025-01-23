package com.example.assignment

import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Task3_BottomNavBar : AppCompatActivity()
{
    lateinit var homeLayout : LinearLayout
    lateinit var profileLayout : LinearLayout
    lateinit var settingLayout : LinearLayout

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.task3_bottom_nav_bar)

        homeLayout = findViewById(R.id.homeLayout)
        profileLayout = findViewById(R.id.profileLayout)
        settingLayout = findViewById(R.id.settingLayout)

        homeLayout.setOnClickListener {

            var initfrgmnt = HomeFragment()
            var suprtfrgmntmngr = supportFragmentManager
            var frgmnttrnscton = suprtfrgmntmngr.beginTransaction()
            frgmnttrnscton.replace(R.id.frame,initfrgmnt).commit()
        }

        profileLayout.setOnClickListener {

            var initfrgmnt = ProfileFragment()
            var suprtfrgmntmngr = supportFragmentManager
            var frgmnttrnscton = suprtfrgmntmngr.beginTransaction()
            frgmnttrnscton.replace(R.id.frame,initfrgmnt).commit()
        }

        settingLayout.setOnClickListener {

            var initfrgmnt = SettingFragment()
            var suprtfrgmntmngr = supportFragmentManager
            var frgmnttrnscton = suprtfrgmntmngr.beginTransaction()
            frgmnttrnscton.replace(R.id.frame,initfrgmnt).commit()
        }

    }
}