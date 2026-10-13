// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string

fun redact(input: String, text: String, character: Char = 'X'): String{
    val contains = input.contains(text, true)
    if(!contains){
        return input;
    }

    val repeatNumber = text.length

    val replacment = buildString {
        for (n in 1..repeatNumber) {
            append(character)
        }
    }


    val newInput = input.replace(text, replacment)
    return newInput
}