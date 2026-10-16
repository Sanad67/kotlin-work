// Task 8.3: weather station temperature analysis program

import kotlin.system.exitProcess
import src.funcs*


fun main(args: Array<String>) {
    // Add your code
    val data = fetchData(args[0])
    val min = data.minByOrNull{it.second}
    println("The minimum record is: $min" )

}
