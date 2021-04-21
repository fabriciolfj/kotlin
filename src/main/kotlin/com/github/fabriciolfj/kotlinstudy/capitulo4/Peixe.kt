package com.github.fabriciolfj.kotlinstudy.capitulo4

class Peixe : Animal() {
    override fun movimentar() {
        println("nada")
    }

    override fun comer() {
        println("come algas")
    }
}

fun main() {
    val peixe = Peixe()
    peixe.movimentar()
    peixe.comer()
}