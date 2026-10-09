

package src


import kotlin.random.Random
import kotlin.system.exitProcess
import src.rollDice

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Error: missing command line argument!")
        exitProcess(1)
    }
    val spec = args[0]
    val numberDice = spec.substringBefore("d").toInt()
    val sides = spec.substringAfter("d").toInt()


    rollDice(sides, numberDice)

}