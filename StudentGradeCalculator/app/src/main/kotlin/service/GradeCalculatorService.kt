package service

/**
 * Implementation of the GradeCalculator interface
 * Calculates letter grades based on numeric scores using standard grading scale
 */
class GradeCalculatorService : GradeCalculator {
    
    /**
     * Calculate the letter grade based on the numeric score
     * @param score The numeric score (0-100)
     * @return The letter grade as a String
     */
    override fun calculate(score: Int): String {
        return when (score) {
            in 90..100 -> "A"
            in 80..89 -> "B"
            in 70..79 -> "C"
            in 60..69 -> "D"
            in 0..59 -> "F"
            else -> "Invalid grade"
        }
    }
}
