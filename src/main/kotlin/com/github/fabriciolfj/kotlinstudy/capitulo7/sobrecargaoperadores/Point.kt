package com.github.fabriciolfj.kotlinstudy.capitulo7.sobrecargaoperadores

data class Point(var x: Int, var y: Int) : Comparable<Point>{

    operator fun plus(other: Point) : Point {
        return Point(this.x + other.x, this.y + other.y)
    }

    operator fun times(other: Point) : Point {
        return Point(x * other.x, y * other.y)
    }

    operator fun unaryMinus(): Point {
        return Point(-x,-y)
    }

    operator fun inc() : Point {
        return Point(++x, ++y)
    }

    override fun compareTo(other: Point): Int {
        return compareValuesBy(this, other, Point::x, Point::y)
    }
}

fun main() {
    /*var point = Point(10, 20)
    val point2 = Point(5,4)
    println(point + point2)
    println(point * point2)

    print(++point)*/

    val p1 = Point(2,2)
    val p2 = Point(1,1)

    println(p1 < p2)
}