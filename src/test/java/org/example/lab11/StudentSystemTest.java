package org.example.lab11;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentSystemTest {
    @Test
    void testIfStudentIsPresent() throws IOException, InvalidStudentDataException {
        List<Student> students = StudentSystem.readStudents("students.csv");
        assertFalse(students.isEmpty(), "The student list should not be empty.");
    }

    @Test
    void testStudentWithId100() throws IOException, InvalidStudentDataException {
        StudentSystem system = new StudentSystem("students.csv");
        assertThrows(StudentNotFoundExceptions.class, () -> system.findStudentById(100), "Student with ID 100 should not exist.");
    }

    @Test
    void testHighestGPAStudent() throws IOException, InvalidStudentDataException {
        StudentSystem system = new StudentSystem("students.csv");
        Student highestGPAStudent = system.getAllStudents().stream()
                .max((s1, s2) -> Double.compare(s1.getGpa(), s2.getGpa()))
                .orElseThrow();
        assertEquals(9.8, highestGPAStudent.getGpa(), "The highest GPA should be 9.8.");
    }

    @Test
    void testExceptionForEmptyStudentList() {
        assertThrows(EmptyStudentListException.class, () -> {
            StudentSystem system = new StudentSystem("empty.csv");
            system.getAllStudents();
        }, "Exception should be thrown for an empty student list.");
    }
    @Test
    void testExceptionMessageForEmptyStudentList() {
        EmptyStudentListException exception = assertThrows(EmptyStudentListException.class, () -> {
            StudentSystem system = new StudentSystem("empty.csv");
            system.getAllStudents();
        });
        assertEquals("The student list is empty.", exception.getMessage(), "Exception message should match.");
    }

    @Test
    void testNamesArray() throws IOException, InvalidStudentDataException {
        List<Student> students = StudentSystem.readStudents("students.csv");
        List<String> names = students.stream().map(Student::getName).toList();
        assertArrayEquals(
                new String[]{"Camila Wood", "Alexander Thompson", "Liam Taylor", "Evelyn Jenkins", "Michael Jackson"},
                names.subList(0, 5).toArray(),
                "The first five student names should match.");
    }

    @Test
    void testSameStudent() throws IOException, InvalidStudentDataException, StudentNotFoundExceptions {
        StudentSystem system = new StudentSystem("students.csv");
        Student highestGPAStudent = system.getAllStudents().stream()
                .max((s1, s2) -> Double.compare(s1.getGpa(), s2.getGpa()))
                .orElseThrow();
        Student studentById = system.findStudentById(12);
        assertSame(highestGPAStudent, studentById, "The student with the highest GPA should be the same as the student with ID 12.");
    }
    @Test
    void testStudentToString() {
        Student student = new Student(1, "John Doe", "University A", "Engineering", 8.5);
        assertEquals("John Doe", student.toString(), "toString should return the name of the student.");
    }

    @Test
    void testStudentValidation() {
        assertThrows(InvalidStudentDataException.class, () -> {
            List<Student> students = List.of(
                    new Student(1, "John Doe", "University A", "Engineering", 5.0) // Invalid GPA
            );
            new StudentSystem(students); // Validation failure expected
        });
    }

    @Test
    void testFindStudentByIdSuccess() throws IOException, InvalidStudentDataException, StudentNotFoundExceptions {
        StudentSystem system = new StudentSystem("students.csv");
        Student student = system.findStudentById(1);
        assertNotNull(student, "Student with ID 1 should be found.");
    }

    @Test
    void testLongestNameStudent() throws IOException, InvalidStudentDataException {
        StudentSystem system = new StudentSystem("students.csv");
        Student longestNameStudent = system.getLongestNameStudent();
        assertNotNull(longestNameStudent, "There should be a student with the longest name.");
        assertEquals("Benjamin Richardson", longestNameStudent.getName(), "The student with the longest name should be Alexander Thompson.");
    }

}