package com.github.fabriciolfj.kotlinstudy.capitulo6

class CastSeguro {
}

fun main() {
    var p = Person("teste", null)
    var p2 = Person("teste", null)

    val p3 = p as? Person ?: false
    println(p3)
}