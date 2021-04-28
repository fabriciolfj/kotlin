package com.github.fabriciolfj.kotlinstudy.capitulo7.sobrecargaoperadores

class Colecoes {
}

fun main() {
    val list = arrayListOf(1,2)
    list += 3

    val newList = list + listOf(3,4,5)

    println(newList)
    println(list)
}