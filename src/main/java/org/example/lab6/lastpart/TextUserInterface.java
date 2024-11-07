package org.example.lab6.lastpart;

import java.util.Scanner;

public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;

    // Constructor that receives the scanner and dictionary objects
    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    // Starts the text user interface
    public void start() {
        // Start the loop for the user interface
        while (true) {
            System.out.print("Command: ");
            String command = reader.nextLine();  // Read user input

            // Handle commands
            if (command.equals("quit")) {
                System.out.println("Goodbye!");
                break;  // Exit the loop and end the program
            } else if (command.equals("add")) {
                // Handle the add command
                add();
            } else if (command.equals("translate")) {
                // Handle the translate command
                translate();
            } else {
                // Unknown command
                System.out.println("Unknown statement");
            }
        }
    }

    // Method to handle adding a word and its translation
    public void add() {
        System.out.print("Give a word: ");
        String word = reader.nextLine();  // Read the word

        System.out.print("Give the translation: ");
        String translation = reader.nextLine();  // Read the translation

        // Add the word and translation to the dictionary
        dictionary.add(word, translation);
        System.out.println("Translation added!");
    }

    // Method to handle translating a word
    public void translate() {
        System.out.print("Give a word: ");
        String word = reader.nextLine();  // Read the word to translate

        // Try to find the translation and print it
        String translation = dictionary.translate(word);
        if (translation != null) {
            System.out.println("Translation: " + translation);
        } else {
            System.out.println("Word not found");
        }
    }
}
