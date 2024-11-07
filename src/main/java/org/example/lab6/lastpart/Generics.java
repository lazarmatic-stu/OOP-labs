package org.example.lab6.lastpart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
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

    // VJEZBA
    public <T> int firstOccurence(List<T> list , T element){
        for (int i = 0; i<list.size(); i++){
            if (list.get(i).equals(element)) return i;
        }
        return -1;
    }
    public <T> void printingPairs(HashMap<T , T> mapa){
        ArrayList<String> lista = new ArrayList<>();
        for (T key : mapa.keySet()){
            lista.add("Key: " + key + " , " +"value: " + mapa.get(key));
        }
        for (String word : lista){
            System.out.println(word);
        }
    }
}