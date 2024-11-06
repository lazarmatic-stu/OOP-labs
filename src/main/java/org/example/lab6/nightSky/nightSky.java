package org.example.lab6.nightSky;

import java.util.Random;

public class nightSky {
    private double density;
    private int width;
    private int height;
    private static int starsInLastPrint;
    public nightSky(double density){
        this.density = density;
        this.width = 20;
        this.height = 10;
    }
    public nightSky(int width , int height){
        this.width = width;
        this.height = height;
        this.density = 0.1;
    }
    public nightSky(double density , int width , int height){
        this.density = density;
        this.width = width;
        this.height = height;
    }
    public void printLine(){
        Random rnd = new Random();
        for (int i = 1; i < width; i++){
            if (rnd.nextDouble() > this.density)
            System.out.print("*");
            else System.out.print(" ");
        }
    }
    public void print(){
        Random rnd = new Random();
    for (int j = 0; j < this.height; j++){
        for (int i = 0; i<this.width; i++){
            if (rnd.nextDouble() > this.density){
                System.out.print("*");
                starsInLastPrint++;
            }
            else System.out.print(" ");
        }
        System.out.println("");
    }
    }
    public static int starsInLastPrint(){
        return starsInLastPrint;
    }
}
