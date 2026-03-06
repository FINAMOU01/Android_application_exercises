# Exercise 2 - Map Operations with associateWith

## Description
This exercise demonstrates how to create and manipulate maps in Kotlin using `associateWith`.

## Concept
The program:
1. Creates a list of words
2. Uses `associateWith { it.length }` to create a Map where keys are words and values are their lengths
3. Filters the map to keep only entries where the length is greater than 4
4. Prints each word with its length

## Example Output
```
banana has length 6
elephant has length 8
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
- Using `associateWith()` to create maps
- Map filtering with `filter()`
- Iterating over map entries with destructuring
- String interpolation in Kotlin
