// Task 7.7.1: program to compute stats for a numeric dataset


fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("Please provide a data file name.")
        return
    }

    val filename = args[0]

    val numbers = File(filename)
        .readLines()
        .map { it.toFloat() }

    displayStats(numbers)
}
