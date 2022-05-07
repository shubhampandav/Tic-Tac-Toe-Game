package com.shubhampandav.tictactoegame

import android.annotation.SuppressLint
import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.Window
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class gameActivity : AppCompatActivity() {
    private lateinit var b1: Button
    private lateinit var b2: Button
    private lateinit var b3: Button
    private lateinit var b4: Button
    private lateinit var b5: Button
    private lateinit var b6: Button
    private lateinit var b7: Button
    private lateinit var b8: Button
    private lateinit var b9: Button
    private lateinit var winner: TextView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
        // this is initialize the button
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        winner = findViewById(R.id.winner);


    }

    fun bClick(view: View) {
        var cellId = 0;
        val bSelected = view as Button

        when (bSelected.id) {
            R.id.b1 ->
                cellId = 1
            R.id.b2 ->
                cellId = 2
            R.id.b3 ->
                cellId = 3
            R.id.b4 ->
                cellId = 4
            R.id.b5 ->
                cellId = 5
            R.id.b6 ->
                cellId = 6
            R.id.b7 ->
                cellId = 7
            R.id.b8 ->
                cellId = 8
            R.id.b9 ->
                cellId = 9


        }
        playGame(cellId, bSelected)


    }

    var activeplayer = 1
    var player1 = ArrayList<Int>()
    var player2 = ArrayList<Int>()

    @SuppressLint("ResourceAsColor")
    fun playGame(cellId: Int, bselect: Button) {
        if (activeplayer == 1) {
            bselect.text = "x"
            bselect.setBackgroundColor(R.color.green)
            player1.add(cellId)
            activeplayer = 2

        } else {
            bselect.text = "0"
            bselect.setBackgroundColor(R.color.yellow)
            player2.add(cellId)
            activeplayer = 1
        }
        bselect.isEnabled = false;
        checkWinner()// this is calling of fun

    }

    // this is check winner function
    fun checkWinner() {
        var winner = -1
        // row 1 winnner
        if (player1.contains(1) && player1.contains(2) && player1.contains(3)) {
            winner = 1;
        }
        if (player2.contains(1) && player2.contains(2) && player2.contains(3)) {
            winner = 2;
        }
        // row 2 winner
        if (player1.contains(4) && player1.contains(5) && player1.contains(6)) {
            winner = 1;
        }
        if (player2.contains(4) && player2.contains(5) && player2.contains(6)) {
            winner = 2;
        }
        // row 3 winner
        if (player1.contains(7) && player1.contains(8) && player1.contains(9)) {
            winner = 1;
        }
        if (player2.contains(7) && player2.contains(8) && player2.contains(9)) {
            winner = 2;
        }
        // column 1 winner
        if (player1.contains(1) && player1.contains(4) && player1.contains(7)) {
            winner = 1;
        }
        if (player2.contains(1) && player2.contains(4) && player2.contains(7)) {
            winner = 2;
        }
        // column  2 winner
        if (player1.contains(2) && player1.contains(5) && player1.contains(8)) {
            winner = 1;
        }
        if (player2.contains(2) && player2.contains(5) && player2.contains(8)) {
            winner = 2;
        }
        // column 3 winner
        if (player1.contains(3) && player1.contains(6) && player1.contains(9)) {
            winner = 1;
        }
        if (player2.contains(3) && player2.contains(6) && player2.contains(9)) {
            winner = 2;
        }

        // winner tells us
        if (winner == 1) {

            Toast.makeText(this, "player 1 win the game ", Toast.LENGTH_SHORT).show()
        } else if (winner == 2) {
            Toast.makeText(this, "player 2 win", Toast.LENGTH_SHORT).show()
        }

    }

}