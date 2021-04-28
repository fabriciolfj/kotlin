package com.github.fabriciolfj.kotlinstudy.capitulo6

data class Person(val name: String?, val company: Company?) {

}


fun Person.countryName() : String {
    val country = this.company?.address?.country
    return country ?: "Unknown";
}