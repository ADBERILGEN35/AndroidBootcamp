package com.example.odev5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.navigation.NavHost
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.odev5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)


        tasarim.buttonA.setOnClickListener {
            val intent = Intent(this, AsayfaActivity::class.java)
            startActivity(intent)
        }
        tasarim.buttonX.setOnClickListener {
            val intent = Intent(this, XsayfaActivity::class.java)
            startActivity(intent)
        }

    }
}