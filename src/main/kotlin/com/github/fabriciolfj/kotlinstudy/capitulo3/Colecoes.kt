package com.github.fabriciolfj.kotlinstudy.capitulo3

class Colecoes {

}

fun main() {
    val strings = listOf("first", "second", "fourteenth")
    println(strings.last())

    val numbers: Collection<Int> = setOf(1,2,3,5)
    println(numbers.maxOf { it })
}