// Task 9.6: application to compute dataset variance
package src


import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Implement main program here
    import kotlin.system.exitProcess

    fun main(args: Array<String>) {
        runCatching {
            val filename = args.firstOrNull() ?: throw IllegalArgumentException("No filename provided on the command line.")

            val dataset = readData(filename)
            val varValue = variance(dataset)

            println("Size: ${dataset.size}")
            println("Variance: %.5f".format(varValue))} .onFailure { exception ->
            println("Error: ${exception.message}")
            exitProcess(1)
        }
    }
}
