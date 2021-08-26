package com.example.cointossapp.classes

class RollDice(val numOfSides:Int) {
    fun rolling():Int{
        return (1..numOfSides).random()
    }


}