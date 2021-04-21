package com.github.fabriciolfj.kotlinstudy.capitulo4.classesinternas

data class Produto(val nome: String) {

    data class Categoria(val nome: String)

    inner class Tipo(val descricao: String)
}

fun main() {
    var categoria = Produto.Categoria("frios")
    var tipo = Produto("arroz").Tipo("especiaria");

    println(tipo.descricao)
}