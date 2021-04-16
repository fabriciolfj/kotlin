package com.github.fabriciolfj.kotlinstudy.capitulo2

import java.io.BufferedReader
import java.lang.Exception
import java.lang.IllegalArgumentException
import java.lang.NumberFormatException

class Simulacao {
}

fun main() {
    //println(getWarmth(Color.GREEN))
    //val color = mix(Color.RED, Color.YELLOW)
    //println(color.toString())
    println(eval(Sum(Num(1),Num(2))))
}

fun eval(e: Expr) : Int {
    return when (e) {
        is Num -> e.value
        is Sum -> eval(e.right) + eval(e.left)
        else -> throw IllegalArgumentException("unknow expression")
    }
}

fun whenNotArguments(c1: Color, c2: Color) {
    when {
        (c1 == Color.RED && c2 == Color.YELLOW) || (c1 ==Color.YELLOW && c2 == Color.RED) -> Color.ORANGE
        (c1 == Color.BLUE && c2 == Color.YELLOW) || (c1 ==Color.YELLOW && c2 == Color.RED) -> Color.RED
        else -> throw Exception("Dirty color")
    }
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

fun readNumber(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(readLine())
    } catch (e: NumberFormatException) {
        return
    }

    println(number

    )
}