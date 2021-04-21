package com.github.fabriciolfj.kotlinstudy.capitulo3

class UsoInfix {
}

infix fun Any.to(other: Any) = Pair(this, other)

fun main() {
    val (number, name) = 1 to "fabricio"
    println(number)
    println(name)
}

