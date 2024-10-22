package org.example.lab4.task2;

public class Rectangle extends Shape{
    double width;
    double height;
    public Rectangle (String color , FillType filltype , double width , double height ){
        super(color,filltype);
        this.width = width;
        this.height = height;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getWidth(){
        return this.width;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getHeight(){
        return this.height;
    }
    @Override
    public void displayInfo(){
        System.out.println("Color of the rectangle is: " + super.getColor()
                + " \nthe status is: " + super.getFillType()
                + " \nand the height is: " + this.height
                + " \nand the width is: " + this.width);
    }

    public double getArea(){
        double area = this.height * this.width;
        return area;
    }

}
