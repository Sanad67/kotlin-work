// Task 3.5: simple file I/O

import kotlin.io.path.Path
import kotlin.io.path.appendText
import kotlin.io.path.readText
import kotlin.io.path.writeText

fun main() {
    val path = Path("test.txt")
    val content = "Hey whats up"
    val sigma = "HOOOOOWWWWWWWL"
    path.writeText(content)
    path.appendText(sigma)
    val fileContents = path.readText()
    println(fileContents)
}
