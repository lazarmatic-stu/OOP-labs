package org.example.exercise;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    static Student student;
    @BeforeAll
    static void setup(){
        student = new Student("Lazar" , 20 );
    }
    @Test
    void testSetName(){
        student.setName("Marko");
        assertEquals("Marko" , student.getName());
    }
    @Test
    void testSetAge(){
        student.setAge(45);
        assertEquals(45 , student.getAge() , "Student age should be updated to 45");
    }
    @Test
    void multipleTests(){
        assertAll("Heading",
                () -> assertEquals("Lazar" , student.getName()),
                () -> assertEquals(20 , student.getAge())
                );
    }
    @AfterAll
    static void tearDown(){
        student = null;
    }


}