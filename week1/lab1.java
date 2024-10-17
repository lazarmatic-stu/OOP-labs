package org.example;
//1.1
//      System.out.println("My name is John Doe");
//1.2
//      System.out.println("Hello world!");
//      System.out.println(" (And all the people of the world)");
//1.3
//      int days = 365;
//      int hours = 24;
//      int minutes = 60;
//      int seconds = 60;
//      int result = days * hours * minutes * seconds;
//      System.out.println("There is " + result + " seconds in a year.");
//1.4
//      Scanner reader = new Scanner(System.in);
//      System.out.println("Please enter first number: ");
//      int num1 = Integer.parseInt(reader.nextLine());
//      System.out.println("Please enter second number: ");
//      int num2 = Integer.parseInt(reader.nextLine());
//      System.out.println("Sum of your two numbers is: " + (num1+num2));
//1.5
//      Scanner reader = new Scanner(System.in);
//      System.out.println("Please enter a number: ");
//      int num1 = Integer.parseInt(reader.nextLine());
//      if (num1 > 0) System.out.println("Your number is positive");
//      else System.out.println("Your number is negative");
//1.6
//      Scanner reader = new Scanner(System.in);
//      System.out.println("Please enter first number: ");
//      int num1 = Integer.parseInt(reader.nextLine());
//      System.out.println("Please enter second number: ");
//      int num2 = Integer.parseInt(reader.nextLine());
//      if (num1 > num2) System.out.println(num1);
//      else if (num1<num2) System.out.println(num2);
//      else System.out.println("They are equal!");
//2.1
//        String password = "secret";
//        Scanner reader = new Scanner(System.in);
//        System.out.println("Please enter your desired password: ");
//        String userPassword = reader.nextLine();
//        while (!userPassword.equals(password)){
//            System.out.println("Enter it again: ");
//            userPassword = reader.nextLine();
//        }
//        if (userPassword.equals(password))
//            System.out.printf("You guessed right!");
//2.2
//        Scanner reader = new Scanner(System.in);
//        System.out.println("Please enter a number 1: ");
//        int num1 = Integer.parseInt(reader.nextLine());
//        System.out.println("Please enter a number 2: ");
//        int num2 = Integer.parseInt(reader.nextLine());
//        System.out.println("Please enter a number 3: ");
//        int num3 = Integer.parseInt(reader.nextLine());
//        int suma = num1 + num2 + num3;
//        System.out.println("Sum of your numbers is: " + (num1 + num2 + num3));
//2.3
//        Scanner reader = new Scanner(System.in);
//        int suma = 0;
//        while (true){
//            System.out.println("Enter a number");
//            int num1 = Integer.parseInt(reader.nextLine());
//            suma += num1;
//            System.out.println(suma);
//            if (num1 == 0)
//                break;
//        }
//2.4
//        Scanner reader = new Scanner(System.in);
//        System.out.println("Please enter first number: ");
//        int num1 = Integer.parseInt(reader.nextLine());
//        System.out.println("Please enter second number: ");
//        int num2 = Integer.parseInt(reader.nextLine());
//        while (num1 < num2 - 1){
//            num1++;
//            System.out.println(num1);
//            }
//        if (num1 > num2){
//            System.out.println(num1 + " " + num2);
//        }
//2.5
//        int number = 2;
//        int powerNumber = 4;
//        for (int j = 0; j < powerNumber + 1; j++) {
//                System.out.println((int)Math.pow(number, j));
//         }
//2.6
//        Scanner reader = new Scanner(System.in);
//        System.out.println("Please enter a number: ");
//        int number = Integer.parseInt(reader.nextLine());
//        for (int i = 0; i < number; i++){
//            System.out.println("In the beginning there were the swamp, the hoe and Java");
//        }
//2.7
//        for (int i = 0; i<10; i++){
//            for (int j = i; j < 10; j++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
//2.8
//        drawStarsPiramid(5);
//        public static void drawStarsPiramid(int rows){
//            for (int i = 1; i<rows+1; i++){
//                for (int j = 0; j < i; j++){
//                    System.out.print("*");
//                }
//                System.out.println("");
//            }
//2.9
//        drawNumbersPiramid(5);
//        public static void drawNumbersPiramid(int rows){
//            for (int i = 1; i<rows+2; i++){
//                for (int j = 1; j<i; j++){
//                    System.out.print(j);
//                }
//                System.out.println("");
//            }
//    }
//2.10
//        Scanner reader = new Scanner(System.in);
//        int number = 75;
//        int counter = 0;
//        System.out.println("Guess the number: ");
//        while (true) {
//            int guess = Integer.parseInt(reader.nextLine());
//            counter++;
//            if (guess > number)
//                System.out.println("Lower! - this is your " + counter + " guess");
//            else if (guess < number)
//                System.out.println("Higher! - this is your " + counter + " guess");
//            else {
//            System.out.println("You are correct!");
//                System.out.println("You made " + counter + " guesses");
//                break;
//            }
//        }

public class Main {
    public static void main(String[] args) {

    }
}

