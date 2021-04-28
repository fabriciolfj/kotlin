package com.github.fabriciolfj.kotlinstudy.capitulo6

import java.lang.RuntimeException

class FuncaoNothingPAraExceptions {
}

fun main() {
    sendEmail()
}

fun sendEmail() : Nothing {
    throw RuntimeException("teste")
}