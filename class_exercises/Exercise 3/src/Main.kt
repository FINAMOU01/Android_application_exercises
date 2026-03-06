data class Person(val name: String, val age: Int)

fun main() {
    val people = listOf(
        Person("Alice", 25),
        Person("Bob", 30),
        Person("Charlie", 35),
        Person("Anna", 22),
        Person("Ben", 28)
    )

    // Step 1: Filter people whose name starts with 'A' or 'B'
    val filtered = people.filter { it.name.startsWith("A") || it.name.startsWith("B") }

    // Step 2: Extract ages
    val ages = filtered.map { it.age }

    // Step 3: Calculate average
    val average = ages.average()

    // Step 4: Format and print
    println("Average age: ${"%.1f".format(average)}")
}