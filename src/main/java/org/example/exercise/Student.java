package org.example.exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;


    public class Student {
        private String name;
        private int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public String getName() {
            return this.name;
        }
        public Integer getAge() {
            return this.age;
        }
        public void setAge(int age){
            this.age = age;
        }
        public void setName(String name){
            this.name = name;
        }
    }
