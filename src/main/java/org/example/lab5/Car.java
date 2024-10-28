package org.example.lab5;

public class Car extends Vehicle implements Repairable{
    public Car (String modelName){
        super(modelName);
    }
    public Car (String modelName , int mileage, int health){
        super(modelName , mileage , health);
    }
    @Override
    public String service(){
        return "Engine checked for model " + super.getModelName() + " with mileage of " + super.getMileage() + " and health of: " + super.getHealth();
    }
    @Override
    public int expectedLifespan(){
        if (super.getHealth() < 30)
            return 140000;
        return 150000;
    }
    @Override
    public String repair(){
        return "Engine oil changed for " + super.getModelName();
    }
    public void drive(int miles){
        setMileage(getMileage() + miles);
        setHealth(getHealth()-1);
    }
}
