package org.example.exercise.task2;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Student {
    private String name;
    private int id;
    private int[] grades;
    public Student(String name, int id, int[] grades){
        this.name = name;
        this.id = id;
        this.grades = grades;
    }
    public String getName(){
        return this.name;
    }
    public Integer getID(){
        return this.id;
    }
    public String getGrades(){
        return Arrays.toString(this.grades);
    }
    public void printInfo(){
        System.out.println("Student name: " + this.name + " , ID: " + this.id + " and the grades: " + getGrades());
    }
}
class GradeAnalyzer{
    private int[] grades;
    public GradeAnalyzer(int[] grades){
        this.grades = grades;
    }
    public Float calculateAverage(){
        float suma = 0;
        int counter = 0;
    for (Integer grade : grades){
        suma += grade;
        counter++;
    }
    float average = suma / counter;
    return average;
    }
    public void printSummary(){
        System.out.println("Grades: " + Arrays.toString(this.grades) + " Average: " + calculateAverage());
    }
}

class Start{
    public static void main(String[] args) throws IllegalAccessException {
        int[] grds = {1,2,4,4,3,3};
        Student stu1 = new Student("Lazar" , 123142423 ,grds);
        GradeAnalyzer gr1 = new GradeAnalyzer(grds);
        Field[] stuFields = stu1.getClass().getDeclaredFields();
        for (Field field : stuFields){
            field.setAccessible(true);
            String fieldName = field.getName();
            Object fieldValue = field.get(stu1);
            if (fieldValue != null && fieldValue.getClass().isArray()){
                fieldValue = Arrays.toString((int[]) fieldValue);
            }
            System.out.println(fieldName + ": " + fieldValue);
        }


        Field[] grdFields = gr1.getClass().getDeclaredFields();
        for (Field field : grdFields){
            field.setAccessible(true);
            String fieldName = field.getName();
            Object fieldValue = field.get(gr1);
            if (fieldValue != null && fieldValue.getClass().isArray()){
                fieldValue = Arrays.toString((int[]) fieldValue);
            }
            System.out.println(fieldName + ": " + fieldValue);
        }
    }
}
