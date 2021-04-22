package com.github.fabriciolfj.kotlinstudy.capitulo5.lambda

class Simulacao2 {
}

fun main() {
    val createPerson = ::Person
    val p = createPerson("fabricio", 36)
    println(p)

    val age = p::age

    val result = p::isAdult
    println(result.invoke())

    val condicao = {p : Person -> p.age > 30}

    lambdaParametro(p, condicao)

    val action = { person : Person, message: String -> sendEmail(person, message) }
    run {action(p, "teste")}
}

fun sendEmail(person: Person, message: String) {
    println("Mandando email ${person.name} mensagem: $message")
}

fun lambdaParametro(person: Person, condicao: (Person) -> Boolean) {
    println(condicao(person))
}