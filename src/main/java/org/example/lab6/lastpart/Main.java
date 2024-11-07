package org.example.lab6.lastpart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args){
        Generics noviObjekat = new Generics();
        List<Integer> integerNumbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        double[] rez = noviObjekat.sumEvenOdd(integerNumbers);
        System.out.println("Sum of all even numbers is: " + rez[0] + " And sum of all odd numbers is: " + rez[1]);

        List<Double> doubleNumbers = List.of(1.2 , 2.4 , 5.5 , 6.7);
        double[] rez2 = noviObjekat.sumEvenOdd(doubleNumbers);
        System.out.println("Sum of all even numbers is: " + rez2[0] + " And sum of all odd numbers is: " + rez2[1]);

        System.out.println(" ");

        List<Integer> intList = List.of(1, 2, 3, 4, 5);
        List<Integer> reversedIntList = noviObjekat.reverseList(intList);
        System.out.println("Reversed Integer List: " + reversedIntList);

        List<String> strList = List.of("apple", "banana", "cherry");
        List<String> reversedStrList =noviObjekat.reverseList(strList);
        System.out.println("Reversed String List: " + reversedStrList);

        List<Double> doubleList = List.of(1.1, 2.2, 3.3, 4.4);
        List<Double> reversedDoubleList = noviObjekat.reverseList(doubleList);
        System.out.println("Reversed Double List: " + reversedDoubleList);


    }
}
