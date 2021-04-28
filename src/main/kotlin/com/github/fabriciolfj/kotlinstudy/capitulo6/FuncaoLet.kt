package com.github.fabriciolfj.kotlinstudy.capitulo6

class FuncaoLet {
}

fun main() {
    val email : String? = null
    email?.let { sendEmail(it) }
}

fun sendEmail(email: String) {
    println(email)
}