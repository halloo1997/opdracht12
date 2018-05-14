package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int userInput;

// OPDRACHT 3.1

        System.out.println("Hoeveel is 7 + 5");
        userInput = scanner.nextInt();

        if (userInput == 12) {
            System.out.println("Klopt!");
        } else {
            System.out.println("Je antwoord is fout.");
        }


//OPDRACHT 3.2


        System.out.println("Hoeveel is 2 x 5 x 7");
        userInput = scanner.nextInt();

        if (userInput == 70) {
            System.out.println("Klopt!");
        } else {
            System.out.println("Je antwoord is fout.");
        }

//OPDRACHT 3.3

        int random1 = (int) (Math.random() * 12 + 1);
        String maand = "onbekend";
        switch (random1) {
            case 1:
                maand = "januari";
                break;
            case 2:
                maand = "februari";
                break;
            case 3:
                maand = "maart";
                break;
            case 4:
                maand = "april";
                break;
            case 5:
                maand = "mei";
                break;
            case 6:
                maand = "juni";
                break;
            case 7:
                maand = "juli";
                break;
            case 8:
                maand = "augustus";
                break;
            case 9:
                maand = "september";
                break;
            case 10:
                maand = "oktober";
                break;
            case 11:
                maand = "november";
                break;
            case 12:
                maand = "december";
                break;
        }
        System.out.println("Het random getal is " + random1 + " en dat is de maand " + maand);

//OPDRACHT 3.4

        System.out.println("Welke weekdag is het nu? ( 1 = ma / 2 = di / 3 = wo / 4 = do / 5 = vr / 6 = za / 7 = zo )");
        int weekdag = scanner.nextInt();
        System.out.println("En van hoeveel dagen in de toekomst wil je de weekdag berekenen?");
        int dagenVooruit = scanner.nextInt();
        int resultaat = weekdag + dagenVooruit;
        if (resultaat > 7) {
            resultaat = resultaat % 7;
        }
        String[] weekdagen = {"onbekend", "maandag", "dinsdag", "woensdag", "donderdag", "vrijdag", "zaterdag", "zondag"};
        System.out.println("Vandaag is het" + weekdagen[weekdag] + " en over " + dagenVooruit + " dagen is het " + weekdagen[resultaat]);

//OPDRACHT 3.5
        System.out.print("Wat is uw gewicht (kg)?");
        double gewicht = scanner.nextDouble();
        System.out.print("Wat is uw lengte (m)?");
        double lengte = scanner.nextDouble();
        double teller = gewicht;
        double noemer = lengte * lengte;
        double bmi = teller / noemer;
        int tussenstap = (int) (bmi * 100);
        bmi = tussenstap /100.0;
        System.out.println("Uw BMI is " + bmi + ".");
        String conclusie = "onbekend";
        if (bmi < 18.5) {
            conclusie = "ondergewicht heeft";
        } else if (bmi < 25) {
            conclusie = "normaal gewicht heeft";
        } else if (bmi < 30) {
            conclusie = "overgewicht heeft";
        } else {
            conclusie = "zwaar overgewicht heeft";
        }
        System.out.println("Als u minstens 20 jaar bent betekent dit dat u " + conclusie + ".");

        //opdracht 3.6
        System.out.print("Getal 1: ");
        int getal1 = scanner.nextInt();
        System.out.print("Getal 2: ");
        int getal2 = scanner.nextInt();
        System.out.print("Getal 3: ");
        int getal3 = scanner.nextInt();
        int[] getallen = {getal1, getal2, getal3};
        Arrays.sort(getallen);
        System.out.println("Van klein naar groot: " + getallen[0] + " - " + getallen[1] + " - " + getallen[2]);

    }
}




