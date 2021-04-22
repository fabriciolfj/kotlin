package com.github.fabriciolfj.kotlinstudy.capitulo5.lambda

class FlattenUso {
}

fun main() {

    val books = listOf(Book("java", listOf("Fabricio", "suzana", "carlos")),
            Book("dotnet", listOf("Fabricio", "roberto")));
    println(books.flatMap { it.authors }.toSet())

    val books2 = listOf(books)

    println(books2.flatten())
}