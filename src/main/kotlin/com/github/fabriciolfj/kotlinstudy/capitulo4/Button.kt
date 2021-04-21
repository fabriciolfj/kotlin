package com.github.fabriciolfj.kotlinstudy.capitulo4

class Button : Clickable, Focusable {
    override fun click() {
        println("click button")
    }

    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }

}

fun main() {
    var button = Button()
    button.click()
    button.showOff()
}