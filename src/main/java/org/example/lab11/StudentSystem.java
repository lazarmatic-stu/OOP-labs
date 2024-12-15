package org.example.lab11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// C:\Users\Lazar Matic\Desktop\students.csv
public class StudentSystem {
    private List<Student> students;
    public StudentSystem(String filename) throws IOException, InvalidStudentDataException {
        students = new ArrayList<>();
        loadStudentsFromFile(filename);
        validateStudentData(students);
    }
    public StudentSystem(List<Student> students) throws InvalidStudentDataException{
        validateStudentData(students);
        this.students = new ArrayList<>(students);
    }

    private void loadStudentsFromFile(String filename) throws IOException , InvalidStudentDataException{
        students = readStudents(filename);
    }

    static List<Student> readStudents(String filename) throws IOException, InvalidStudentDataException {
        List<Student> studentList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length != 5) {
                    throw new InvalidStudentDataException("Invalid data format in file.");
                }
                try {
                    int id = Integer.parseInt(data[0].trim());
                    String name = data[1].trim();
                    String university = data[2].trim();
                    String department = data[3].trim();
                    double gpa = Double.parseDouble(data[4].trim());

                    studentList.add(new Student(id, name, university, department, gpa));
                } catch (NumberFormatException e) {
                    throw new InvalidStudentDataException("Invalid number format in file.");
                }
            }
        }
        return studentList;
    }
    private void validateStudentData(List<Student> students) throws InvalidStudentDataException {
        for (Student student : students) {
            if (student.getGpa() < 6.0 || student.getGpa() > 10.0) {
                throw new InvalidStudentDataException("Read data has invalid rows.");
            }
        }
    }
    public Student findStudentById(int id) throws StudentNotFoundExceptions, StudentNotFoundExceptions {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        throw new StudentNotFoundExceptions("Student with ID " + id + " not found.");
    }

    public List<Student> getAllStudents() {
        if (students.isEmpty()) {
            throw new EmptyStudentListException("The student list is empty.");
        }
        return new ArrayList<>(students);
    }

    public void printAllStudents() {
        if (students.isEmpty()) {
            throw new EmptyStudentListException("The student list is empty.");
        }
        for (Student student : students) {
            System.out.println(student);
        }
    }
    public int noOfStudents(){
        int counter = 0;
        for (Student student : students){
            counter++;
        }
        return counter;
    }
    public Student getHighestGPAStudent(){
        double localGPA = 0;
        Student localStudent = null;
        for (Student student : students){
            if (student.getGpa() > localGPA){
                localGPA = student.getGpa();
                localStudent = student;
            }
        }
        return localStudent;
    }
    public Student getLongestNameStudent() throws EmptyStudentListException {
        if (students.isEmpty()) {
            throw new EmptyStudentListException("List of students is empty.");
        }
        Student longestNameStudent = students.get(0);
        for (Student student : students) {
            if (student.getName().length() > longestNameStudent.getName().length()) {
                longestNameStudent = student;
            }
        }
        return longestNameStudent;
    }


    public static void main(String[] args) {
        try {
            StudentSystem system = new StudentSystem("students.csv");

            system.printAllStudents();

            Student student = system.findStudentById(1);
            System.out.println("Student found: " + student);

            System.out.println(readStudents("students.csv"));

            System.out.println(system.noOfStudents());

            System.out.println(system.getHighestGPAStudent());

            System.out.println("Student with the longest name: " + system.getLongestNameStudent());


        } catch (IOException | InvalidStudentDataException e) {
            System.out.println("Error initializing student system: " + e.getMessage());
        } catch (EmptyStudentListException e) {
            System.out.println("List of students is empty" + e.getMessage());
        } catch (StudentNotFoundExceptions e) {
            throw new RuntimeException(e);
        }
    }

}
