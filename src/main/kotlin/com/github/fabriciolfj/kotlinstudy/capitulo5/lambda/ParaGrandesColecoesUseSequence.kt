package com.github.fabriciolfj.kotlinstudy.capitulo5.lambda

class ParaGrandesColecoesUseSequence {
}

fun main() {
    val people = listOf(Person("Fabrcio", 36), Person("Suzana", 23), Person("ROberto", 29), Person("Carlos", 29))
    var result = people.asSequence()
            .filter { it.age > 30 }
            .map { it.name }
            .toList()

    println(result)
}