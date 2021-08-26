package com.example.cointossapp

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.cointossapp.classes.Flip
import com.example.cointossapp.classes.RollDice
import com.example.cointossapp.databinding.ActivityMainBinding
import com.example.cointossapp.utilities.toast

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private var myCoinFlip =Flip(2)
    private var myCoin = myCoinFlip.sides()
    private var myDice = RollDice(6)
    private var diceRoll = myDice.rolling()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.doNotDoIt.visibility = View.INVISIBLE
        binding.doIt.visibility = View.INVISIBLE

        binding.toss.setOnClickListener {
           toss()
        }

        binding.rolling.setOnClickListener {
            roll()
        }

    }
    private fun toss(){

        myCoinFlip = Flip(2)
        myCoin = myCoinFlip.sides()
        binding.result.text = myCoin.toString()

        when(myCoin){
            1 -> toast("Head")
            2 -> toast("tail")
        }
        when (myCoin){
            1 -> binding.result.text = ("Head")
            2 -> binding.result.text = ("Tail")
        }
    }

    private fun roll(){

        myDice = RollDice(6)
        diceRoll = myDice.rolling()
        binding.result.text = diceRoll.toString()

        when(diceRoll){
            1 -> toast("One step")
            2 -> toast("Two steps")
            3 -> toast("Three steps")
            4 -> toast("Almost there")
            5 -> toast("Almost there")
            6 -> toast("Hurray Lucky Number")
        }
        when(diceRoll){
            1 -> binding.result.text = ("One step")
            2-> binding.result.text = ("Two steps")
            3 -> binding.result.text = ("Three steps")
            4 -> binding.result.text = ("Almost there")
            5 -> binding.result.text = ("Almost there")
            6 -> binding.result.text = ("Hurray Lucky Number")
        }
    }
}