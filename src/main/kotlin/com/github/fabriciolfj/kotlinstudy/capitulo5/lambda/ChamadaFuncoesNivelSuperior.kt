package com.github.fabriciolfj.kotlinstudy.capitulo5.lambda

class ChamadaFuncoesNivelSuperior {
}

fun salute() = println("Salute!")


fun main() {
    run(::salute)
}