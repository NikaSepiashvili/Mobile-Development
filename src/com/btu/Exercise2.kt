package com.btu

fun palindrome(something: String): Boolean {
    return something == something.reversed()
}
