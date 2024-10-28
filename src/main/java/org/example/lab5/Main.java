package org.example.lab5;

public class Main {
    public static void main(String [] args){
        Car car1 = new Car("Mercedes GLE" , 15000 , 34);
        System.out.println(car1.getMileage());
        System.out.println(car1.expectedLifespan());
        System.out.println(car1.getHealth());
        System.out.println(car1.calculateRemainingLifespan());
        car1.simulateYear();
        System.out.println(car1.calculateRemainingLifespan());
        car1.simulateYear();
        car1.simulateYear();
        System.out.println(car1.calculateRemainingLifespan());



    }
}
