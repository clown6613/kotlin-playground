package org.example.basics

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun InferredSum(a: Int, b: Int) = a + b

fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

// Unit return type ca be omitted.
fun omittedPrintSum(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}