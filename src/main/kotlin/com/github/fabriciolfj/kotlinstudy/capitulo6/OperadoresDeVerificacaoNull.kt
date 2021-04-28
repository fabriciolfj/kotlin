package com.github.fabriciolfj.kotlinstudy.capitulo6

import java.lang.IllegalArgumentException

class OperadoresDeVerificacaoNull {
}

fun main() {
    //simulacao1()
    //simulacao2()
    simulacao3()
}

private fun simulacao3() {
    var person = Person(null, null)
    println(person?.name?.toString())
    println(person?.name)
}

private fun simulacao2() {
    val address = Address("Rua Teste", 1415000, "Serrana", "Brasil")
    val company = Company("Bit", null)
    val person = Person("Fabricio", company)

    var addressP = person?.company?.address ?: throw IllegalArgumentException("Address not found")
    with(addressP) {
        println(street)
        println("$zipCode && $city && $country")
    }
}

private fun simulacao1() {
    val address = Address("Rua Teste", 1415000, "Serrana", "Brasil")
    val company = Company("Bit", address)
    val person = Person("Fabricio", company)

    println(person.countryName())

    val company2 = Company("Bit", null)
    val person2 = Person("Fabricio", company2)
    println(person2.countryName())
}

