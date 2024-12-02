package org.example.lab10.task2;

import java.util.Arrays;

public class Student {
private String name;
private String id;
private int[] grades;

public Student(String name, String id, int[] grades) {
    this.name = name;
    this.id = id;
    this.grades = grades;
}

public String getName() {
    return name;
}

public String getId() {
    return id;
}

public int[] getGrades() {
    return grades;
}

public void setId(String id) {
    this.id = id;
}

public void setName(String name) {
    this.name = name;
}

public void setGrades(int[] grades) {
    this.grades = grades;
}

public void printInfo() {
    System.out.println("Student ID: " + id);
    System.out.println("Student Name: " + name);
    System.out.println("Grades: " + Arrays.toString(grades));
}
}