// COMP2850 Portfolio: Week 1
// Program to compute area of a triangle

import kotlin.math.sqrt
import kotlin.system.exitProcess


fun main(args: Array<String>){
    if (args.size != 3){
        println("Error: values for a, b, c required on command line")
        exitProcess(1)
    }
    val number1 = args[0].toFloat()
    val number2 = args[1].toFloat()
    val number3 = args[2].toFloat()

    val area = number1 * number2 * number3
    System.out.printf("Area = %.5f\n", area)
}