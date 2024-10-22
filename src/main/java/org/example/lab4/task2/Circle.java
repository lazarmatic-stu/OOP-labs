package org.example.lab4.task2;
import java.lang.Math;
import java.math.RoundingMode;

public class Circle extends Shape{
    private double radius;
    public Circle(String color , FillType fillType , double radius){
        super(color, fillType);
        this.radius = radius;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }

    @Override
    public void displayInfo() {
        System.out.println("Color of the circle is: " + super.getColor() + " \nthe status is: " + super.getFillType() + " \nand the radius is: " + this.radius);
    }

    public double getArea(){
        double pi = 3.14;
        double area = pi * (Math.pow(this.radius , 2.0));
        return area;
    }

    public double calculateCircumference(double pi, double r){
        double circumference = 2 * pi * r;
        return circumference;
    }
    public double calculateCircumference(double r){
        double pi = 3.14;
        double circumference = 2*pi*r;
        return circumference;
    }
}
