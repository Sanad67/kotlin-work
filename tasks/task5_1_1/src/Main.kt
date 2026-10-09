// Task 5.1.1: main program
package src

import kotlin.system.exitProcess
import src.anagrams
/*
Now edit Main.kt. Add to this file a main() function that

Reads two words as command line arguments

Compares those words using anagrams()

Displays the result of the comparison to the user
 */

fun main(args: Array<String>) {
    if (args.size != 2) {
        println("Error: missing command line argument!")
        exitProcess(1)
    }
    val result = anagrams(args[0],args[1])
    println(result)


}