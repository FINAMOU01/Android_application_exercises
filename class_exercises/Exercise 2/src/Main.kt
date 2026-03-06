fun main() {
    val words = listOf("apple", "cat", "banana", "dog", "elephant")

    // Create a map where keys are words and values are their lengths
    val wordLengths = words.associateWith { it.length }

    // Filter entries where the length is greater than 4 and print them
    wordLengths
        .filter { it.value > 4 }
        .forEach { (word, length) ->
            println("$word has length $length")
        }
}