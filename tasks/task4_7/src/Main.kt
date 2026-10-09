// Task 4.7: finding the longest line in a file

import kotlin.system.exitProcess
import kotlin.io.path.*


fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Error: values for a required on command line")
        exitProcess(1)
    }

    val filePath = Path(args[0]) // make the path for it
    var max = 0
    var count = 0
    var longestLineNumber = 0

    filePath.useLines {
        for (line in it) {
            val length = line.length
            count++
            if(length > max){
                max = length
                longestLineNumber = count
            }
        }
    }
    println("Line $longestLineNumber is the longest (length = $max)")

}