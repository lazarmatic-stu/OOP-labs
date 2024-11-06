package org.example.lab6.nightSky;

public class Main {
    public static void main(String[] args){
        nightSky test = new nightSky(0.4,8,4);
        test.printLine();
        System.out.println("");
        System.out.println("");
        test.print();
        System.out.println("Number of stars:" + nightSky.starsInLastPrint());
        System.out.println("");
        test.print();
        System.out.println("Number of stars:" + nightSky.starsInLastPrint());
    }

}
