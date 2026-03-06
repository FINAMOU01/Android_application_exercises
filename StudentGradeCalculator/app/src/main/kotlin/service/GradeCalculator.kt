package service

/**
 * Interface for grade calculation service
 * Defines the contract for calculating letter grades from numeric scores
 */
interface GradeCalculator {
    /**
     * Calculate the letter grade based on the numeric score
     * @param score The numeric score (0-100)
     * @return The letter grade as a String
     */
    fun calculate(score: Int): String
}
