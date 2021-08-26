package com.example.cointossapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.cointossapp.classes.Flip
import com.example.cointossapp.databinding.ActivityMainBinding
import com.example.cointossapp.utilities.toast

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private var myCoinFlip = Flip(2)
    private var myCoin = myCoinFlip.sides()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toss.setOnClickListener {
           toss()
        }

    }
    private fun toss(){

        myCoinFlip = Flip(2)
        myCoin = myCoinFlip.sides()
        binding.result.text= myCoin.toString()

        when(myCoin){
            1 -> toast("Head")
            2 -> toast("tail")
        }
    }
}