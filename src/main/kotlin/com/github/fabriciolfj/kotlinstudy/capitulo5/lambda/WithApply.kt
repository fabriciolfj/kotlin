package com.github.fabriciolfj.kotlinstudy.capitulo5.lambda

import java.lang.StringBuilder

class WithApply {
}

fun main() {
    println(alphabet())
    println(alphabetApply())
}

//pode retornar outro objeto
fun alphabet() = with(StringBuilder()) {
    for(letter in 'A'..'Z')
        append(letter)

    append("\nNow i know the alphabet")
            .toString()
}

//retorna o mesmo objeto
fun alphabetApply() = StringBuilder().apply {
    for(letter in 'A'..'Z')
        append(letter)

    append("\nNow i know the alphabet")
}.toString()