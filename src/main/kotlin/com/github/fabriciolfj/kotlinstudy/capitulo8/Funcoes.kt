package com.github.fabriciolfj.kotlinstudy.capitulo8

import java.lang.StringBuilder

class Funcoes {
}

fun <T> Collection<T>.joinToString(
    separator: String = " ",
    prefix: String = " ",
    posfix: String = " ",
    transform: ((T) -> String) ? = null ) : String {

    val result = StringBuilder(prefix)
    for ((index, element) in this.withIndex()) {
        if (index > 0) {
            result.append(separator)
        }
        val str = transform?.invoke(element) ?: element.toString()
        result.append(str)
    }

    result.append(posfix)
    return result.toString()
}

fun twoAndThree(operation: (Int, Int) -> Int) {
    val result = operation(2,3)
    println(result)

}
fun main() {
    val sum : (Int, Int) -> Int = {x, y -> x + y}
    println(sum(1,2))

    val print: (Int) -> Unit = { println(it)}

    print(12)

    val sumReturnNull : (Int, Int) -> Int? = {x, y -> x + y}
    twoAndThree{x, y -> x + y}

    val list = listOf("one", "two")
    println(list.joinToString { it.toUpperCase() })

}