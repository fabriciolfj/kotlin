package com.github.fabriciolfj.kotlinstudy.capitulo4.objetosingleton

import java.math.BigDecimal

object Pagamento {
    var persons = arrayListOf<Person>()
    fun calculary() {
        var total = BigDecimal.ZERO
        for (person in persons) {
            total = total.add(person.salary)
        }

        println("Total pagamento $total")
    }
}

fun main() {
    var persons = arrayListOf<Person>(Person("Fabricio", BigDecimal.valueOf(100)), Person("Suzana", BigDecimal(29.00)))
    Pagamento.persons = persons
    Pagamento.calculary()
}