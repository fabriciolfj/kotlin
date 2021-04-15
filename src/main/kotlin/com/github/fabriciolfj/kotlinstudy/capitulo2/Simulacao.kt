package com.github.fabriciolfj.kotlinstudy.capitulo2

import java.lang.Exception

class Simulacao {
}

fun main() {
    println(getWarmth(Color.GREEN))
    val color = mix(Color.RED, Color.YELLOW)
    println(color.toString())
}

fun mix(c1: Color, c2: Color) = when(setOf(c1, c2)) {
    setOf(Color.RED, Color.YELLOW) -> Color.ORANGE
    setOf(Color.YELLOW, Color.BLUE) -> Color.GREEN
    setOf(Color.BLUE, Color.VIOLET) -> Color.INDIGO
    else -> Exception("Dirty color")
}

fun getWarmth(color: Color) = when(color) {
    Color.RED, Color.YELLOW -> "warm"
    Color.GREEN -> "neutral"
    Color.INDIGO -> "cold"
    else -> "not color"
}

fun printColor() {
    println(Color.BLUE.rgb())
}

fun printRectangle() {
    val rectangle = createRandomRectangle()
    println(rectangle.isSquare)
}

fun printPerson() {
    val person = Person("Fabricio", false)
    println(person)
}