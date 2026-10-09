// Task 5.2.2: conversion of marks into grades, using a function

import kotlin.system.exitProcess

fun grade(mark: Int): String {
    when (mark) {
        in 0..39   -> return "Fail"
        in 40..69  -> return "Pass"
        in 70..100 -> return "Distinction"
        else       -> return "?"
    }
}

fun main(args: Array<String>) {
    if (args.size != 4) {
        println("Error: missing command line argument!")
        exitProcess(1)
    }
    for (Numbers in args){
        val input = Numbers.toInt()
        val result = grade(input)
        println(result)
    }


}