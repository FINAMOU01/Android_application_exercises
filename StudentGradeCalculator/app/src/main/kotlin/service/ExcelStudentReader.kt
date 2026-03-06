package service

import model.Student
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import java.io.File
import java.io.FileInputStream

/**
 * Implementation of StudentReader interface
 * Reads student data from Excel files (.xlsx)
 */
class ExcelStudentReader : StudentReader {
    
    /**
     * Read students from an Excel file
     * @param source The file path to the Excel file
     * @return List of Student objects
     */
    override fun readStudents(source: String): List<Student> {
        val file = File(source)
        
        if (!file.exists()) {
            println("File does not exist.")
            return emptyList()
        }
        
        val workbook = XSSFWorkbook(FileInputStream(file))
        val sheet = workbook.getSheetAt(0)
        val students = mutableListOf<Student>()
        
        val rowIterator = sheet.iterator()
        if (rowIterator.hasNext()) rowIterator.next() // Skip header row
        
        while (rowIterator.hasNext()) {
            val row = rowIterator.next()
            
            val name = row.getCell(0)?.stringCellValue ?: "Unknown"
            val grade = row.getCell(1)?.numericCellValue?.toInt()
            students.add(Student(name, grade))
        }
        
        workbook.close()
        return students
    }
}
