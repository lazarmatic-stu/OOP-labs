package org.example.lab6.lastpart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private HashMap<String, String> dictionary = new HashMap<>();
    public Dictionary(){
        dictionary = new HashMap<>();
    }
    public void add(String word , String translation){
        dictionary.put(word,translation);
    }
    public String translate(String word){
        return dictionary.getOrDefault(word, "The word " + word + " is not in the dictionary!");
    }
    public int amountOfWords(){
        return dictionary.size();
    }
    public ArrayList<String> translationList() {
        ArrayList<String> list = new ArrayList<>();
        for (String key : dictionary.keySet()) {
            list.add(key + " = " + dictionary.get(key));
        }
        return list;
    }


}
