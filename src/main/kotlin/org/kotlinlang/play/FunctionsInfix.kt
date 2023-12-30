package org.example.org.kotlinlang.play

// https://play.kotlinlang.org/byExample/01_introduction/02_Functions
// infix : 接中辞
// Infix notation : Functions marked with the `infix` keyword can also be called
// using the infix notation (omitting the dot and the parentheses for the call).

fun main() {
    infix fun Int.times(str:String) = str.repeat(this)
    println(2 times "Bye ")

    val pair = "Ferrari" to "Katrina"
    println(pair)
}