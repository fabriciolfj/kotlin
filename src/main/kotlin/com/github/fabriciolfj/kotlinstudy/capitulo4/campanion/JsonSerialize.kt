package com.github.fabriciolfj.kotlinstudy.capitulo4.campanion

interface JsonSerialize {

    fun fromJson(any: Any) : String
}