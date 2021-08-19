package com.elliot.glideexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {

    private val imageView by lazy{findViewById<ImageView>(R.id.imageView)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Glide.with(this).load("https://images.indianexpress.com/2018/12/uri-12001.jpg").into(imageView)
    }
}