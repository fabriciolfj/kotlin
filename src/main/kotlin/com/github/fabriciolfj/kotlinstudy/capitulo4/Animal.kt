package com.github.fabriciolfj.kotlinstudy.capitulo4

abstract class Animal {

    abstract fun movimentar()
    open fun comer() {
        println("animal come")
    }

}