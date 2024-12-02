package org.example.lab10.task2;

import java.util.Arrays;

public class GradeAnalyzer {
    private int[] grades;

    public GradeAnalyzer(int[] grades) {
        this.grades = grades;
    }

    public double calculateAverage() {
        if (grades == null || grades.length == 0) return 0.0;
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

    public void printSummary() {
        System.out.println("Grade summary: " + Arrays.toString(grades));
        System.out.println("Average grade: " + calculateAverage());
    }
}
