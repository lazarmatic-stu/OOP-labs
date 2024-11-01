package org.example.lab5;

abstract class Vehicle {
    private String modelName;
    private int mileage;
    private int health;
    public Vehicle(String modelName){
        this.modelName = modelName;
        this.mileage = 0;
        this.health = 100;
    }
    public Vehicle(String modelName , int mileage , int health){
        this.modelName = modelName;
        this.mileage = mileage;
        this.health = health;
    }
    public String getModelName(){
        return this.modelName;
    }
    public void setModelName(String modelName){
        this.modelName = modelName;
    }
    public int getMileage(){
        return this.mileage;
    }
    public void setMileage(int mileage){
        this.mileage = mileage;
    }
    public int getHealth(){
        return this.health;
    }
    public void setHealth(int health){
        this.health = health;
    }
    @Override
    public String toString(){
        return this.getModelName() + " is here!";
    }
    public abstract String service();
    public abstract int expectedLifespan();
    public boolean needsMaintenance(){
        if (this.health < 70)
            return true;
        else return false;
    }
    public int calculateRemainingLifespan(){
        return expectedLifespan() - mileage;
    }
    public void simulateYear(){
        if ((expectedLifespan() / 2) < getMileage()) setHealth(getHealth()-5);
        else setHealth(getHealth()-2);
    }
    public void performMaintenence(Vehicle vehicle){
        if (vehicle instanceof Car){
            Car newCar = (Car) vehicle;
            newCar.repair();
            newCar.drive(500);
            System.out.println("Maintenence has been performed on CAR " + this.getModelName());
        }
        if (vehicle instanceof Truck){
            Truck newTruck = (Truck) vehicle;
            newTruck.repair();
            newTruck.haul(4500);
            System.out.println("Maintenence has been performed on TRUCK " + this.getModelName());
        }
        if (vehicle instanceof Motorcycle){
            Motorcycle newMotorcycle = (Motorcycle) vehicle;
            newMotorcycle.race(500);
            System.out.println("Maintenence has been performed on MOTORCYCLE " + this.getModelName());
        }
    }
}
