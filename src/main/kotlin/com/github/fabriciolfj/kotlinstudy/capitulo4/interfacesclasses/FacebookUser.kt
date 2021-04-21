package com.github.fabriciolfj.kotlinstudy.capitulo4.interfacesclasses

class FacebookUser(val accountId: Int) : User {
    override val nickname: String
        get() = "teste"
}