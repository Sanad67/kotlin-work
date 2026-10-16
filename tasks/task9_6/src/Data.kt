// Task 9.6: readData() function
import kotlin.io.path.Path
import kotlin.io.path.forEachLine

// Task: readData() function
fun readData(filename: String): List<Double> = buildList {
    Path(filename).forEachLine {
        add(it.toDouble())
    }
}