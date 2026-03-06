import model.Student
import service.ExcelStudentReader
import service.GradeCalculatorService
import service.StudentReader
import service.GradeCalculator

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
    
    // Create instances of the classes
    val studentReader: StudentReader = ExcelStudentReader()
    val gradeCalculator: GradeCalculator = GradeCalculatorService()
    
    val students = studentReader.readStudents(path)
     if (students.isEmpty()){
        println("No students found.")
        return
     }
     println("\nProccessing grades...\n")
     
     // Use FILTER to get students with valid grades (0-100)
     val studentsWithGrades = students.filter { it.grade in 0..100 }
     
     // Use MAP to transform students to their letter grades
     val gradeResults = studentsWithGrades.map { "${it.name}: ${gradeCalculator.calculate(it.grade!!)}" }
     
     // Use FOR EACH to print each result
     gradeResults.forEach { println(it) }
}
