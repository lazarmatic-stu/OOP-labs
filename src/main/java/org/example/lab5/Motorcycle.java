package org.example.lab5;

public class Motorcycle extends Vehicle{
    public Motorcycle (String modelName){
        super(modelName);
    }
    public Motorcycle(String modelName , int mileage, int health){
        super(modelName, mileage, health);
    }
    @Override
    public String service(){
        return "Chain has been lubricated for " + super.getModelName() + " " + super.getMileage() + " " + super.getHealth();
    }
    @Override
    public int expectedLifespan(){
        if (super.getHealth() < 40)
            return 45000;
        return 50000;
    }
    public void race(int raceMiles){
        super.setMileage(getMileage() + raceMiles);
        super.setHealth(getHealth()-3);
    }
}
