package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String userInput;
        int getal1;
        int getal2;
        int product;

        // Opdracht 6.1
        System.out.println("\nOpdracht 6.1");
        printZinnetje();

        // Opdracht 6.2
        System.out.println("\nOpdracht 6.2");
        System.out.print("Welk zinnetje moet ik printen? ");
        userInput = scanner.nextLine();
        printZinnetje(userInput);

        // Opdracht 6.3
        System.out.println("\nOpdracht 6.3");
        getal1 = (int) (Math.random() * 10 + 1);
        getal2 = (int) (Math.random() * 10 + 1);
        product = berekenProduct(getal1, getal2);
        System.out.println("Het prodcut van " + getal1 + " en " + getal2 + " is " +
                "" + product + ".");

        // Opdracht 6.4
        System.out.println("\nOpdracht 6.4");
        System.out.println("We gaan twee getallen vermenigvuldigen.");
        System.out.print("Wat is het eerste getal?");
        getal1 = scanner.nextInt();
        System.out.print("Wat is het tweede getal?");
        getal2 = scanner.nextInt();
        product = berekenProduct(getal1, getal2);
        System.out.println("Het prodcut van " + getal1 + " en " + getal2 + " is " +
                "" + product + ".");

        // Opdracht 6.5
        System.out.println("\nOpdracht 6.5");
        System.out.print("Van welk getal wil je de weekdag weten?");
        getal1 = scanner.nextInt();
        String dag = bepaalDag(getal1);
        System.out.println("Bij nummer " + getal1 + " hoort de weekdag " + dag + ".");

        // Opdracht 6.6
        System.out.println("\nOpdracht 6.6");
        System.out.println("Van welk getal wil je weten of het een even getal is?");
        getal1 = scanner.nextInt();
        boolean isEven = isEvenGetal(getal1);
        if (isEven) {
            System.out.println("Het getal " + getal1 + " is een even getal.\n");
        } else {
            System.out.println("Het getal " + getal1 + " is geen even getal.\n");
        }

        // Opdracht 6.7
        System.out.println("\nOpdracht 6.7");
        System.out.print("Van welk getal wil je weten of het een priemgetal is?");
        getal1 = scanner.nextInt();
        boolean isPriem = isPriemgetal(getal1);
        if (isPriem) {
            System.out.println("Het getal " + getal1 + " is inderdaad een priemgetal.\n");
        } else {
            System.out.println("Het getal " + getal1 + " is inderdaad geen priemgetal.\n");
        }
    }


    public static void printZinnetje() {
        System.out.println("Hello world");
    }

    public static void printZinnetje(String zinnetje) {
        System.out.println(zinnetje);
    }

    public static int berekenProduct(int getal1, int getal2) {
        int product = getal1 * getal2;
        return product;
    }

    public static String bepaalDag(int dagnummer){
        if (dagnummer == 1){
            return "maandag";
        } else if (dagnummer == 2){
            return "dinsdag";
        } else if (dagnummer == 3){
            return "woensdag";
        } else if (dagnummer == 4){
            return "donderdag";
        } else if (dagnummer == 5){
            return  "vrijdag";
        } else if (dagnummer == 6){
            return "zaterdag";
        } else if (dagnummer == 7){
            return "zondag";
        } else {
            return "onbekend";
        }
    }

    public static boolean isEvenGetal(int getal){
        if (getal % 2 == 0) {
            return true;
        } else{
            return false;
        }
    }

    public static boolean isPriemgetal(int getal){
        if (getal <2) {
            return false;
        }
        if (getal == 2 || getal == 3) {
            return true;
        }
        for (int i = 2; i <= (getal / 2); i++) {
            if (getal % i == 0){
                return false;
        }

        }

        return true;
    }
}


