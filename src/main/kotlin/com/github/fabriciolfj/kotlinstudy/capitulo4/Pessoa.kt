package com.github.fabriciolfj.kotlinstudy.capitulo4

open class Pessoa(open val nome: String, open var tipo: String) {

    open fun modificarTipo(tipo: String) {
        this.tipo = tipo;
    }

    fun println() {
        println(nome)
        println(tipo)
    }
}