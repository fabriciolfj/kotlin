package com.github.fabriciolfj.kotlinstudy.capitulo5.lambda

data class Person(val name: String, val age: Int)

fun main() {
    var persons = arrayListOf<Person>(Person("fabricio", 36), Person("carlos", 40))
    println(persons.maxOf { p -> p.age })


}