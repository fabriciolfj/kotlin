package com.github.fabriciolfj.kotlinstudy.capitulo5.lambda

class GerandoSequencias {
}

fun main() {
    //so e chamada, quando tivermos uma função terminal
    //0+1, 1 + 1 =2, 2 + 1 = 3, 3 + 1, 4
    val numeros = generateSequence(0) { it + 1 }.takeWhile { it < 4 }
            .toList()
    println(numeros)
}