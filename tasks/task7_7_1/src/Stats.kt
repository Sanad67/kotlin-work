// Task 7.7.1: statistics functions


fun median(list: List<Float>): Float {

return if (sorted.size % 2 == 0) {
    val mid = sorted.size / 2
    (sorted[mid - 1] + sorted[mid]) / 2
}    else {
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

