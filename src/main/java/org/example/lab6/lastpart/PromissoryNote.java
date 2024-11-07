package org.example.lab6.lastpart;

import java.util.HashMap;

public class PromissoryNote {
    private HashMap<String , Double> loans = new HashMap<String, Double>();
    public PromissoryNote(){}
    public void setLoan(String toWhom, double value){
        loans.put(toWhom , value);
    }
    public double howMuchIsTheDebt(String whose){
        return loans.getOrDefault(whose, 0.0);
    }
}
