package org.example.lab4.task2;

public class Main {
    public static void main(String[] args){
        Shape milan = new Shape("red" , FillType.FILLED);
        milan.displayInfo();
        System.out.println("");
        Circle lazar = new Circle("blue" , FillType.NOT_FILLED , 3.85);
        lazar.displayInfo();
        System.out.println(lazar.getArea());
        System.out.println(lazar.calculateCircumference(4.55));
        System.out.println(lazar.calculateCircumference(3.14 , 4.55));
        System.out.println("");
        Rectangle ivana = new Rectangle("yellow" , FillType.FILLED , 4.55 , 7.45);
        ivana.displayInfo();
        System.out.println(ivana.getArea());
    }
}
