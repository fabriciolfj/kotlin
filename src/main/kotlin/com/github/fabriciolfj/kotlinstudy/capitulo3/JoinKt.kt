package com.github.fabriciolfj.kotlinstudy.capitulo3

import java.lang.StringBuilder

const val INDEX_0 = 0

fun <T> joinToString(collection: Collection<T>, separator: String = ",", prefix: String = "", posfix: String = "") : String {
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > INDEX_0) result.append(separator)
        result.append(element)
    }

    result.append(posfix)
    return result.toString()
}