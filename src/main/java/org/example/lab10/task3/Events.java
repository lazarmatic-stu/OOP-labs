package org.example.lab10.task3;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class Events {

    public void generateEventsFile(String filename, int numberOfRecords) throws IOException {
        Random random = new Random();
        String[] eventTypes = {"Login", "Logout", "Purchase", "ViewPage", "Error"};
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (int i = 0; i < numberOfRecords; i++) {
                long timestamp = System.currentTimeMillis() - random.nextInt(1000000);
                Date date = new Date(timestamp);
                String formattedDate = sdf.format(date);

                String eventType = eventTypes[random.nextInt(eventTypes.length)];

                int userId = random.nextInt(1000);

                writer.write(String.format("%s | Event Type: %s | User ID: %d%n", formattedDate, eventType, userId));
            }
            System.out.println("Event file made successfully.");
        }
    }

    public void printEventsFromFile(String filename) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

    public ArrayList<String> readEventsFromFile(String filename) throws IOException {
        ArrayList<String> events = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                events.add(line);
            }
        }
        return events;
    }

    public static void main(String[] args) throws IOException {
        Events events = new Events();

        String filename = "events.txt";
        int numberOfRecords = 10;
        events.generateEventsFile(filename, numberOfRecords);

        System.out.println("");

        System.out.println("Events from file:");
        events.printEventsFromFile(filename);

        System.out.println("");

        ArrayList<String> eventList = events.readEventsFromFile(filename);
        System.out.println("Events stored in ArrayList:");
        for (String event : eventList) {
            System.out.println(event);
        }
    }
}
