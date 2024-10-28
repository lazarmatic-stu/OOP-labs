package org.example.lab5;

public class Truck extends Vehicle implements Repairable{
    public Truck(String modelName){
        super(modelName);
    }
    public Truck(String modelName, int mileage, int health){
        super(modelName, mileage, health);
    }

    @Override
    public String repair() {
        return "Engine overhauled and tires replaced for " + super.getModelName();
    }
    @Override
    public String service(){
        return "Truck serviced: " + super.getModelName() + " " +super.getMileage() + " " +super.getHealth();
    }
    @Override
    public int expectedLifespan(){
        if (getHealth() < 35)
            return 280000;
        return 300000;
    }
    public void haul(int loadWeight){
        if (loadWeight > 5000)
            super.setHealth(super.getHealth()-15);
    }
}
