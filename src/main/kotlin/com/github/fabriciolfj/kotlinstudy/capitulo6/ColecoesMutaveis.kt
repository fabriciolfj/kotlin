package com.github.fabriciolfj.kotlinstudy.capitulo6

class ColecoesMutaveis {
}

fun main() {
    var list = mutableListOf("Fabricio", "lucas")
    list.forEach { println(it)}

    val listNew = listOf("Suzana", "Roberto")
    list.addAll(
        listNew
    )

    list.forEach { println(it) }
}