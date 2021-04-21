package com.github.fabriciolfj.kotlinstudy.capitulo4.campanion

data class Person(val name: String) {

    companion object : JsonSerialize {
        override fun fromJson(any: Any): String {
            var person = any as Person
            return "{${person.name}}"
        }
    }
}

fun main() {
    var person = Person("fabricio")
    print(Person.fromJson(person))
}