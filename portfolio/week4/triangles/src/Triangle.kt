// COMP2850 Portfolio: Week 4
// Triangle class

import kotlin.math.sqrt



class Triangle(
    val sideA: Double,
    val sideB: Double,
    val sideC: Double, // the old type alias
) {
    // Is valid triangle moved here use the error handle
    init {
        val base = maxOf(sideA, sideB, sideC)
        require(sideA > 0 && sideB > 0 && sideC > 0 && base < (sideA + sideB + sideC - base))
        { "Triangle must be valid" }
    }

    val perimeter: Double
        get() = sideA + sideB + sideC
    val semiPerimeter: Double
        get() = perimeter / 2.0
    val area: Double
        get() = sqrt((semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC) * semiPerimeter)

    override fun toString(): String {
        return "Triangle($sideA, $sideB, $sideC)"
    }
}



