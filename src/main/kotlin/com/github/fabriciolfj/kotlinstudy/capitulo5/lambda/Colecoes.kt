package com.github.fabriciolfj.kotlinstudy.capitulo5.lambda

class Colecoes {
}

fun main() {
    val list = listOf(1,2,3)
    println(list.filter { it % 2 ==0 })

    val people = listOf(Person("Fabrcio", 36), Person("Suzana", 23), Person("ROberto", 29), Person("Carlos", 29))
    println(people.filter { it.age > 30 }.map { it.name})

    val numbers = mapOf(0 to "fabricio", 1 to "suzana")
    println(numbers.mapValues { it.value.toUpperCase() })

    //predicate
    val canBeInClub27 = {p: Person -> p.age > 27}
    // todos atendem a essa condição
    println(people.all(canBeInClub27))
    // ao menos 1 atende essa condicao
    println(people.any(canBeInClub27))
    // quantos atendem essa condicao
    println(people.count(canBeInClub27))
    // retorna o primeiro que atender a condicao
    println(people.find(canBeInClub27))

    // agrupa e o resultado e um map, onde a chave é a condição pra agrupamento
    println(people.groupBy{ it.age })
}