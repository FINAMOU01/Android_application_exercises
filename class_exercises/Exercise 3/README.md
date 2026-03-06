# Exercise 3 - Data Classes, Filtering, and Aggregation

## Description
This exercise demonstrates working with data classes, filtering collections, and calculating aggregations in Kotlin.

## Concept
The program:
1. Defines a data class `Person` with `name` and `age` properties
2. Creates a list of Person objects
3. Filters people whose names start with 'A' or 'B'
4. Extracts ages using `map()`
5. Calculates the average age using `average()`

## Example Output
```
Average age: 25.7
```

## How to Run
1. Open this project in IntelliJ IDEA or Android Studio
2. Run the `Main.kt` file
3. Alternatively, compile and run using Kotlin compiler:
   ```bash
   kotlinc src/Main.kt -include-runtime -d Main.jar
   java -jar Main.jar
   ```

## Key Learnings
- Data classes in Kotlin
- The `filter()` function with complex conditions
- The `map()` function for transformation
- The `average()` function for aggregation
- String formatting with `format()`
- Using `startsWith()` for string matching
