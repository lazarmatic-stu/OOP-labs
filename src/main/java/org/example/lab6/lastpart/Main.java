package org.example.lab6.lastpart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args){
        Generics noviObjekat = new Generics();
        List<Integer> integerNumbers = List.of(1, 2, 3, 4, 5, 6, 7,6, 8, 9, 10);
        double[] rez = noviObjekat.sumEvenOdd(integerNumbers);
        System.out.println("Sum of all even numbers is: " + rez[0] + " And sum of all odd numbers is: " + rez[1]);

        List<Double> doubleNumbers = List.of(1.2 , 2.4 , 5.5 , 6.7);
        double[] rez2 = noviObjekat.sumEvenOdd(doubleNumbers);
        System.out.println("Sum of all even numbers is: " + rez2[0] + " And sum of all odd numbers is: " + rez2[1]);

        System.out.println(" ");

        List<Integer> intList = List.of(1, 2, 3, 4, 5);
        List<Integer> reversedIntList = noviObjekat.reverseList(intList);
        System.out.println("Reversed Integer List: " + reversedIntList);

        List<String> strList = List.of("apple", "banana", "cherry", "banana","kiwi");
        List<String> reversedStrList =noviObjekat.reverseList(strList);
        System.out.println("Reversed String List: " + reversedStrList);

        List<Double> doubleList = List.of(1.1, 2.2, 3.3, 4.4);
        List<Double> reversedDoubleList = noviObjekat.reverseList(doubleList);
        System.out.println("Reversed Double List: " + reversedDoubleList);

        // VJEZBA
        int indexOfTheElement = noviObjekat.firstOccurence(integerNumbers , 6);
        int indexOfTheElement2 = noviObjekat.firstOccurence(strList , "jagoda");
        System.out.println(indexOfTheElement + " " + indexOfTheElement2);

        System.out.println("");

        HashMap<String , String> mapa1 = new HashMap<>();
        mapa1.put("One" , "Lazar");
        mapa1.put("Two" , "Milan");
        mapa1.put("Three" , "Ivana");
        noviObjekat.printingPairs(mapa1);

        HashMap<Integer , Integer> mapa2 = new HashMap<>();
        mapa2.put(1 , 11);
        mapa2.put(2 , 22);
        mapa2.put(3 , 33);
        noviObjekat.printingPairs(mapa2);

    }
}
