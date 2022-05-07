package com.shubhampandav.tictactoegame

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import android.widget.TextView
import android.widget.VideoView
import java.nio.file.Files

class MainActivity : AppCompatActivity() {

    private lateinit var image:ImageView;
    private lateinit var txt: TextView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide();  // this is for to hide action bar

        image = findViewById(R.id.img);
        txt = findViewById(R.id.txt);

        image.translationY = -13000f
        txt.translationY = 1100f
        image.animate().translationY(0f).duration = 1500
        txt.animate().translationY(0f).duration = 1500

        Handler(Looper.getMainLooper()).postDelayed({
                                                    startActivity(Intent(this,startActivity::class.java))

        },3000)






    }
}