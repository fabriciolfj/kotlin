package com.github.fabriciolfj.kotlinstudy.capitulo7.sobrecargaoperadores

class EqualsTest {
}

fun main() {
    var p1 = Point(1,1)
    var p2 = Point(1,1)

    println(p1 == p2)
    println(p1 === p2)
}