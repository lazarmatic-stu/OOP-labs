package org.example.lab4.task2;

public class Shape {
    private String color;
    private FillType fillType;
    public Shape(String color , FillType fillType){
        this.color = color;
        this.fillType = fillType;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }
    public void setFillType(FillType fillType){
        this.fillType = fillType;
    }
    public FillType getFillType(){
        return this.fillType;
    }
    public void displayInfo(){
        System.out.println("Color of the shape is: " + this.color + " \n    and the status is: " + this.fillType);
    }
}
