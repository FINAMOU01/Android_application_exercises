# Exercise 1 - Higher-Order Functions and Predicates

## Description
This exercise demonstrates the use of higher-order functions in Kotlin with predicates.

## Concept
The program defines a function `processList()` that takes:
- A list of integers
- A predicate function `(Int) -> Boolean`

It uses the `filter()` function to return only the numbers that satisfy the predicate.

## Example Output
```
[2, 4, 6]
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
- Higher-order functions in Kotlin
- Using lambda expressions as predicates
- The `filter()` function
