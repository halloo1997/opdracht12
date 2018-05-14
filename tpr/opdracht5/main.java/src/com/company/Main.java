package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean proceed;

//        //opdracht 5.1
//        proceed = true;
//        while (proceed) {
//            System.out.println("\nWat is je toetscijfer? ");
//            double grade = scanner.nextDouble();
//            if (grade <= -1) {
//                System.out.println("Tot ziens.");
//                proceed = false;
//                continue;
//            } else if (grade >= 5.5) {
//                System.out.println("Je hebt een voldoende!");
//            } else {
//                System.out.println("Helaas, je hebt een onvoldoende.");
//            }
//        }
//
//        //opdracht 5.2
//        int score = 0;
//        for (int i = 0; i < 10 ; i++) {
//            int getal1 = (int) (Math.random() * 10 + 1);
//            int getal2 = (int) (Math.random() * 10 + 1);
//            int optelstom = getal1 + getal2;
//            System.out.println("Hoeveel is " + getal1 + "+" + getal2 + "?");
//            int userInput = scanner.nextInt();
//            if (userInput == optelstom) {
//                System.out.println("Dat klopt!");
//                score++;
//            } else{
//                System.out.println("Helaas, het goede antwoord is " + optelstom + ".");
//            }
//        }
//        System.out.println("\nDe toets is klaar. Je score is " + score + ".");

        //opdracht 5.3
//        for (int i = 1; i <= 10; i++) {
//            int product = i * 7;
//            System.out.println(i + " x 7 = " + product);
//        }


        //opdracht 5.4
//        int lowestNumber = 0;
//        for (int i = 0; i < 5; i++) {
//            System.out.print("Type een getal: ");
//            int number = scanner.nextInt();
//            if (i == 0) {
//                lowestNumber = number;
//            } else {
//                if (number < lowestNumber) {
//                    lowestNumber = number;
//                }
//            }
//        }
//        System.out.println("Het laagste getal wat je hebt getypt was " + lowestNumber + ".");
//
    // Opdracht 5.5
//        double highestGrade = 0;
//        String student = "unknown";
//        for (int i = 1; i <= 5; i++) {
//            System.out.print("Hoe heet de " + i + "e student?");
//            String name = scanner.nextLine();
//            System.out.print("Wat was zijn of haar cijfer?");
//            double grade = scanner.nextDouble();
//            scanner.nextLine();
//            if (i == 0) {
//                highestGrade = grade;
//                student = name;
//            } else {
//                if (grade > highestGrade) {
//                    highestGrade = grade;
//                    student = name;
//                }
//            }
//        }
//        System.out.println("Het hoogste cijfer is behaald door " + student + ".");
//        System.out.println("Hij of zij had een " + highestGrade + ".");

        // Opdracht 5.6
//        for (int i = 0; i < 100; i++) {
//            if (i % 5 == 0) {
//                System.out.println(i + " is deelbaar door 5");
//            }
//        }

        //opdracht 5.7
        proceed = true;
        int counter = 0;
        while (proceed){
            int square = counter * counter;
            if (square <1000) {
                System.out.println("Het getal is " + counter);
                System.out.println(" Het kwadraat daarvan is " + square);
                counter++;
            }else  {
                proceed =false;

            }
        }

    }
}

