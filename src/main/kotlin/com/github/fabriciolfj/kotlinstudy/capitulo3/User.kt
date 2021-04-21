package com.github.fabriciolfj.kotlinstudy.capitulo3

import java.lang.IllegalArgumentException

data class User(val name: String, val address: String) {

    private fun validateBeforeSave() {
        fun validate(value: String, fieldName: String) {
            if (value.isEmpty()) {
                throw IllegalArgumentException("Field is empty $fieldName")
            }
        }

        validate(name, "Name")
        validate(address, "Address")
    }

    fun save() {
        validateBeforeSave()
        print("save")
    }
}

fun main() {
    val user = User("fabricio", "ok")
    user.save()

}