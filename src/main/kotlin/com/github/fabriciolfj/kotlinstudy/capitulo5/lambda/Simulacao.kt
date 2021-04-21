package com.github.fabriciolfj.kotlinstudy.capitulo5.lambda

class Simulacao {
}

fun main() {
    val sum = {x1: Int, x2: Int -> x1 + x2}
    print(sum(1,2))
}