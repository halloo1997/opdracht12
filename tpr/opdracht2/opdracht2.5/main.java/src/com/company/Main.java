package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Typ een getal tussen 0 en 1000");
        int userInput = scanner.nextInt();

        if (userInput >= 100 && userInput < 1000) {
            int lastDigit = userInput % 10;
            userInput = userInput / 10;

            int middleDigit = userInput % 10;
            userInput = userInput / 10;

            int firstDigit = userInput;

            int product = firstDigit * middleDigit * lastDigit;

            System.out.println(firstDigit + "x" + middleDigit + "x" + lastDigit + "=" + product + "\n\n");
            } else if (userInput >= 10 && userInput < 100){
            int lastDigit = userInput % 10;
            userInput = userInput / 10;

            int firstDigit = userInput;

            int product = firstDigit * lastDigit;

            System.out.println(firstDigit +  "x" + lastDigit + "=" + product + "\n\n");

        } else if (userInput >= 0 && userInput <10){
            System.out.println(userInput + "=" + userInput + "\n\n");


        } else {
            System.out.println("Sorry, je getal is niet goed.");
        }
    }
}