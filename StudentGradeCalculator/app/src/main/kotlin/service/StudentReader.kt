package service

import model.Student

/**
 * Interface for reading student data from various sources
 * Defines the contract for loading student information
 */
interface StudentReader {
    /**
     * Read students from the specified source
     * @param source The path or identifier for the data source
     * @return List of Student objects
     */
    fun readStudents(source: String): List<Student>
}
