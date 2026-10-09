// Task 5.1.2: main program

package src


import kotlin.random.Random
import kotlin.system.exitProcess
import src.rollDie

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Error: missing command line argument!")
        exitProcess(1)
    }
    val sides = args[0].toInt()
    repeat(4) {
        rollDie(sides)
    }
}