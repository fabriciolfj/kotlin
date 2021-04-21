package com.github.fabriciolfj.kotlinstudy.capitulo4.campanion

data class User private constructor(val nickename: String) {

    companion object {
        fun newUser(name: String) = User(name)
        fun newUserId(id: Int) = User(id.toString())
    }
}

fun main() {
    var user = User.newUser("fabricio")
    var user2 = User.newUserId(1)

    println(user)
    println(user2)
}