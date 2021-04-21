package com.github.fabriciolfj.kotlinstudy.capitulo3

class VarargsEspalhamento {
}

fun main() {
    val list: Array<String> = arrayOf("fabricio", "suzana")
    var result = listOf(*list)
    result.forEach { println(it) }
}