package com.github.fabriciolfj.kotlinstudy.capitulo7.sobrecargaoperadores

data class Person(val nome: String, val sobreNome: String) : Comparable<Person> {

    override fun compareTo(other: Person): Int {
        return compareValuesBy(this, other, Person::nome, Person::sobreNome)
    }
}

fun main() {
    val p1 = Person("A", "A")
    val p2 = Person("B", "B")

    println(p1 > p2)
}