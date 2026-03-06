package model

/**
 * Data class representing a student
 * @property name The name of the student
 * @property grade The numeric grade (0-100), can be null if not assigned
 */
data class Student(
    val name: String,
    val grade: Int?
) {
    /**
     * Check if the student's grade is valid (within 0-100 range)
     * @return true if grade is between 0 and 100, false otherwise
     */
    fun hasValidGrade(): Boolean {
        return grade != null && grade in 0..100
    }
    
    /**
     * Get a formatted string representation of the student
     * @return A string in the format "Name: Grade"
     */
    override fun toString(): String {
        return "$name: ${grade ?: "N/A"}"
    }
}
