package com.github.fabriciolfj.kotlinstudy.capitulo3

class ExpressaoRegular {
}

fun main() {
    println("12.14.-2.3".split('.', '-'))
    println("12.14.-2.3".split("\\.|-".toRegex()))
}