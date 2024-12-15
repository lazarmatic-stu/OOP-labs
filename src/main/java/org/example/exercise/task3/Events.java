package org.example.exercise.task3;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class Events {
    public void generateEventsFile(String filename , int numOfRecords) throws IOException {
        String[] fileNames = {"Login", "Logout", "Purchase", "ViewPage", "Error"};
        Random random = new Random();
        long startMillis = 1577836800000L;
        long endMillis = 1735689599999L;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
        for (int i = 0; i < numOfRecords; i++){
        String eventType = fileNames[random.nextInt(fileNames.length)];

        long randomMillis = startMillis + (long) (new Random().nextDouble() * (endMillis - startMillis));
        Date randomDate = new Date(randomMillis);
        String formattedDate = dateFormat.format(randomDate);

        int userID = random.nextInt(1000);
        writer.write(formattedDate + " " + eventType +" " + userID);
        writer.newLine();
        }
        writer.close();
    }
    public void printEvents(String filename) throws IOException {
    BufferedReader reader = new BufferedReader(new FileReader(filename));
    String line;
    while ((line = reader.readLine()) != null){
        System.out.println(line);
    }
    }
    public ArrayList<String> printEventsInArrayList(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;
        ArrayList<String> eventi = new ArrayList<>();
        while ((line = reader.readLine()) != null){
            eventi.add(line);
        }
        return eventi;
    }

    public static void main(String[] args) throws IOException {
        Events event = new Events();
        //event.generateEventsFile("novifajl" , 21);
        //event.printEvents("novifajl");
        System.out.println(Arrays.toString(new ArrayList[]{event.printEventsInArrayList("novifajl")}));
    }
}

