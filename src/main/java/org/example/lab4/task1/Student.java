package org.example.lab4.task1;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private int credit;
    private int student_id;
    private List<Integer> grades;
    public Student(String name, String address , String country , int age , int student_id , List<Integer> grades){
        super(name, address , country , age);
        this.credit = 0;
        this.student_id = student_id;
        this.grades = new ArrayList<>(grades);
    }
    public int getCredit(){
        return this.credit;
    }
    public void setCredit(int credit){
        this.credit = credit;
    }
    public void setStudent_id(int student_id){
        this.student_id = student_id;
    }
    public int getStudent_id(){
        return this.student_id;
    }
    public void setGrades(List<Integer> grades){
        this.grades = grades;
    }
    public List<Integer> getGrades(){
        return this.grades;
    }
    public void addGrade(int new_grade){
        if (new_grade <= 10 && new_grade >= 5){
        grades.add(new_grade);
        } else System.out.println("Sorry, the grade " + new_grade + " is not in the required range.");
    }
    public void study(){
        this.credit++;
    }

    @Override
    public String toString(){
        return super.getName() + "\n" + super.getAddress() + "\n credits " + this.credit;
    }
}
