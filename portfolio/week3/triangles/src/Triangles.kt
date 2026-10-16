// COMP2850 Portfolio: Week 3
// Functions for working with triangle geometry

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here

fun isValidTriangle(triangle: Triangle): Boolean{

    // sum of two sides > 3rd which is the max
    // all positive
    val a = triangle.first
    val b = triangle.second
    val c = triangle.third

    val base = maxOf(a, b, c)

    if(a > 0 && b> 0 && c>0 &&  base < (a + b + c - base)){
        return true
    }
    else{
        return false
    }
}



fun triangleArea(triangle: Triangle): Double{
    require(isValidTriangle(triangle)) { "Triangle must be valid" }
    val a = triangle.first
    val b = triangle.second
    val c = triangle.third

    val add = a+b+c
    val s = add / 2.0
    val subtract = (s - a) *(s - b)* (s - c)* s
    val area = sqrt(subtract)

    return area


}

