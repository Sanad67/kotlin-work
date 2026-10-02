// COMP2850 Portfolio: Week 1
// Program to compute area of a triangle

import kotlin.math.sqrt
import kotlin.system.exitProcess


fun main(args: Array<String>){
    if (args.size != 3){
        println("Error: values for a, b, c required on command line")
        exitProcess(1)
    }
    val a = args[0].toFloat()
    val b = args[1].toFloat()
    val c = args[2].toFloat()

    val add = a+b+c
    val s = add / 2f
    val subtract = (s - a) *(s - b)* (s - c)* s
    val area = sqrt(subtract)
    
    System.out.printf("Area = %.5f\n", area)

}