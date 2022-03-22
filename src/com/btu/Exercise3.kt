package com.btu

import kotlin.math.pow

class Point(_x: Double, _y: Double) {
    var x = _x
    var y = _y

    override fun toString(): String {
        return "x: $x, y: $y"
    }

    override fun equals(other: Any?): Boolean {
        return if(other is Point) {
            (this.x.equals(other.x) && this.y.equals(other.y))
        } else {
            false
        }
    }

    fun symmetricMove() {
        x *=-1
        y *=-1
    }

    fun distance(point: Point): Double {
        return kotlin.math.sqrt((point.x - x).pow(2) + (point.y - y).pow(2))
    }
}