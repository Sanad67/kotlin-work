// Task 5.2.1: main program


package src

import kotlin.system.exitProcess
import src.circleArea
import src.circlePerimeter


fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Error: missing command line argument!")
        exitProcess(1)
    }
    val radius = args[0] toDouble()
    println(circleArea(radius))
    println(circlePerimeter(radius))
}