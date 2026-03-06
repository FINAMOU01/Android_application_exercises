import model.Student
import service.calculateGrade
import service.readStudentsFromExcel

fun main(args: Array<String>){
    println("==================================================")
    println("     STUDENT GRADE CALCULATOR PROGRAM")
    println("==================================================")
    println()
    println("This program reads student grades from an Excel file")
    println("and calculates the letter grade for each student.")
    println()
    println("==================================================")
    
    val path = if (args.isNotEmpty()) {
        args[0]
    } else {
        print("Enter the path to your Excel file: ")
        readLine() ?: ""
    }
    
    if (path.isEmpty()) {
        println("No path entered. Exiting.")
        return
    }
    
    val students = readStudentsFromExcel(path)
     if (students.isEmpty()){
        println("No students found.")
        return
     }
     println("\nProccessing grades...\n")
     
     // Use FILTER to get students with valid grades (0-100)
     val studentsWithGrades = students.filter { it.grade in 0..100 }
     
     // Use MAP to transform students to their letter grades
     val gradeResults = studentsWithGrades.map { "${it.name}: ${calculateGrade(it.grade!!)}" }
     
     // Use FOR EACH to print each result
     gradeResults.forEach { println(it) }
     
     // Use FOLD to calculate statistics
     if (studentsWithGrades.isNotEmpty()) {
         println("\n--- Grade Statistics ---")
         
         // Count total students with grades using fold
         val totalCount = studentsWithGrades.fold(0) { acc, _ -> acc + 1 }
         println("Total students with grades: $totalCount")
         
         // Calculate average grade using fold
         val averageGrade = studentsWithGrades.fold(0) { acc, student -> acc + (student.grade ?: 0) }.toDouble() / totalCount
         println("Average score: %.2f".format(averageGrade))
         
         // Count grades by letter using fold
         val gradeDistribution = studentsWithGrades.fold(mutableMapOf<String, Int>()) { acc, student ->
             val letter = calculateGrade(student.grade!!)
             acc[letter] = acc.getOrDefault(letter, 0) + 1
             acc
         }
         println("Grade distribution: $gradeDistribution")
     }
     
     // Report students without valid grades using filter
     val studentsWithoutGrades = students.filter { it.grade == null || it.grade !in 0..100 }
     if (studentsWithoutGrades.isNotEmpty()) {
         println("\nStudents without valid grades:")
         studentsWithoutGrades.forEach { println("  ${it.name}") }
     }
}
