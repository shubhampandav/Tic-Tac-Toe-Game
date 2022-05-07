package com.shubhampandav.tictactoegame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class startActivity : AppCompatActivity() {
    private lateinit var nextbtn:Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        nextbtn = findViewById(R.id.nextbtn);

        nextbtn.setOnClickListener {

           val intent = Intent(this,gameActivity::class.java);
            startActivity(intent);


        }

    }
}