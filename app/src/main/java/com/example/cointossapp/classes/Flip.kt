package com.example.cointossapp.classes

class Flip(val myToss:Int) {
    fun sides():Int{
        return (1..myToss).random()
    }
}