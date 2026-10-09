

package src

import kotlin.random.Random

/*
should be able to roll multiple dice
(all of the same type),
printing the total score across all of those dice.
 */

fun rollDice(sides: Int = 6 , numberDice: Int = 1) {
    if (sides in setOf(4, 6, 8, 10, 12, 20)) {
        var total = 0
        repeat(numberDice){
            val result = Random.nextInt(1, sides + 1)
            total += result
        }
        println("total $total and $numberDice")
    }
    else {
        println("Error: cannot have a $sides-sided die")
    }
}