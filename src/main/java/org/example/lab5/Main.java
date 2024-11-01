package org.example.lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
        Car auto = new Car("Audi" , 15000 , 99);
        Truck kamion = new Truck("MAN" , 150000 , 44);
        Motorcycle motor = new Motorcycle("Yamaha" , 1500 , 79);
        Collections.addAll(vehicles , auto, kamion,motor);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a vehicle to perform maintenance:");
        int counter = 0;
        for (Vehicle vehicle : vehicles){
            System.out.println(counter + ". " + vehicle.getClass().getSimpleName() + " " + vehicle.getModelName());
            counter++;
        }
        int choice = scanner.nextInt();
        if (choice >= 0 && choice <= vehicles.size()){
            Vehicle localVehicle = vehicles.get(choice);
            localVehicle.performMaintenence(localVehicle);
        } else System.out.println("Invalid choice");
    }
    public static void downCasting(Vehicle vehicle){
        if (vehicle instanceof Car){
            Car myLocalCar = (Car) vehicle;
            myLocalCar.drive(5000);
        }
        if (vehicle instanceof Truck){
            Truck myLocalTruck = (Truck) vehicle;
            myLocalTruck.haul(4500);
        }
        if (vehicle instanceof Motorcycle){
            Motorcycle myLocalMotorcycle = (Motorcycle) vehicle;
            myLocalMotorcycle.race(400);
        }
    }

}
