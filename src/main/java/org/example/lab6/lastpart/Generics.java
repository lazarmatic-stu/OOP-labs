package org.example.lab6.lastpart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Generics{

    public <K extends Number> double[] sumEvenOdd(List<K> list){
        double evenSum = 0.0;
        double oddSum = 0.0;
        for (K number : list){
            double num = number.doubleValue();
            if (Math.floor(num)%2==0) evenSum+=num;
            else oddSum+=num;
        }
        return new double[]{evenSum , oddSum};
    }
    public  <T> List<T> reverseList(List<T> inputList) {
        List<T> reversedList = new ArrayList<>();
        for (int i = inputList.size() - 1; i >= 0; i--) {
            reversedList.add(inputList.get(i));
        }
        return reversedList; // Return the new list
    }
}