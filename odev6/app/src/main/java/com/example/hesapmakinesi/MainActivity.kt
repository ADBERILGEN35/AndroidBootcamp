package com.example.hesapmakinesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.hesapmakinesi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)


/*
        var editTextSonuc = tasarim.editTextSonuc.toString()
*/
        val editTextSonuc = tasarim.editTextSonuc
        val butonBir = tasarim.buttonBir
        val butonIki = tasarim.buttonIki
        val butonUc = tasarim.buttonUc
        val butonDort = tasarim.buttonDort
        val butonBes = tasarim.buttonBes
        val butonAlti = tasarim.buttonAlt
        val butonYedi = tasarim.buttonYedi
        val butonSekiz = tasarim.buttonSekiz
        val butonDokuz = tasarim.buttonDokuz
        val topla = tasarim.buttonTopla
        val arti = tasarim.buttonArti
        val butonSifirla = tasarim.buttonSifirla


        var ilkDeger = 0



        butonBir.setOnClickListener {
            val text = editTextSonuc.text.toString() + "1"
            editTextSonuc.setText(text)
        }
        butonIki.setOnClickListener {
            val text = editTextSonuc.text.toString() + "2"
            editTextSonuc.setText(text)

        }
        butonUc.setOnClickListener {
            val text = editTextSonuc.text.toString() + "3"
            editTextSonuc.setText(text)

        }
        butonDort.setOnClickListener {
            val text = editTextSonuc.text.toString() + "4"
            editTextSonuc.setText(text)
        }
        butonBes.setOnClickListener {
            val text = editTextSonuc.text.toString() + "5"
            editTextSonuc.setText(text)

        }
        butonAlti.setOnClickListener {
            val text = editTextSonuc.text.toString() + "6"
            editTextSonuc.setText(text)

        }
        butonYedi.setOnClickListener {
            val text = editTextSonuc.text.toString() + "7"
            editTextSonuc.setText(text)
        }
        butonSekiz.setOnClickListener {
            val text = editTextSonuc.text.toString() + "8"
            editTextSonuc.setText(text)
        }
        butonDokuz.setOnClickListener {
            val text = editTextSonuc.text.toString() + "9"
            editTextSonuc.setText(text)
        }

        arti.setOnClickListener {
            ilkDeger = editTextSonuc.text.toString().toInt()
            editTextSonuc.setText("")
        }
        topla.setOnClickListener {
            val ikinciDeger = editTextSonuc.text.toString().toInt()
            editTextSonuc.setText((ilkDeger + ikinciDeger).toString())
        }

        butonSifirla.setOnClickListener {
            editTextSonuc.setText("")
        }


    }
}
