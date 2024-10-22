package org.example.lab4.task1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;


public class Main {

    public static void printDepartment(List<Person> people){
        for (Person person : people){
            System.out.println(people);
        }
    }

    public static void main(String [] args){
        List<Person> people = new ArrayList<Person>();
        people.add( new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", "Sweden" , 21 , 1200) );
        people.add( new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki" , "Norway" , 21 , 12312312 , Arrays.asList(6,5,4)) );
        printDepartment(people);
        Student lazar = new Student("Lazar" , "Stefana Nemanje" , "Bosna i Hercegovina" , 21 , 12131313 , Arrays.asList(8,7,9));
        System.out.println(lazar.getGrades());
        lazar.addGrade(1);
        lazar.addGrade(8);
        lazar.addGrade(11);
        System.out.println(lazar.getGrades());

    }
}
