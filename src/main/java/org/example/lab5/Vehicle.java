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
}
