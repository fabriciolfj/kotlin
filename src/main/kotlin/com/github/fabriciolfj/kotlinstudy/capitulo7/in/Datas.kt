package com.github.fabriciolfj.kotlinstudy.capitulo7.`in`

import java.time.LocalDate

class Datas {
}

fun main() {
    val now = LocalDate.now()
    val vocation = now..now.plusDays(10) //adiciona 10 dias a partir da data atual
    println(now.plusWeeks(2) in  vocation) //data aqui uma semana (7 dias a partir dessa data) vai estar no periodo de 10 dias?
}