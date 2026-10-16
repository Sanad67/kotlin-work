// Task 8.3: functions for temperature analysis

import kotlin.io.path.Path
import kotlin.io.path.forEachLine

typealias Record = Pair<String,Double>

fun fetchData(filename: String): List<Record> = buildList {
    Path(filename).forEachLine { line ->
        val parts = line.split(",")
        add(Record(parts.first(), parts.last().toDouble()))
    }
}

// Challenge: compute average temperature with one line of code
// in main(), instead of using the function below!


val averageTemp.filter{data: List<Record>, sum: float -> sum/data.size}

