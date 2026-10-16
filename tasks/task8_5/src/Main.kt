// Task 8.5: example of using a higher-order function

fun main() {
    // Add your testing code here
    fun main() {
        val text = "Hello, Kotlin 2026!"
        println("Testing string: \"$text\"\n")

        // 1. Count uppercase letters (explicit lambda syntax)
        val isUppercase = { c: Char -> c.isUpperCase() }
        println("Uppercase letters:")
        println("  howMany: ${text.howMany(isUppercase)}")
        println("  count:   ${text.count(isUppercase)}")
        println()

        // 2. Count digits (implicit 'it' parameter syntax)
        println("Digits:")
        println("  howMany: ${text.howMany { it.isDigit() }}")
        println("  count:   ${text.count { it.isDigit() }}")
        println()

        // 3. Count spaces
        val isSpace = { c: Char -> c == ' ' }
        println("Spaces:")
        println("  howMany: ${text.howMany(isSpace)}")
        println("  count:   ${text.count(isSpace)}")
    }
}
