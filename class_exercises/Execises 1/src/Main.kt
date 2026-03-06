fun processList(numbers: List<Int>, predicate: (Int) -> Boolean): List<Int> {
    return numbers.filter(predicate)
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6)

    val evens = processList(numbers) { it % 2 == 0 }

    println(evens)
}