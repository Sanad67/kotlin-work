fun median(list: List<Float>): Float {
    require(list.isNotEmpty()) { "List cannot be empty" }
    val sorted = list.sorted()


    return if (sorted.size % 2 == 0) {
        val mid = sorted.size / 2
        (sorted[mid - 1] + sorted[mid]) / 2.0f
    } else {
        sorted[sorted.size / 2]
    }
}

fun displayStats(list: List<Float>) {
    println("Count: ${list.size}")
    println("Min: ${list.minOrNull()}")
    println("Max: ${list.maxOrNull()}")
    println("Average: ${list.average()}")
    println("Median: ${median(list)}")
}