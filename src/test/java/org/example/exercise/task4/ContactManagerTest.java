package org.example.exercise.task4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactManagerTest {
    @BeforeEach
    public void setup(){
        ContactManager manager1 = new ContactManager("contacts2.txt");
    }
    @Test
    public void ContactValidationTest(){
        
    }


}