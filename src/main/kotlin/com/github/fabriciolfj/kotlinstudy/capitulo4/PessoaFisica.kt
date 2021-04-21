package com.github.fabriciolfj.kotlinstudy.capitulo4

class PessoaFisica(override val nome: String, override var tipo: String) : Pessoa(nome, tipo) {
}

fun main() {
    val pessoa = PessoaFisica("Fabricio", "Fisica")
    pessoa.println()
}