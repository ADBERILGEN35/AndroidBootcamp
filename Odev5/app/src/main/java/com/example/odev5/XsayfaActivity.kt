package com.example.odev5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.odev5.databinding.ActivityAsayfaBinding
import com.example.odev5.databinding.ActivityXsayfaBinding

class XsayfaActivity : AppCompatActivity() {
    private lateinit var tasarim: ActivityXsayfaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityXsayfaBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        tasarim.buttonXY.setOnClickListener {
            val intent = Intent(this, YsayfaActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}