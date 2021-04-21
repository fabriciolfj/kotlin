package com.github.fabriciolfj.kotlinstudy.capitulo4.construtores

class MyButton : View {

    private var attr : String = "";

    constructor(ctx: String) : super(ctx)

    constructor(ctx: String, attr: String) : super(ctx = ctx) {
        this.attr = attr
    }
}