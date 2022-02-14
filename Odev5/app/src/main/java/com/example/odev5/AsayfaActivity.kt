package com.example.odev5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.odev5.databinding.ActivityAsayfaBinding
import com.example.odev5.databinding.ActivityMainBinding

class AsayfaActivity : AppCompatActivity() {
    private lateinit var tasarim: ActivityAsayfaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityAsayfaBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        tasarim.buttonB.setOnClickListener {
            val intent = Intent(this, BsayfaActivity::class.java)
            startActivity(intent)
            finish()
        }


    }

}