package com.example.odev5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.odev5.databinding.ActivityBsayfaBinding

class BsayfaActivity : AppCompatActivity() {
    private lateinit var tasarim: ActivityBsayfaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityBsayfaBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        tasarim.buttonBY.setOnClickListener {
            val intent = Intent(this, YsayfaActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}