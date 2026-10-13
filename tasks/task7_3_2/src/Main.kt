// Task 7.3.1: list element access
fun main() {
    val numbers = listOf(9, 3, 6, 2, 8, 5, 1)
    val chunks = numbers.chunked(3)
    println(chunks)
}