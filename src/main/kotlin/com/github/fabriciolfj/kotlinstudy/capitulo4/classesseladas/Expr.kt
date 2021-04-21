package com.github.fabriciolfj.kotlinstudy.capitulo4.classesseladas

sealed class Expr {
    class Num(val value: Int) : Expr()
    class Sum(val left: Expr, val right: Expr) : Expr()
}

fun eval(e: Expr) : Int =
    when (e) {
        is Expr.Num -> e.value
        is Expr.Sum -> eval(e.right) + eval(e.left)
    }

fun main() {
    val valor = eval(Expr.Sum(Expr.Num(1), Expr.Num(3)))
    println(valor)
}