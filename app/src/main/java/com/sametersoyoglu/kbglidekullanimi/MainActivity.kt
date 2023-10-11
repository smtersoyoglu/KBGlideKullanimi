package com.sametersoyoglu.kbglidekullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.sametersoyoglu.kbglidekullanimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        resimGoster("kofte.png")

        binding.buttonResim1.setOnClickListener {
            resimGoster("ayran.png")
        }

        binding.buttonResim2.setOnClickListener {
            resimGoster("su.png")
        }
    }

    fun resimGoster(resimAdi:String) {
        val url = "http://kasimadalan.pe.hu/yemekler/resimler/$resimAdi"
        Glide.with(this).load(url).override(500,500).into(binding.imageView)
    }
    //.override() boyutu belirliyoruz bunda istediğmiz boyutta tanımlama yapabiliriz.
    //.into(binding.imageView) nerde görüntüleyeceğimizi belirtiyoruz
}