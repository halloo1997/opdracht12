package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        //opdracht 1.1
//        System.out.println("Opdracht 1.1");
//        System.out.println("Java is Object Georiënteerd\n" +
//                "Java is strongly typed\n" +
//                "Java is geen JavaScript\n ");
//
//        //opdracht 1.2
//        System.out.println("Opdracht 1.2");
//        System.out.println("Java is geweldig!\n" +
//                "Java is geweldig!\n" +
//                "Java is geweldig!\n" +
//                "Java is geweldig!\n" +
//                "Java is geweldig!\n");
//
//        //opdracht 1.3
//        System.out.println("Opdracht 1.3");
//        System.out.println("a    a^2  a^3  a^4\n" +
//                           "1    1    1    1\n" +
//                           "2    4    8    16\n" +
//                           "3    9    27   81\n" +
//                           "4    16   64   256\n");
//
//        //opdracht 1.4
//        System.out.println("Opdracht 1.4");
//        double som = ( (7.5 * 6.5) - (4.5 * 3) )/ (47.5 * 5.5);
//        System.out.println(som + "\n");
//
//        //opdracht 1.5
//        System.out.println("Opdracht 1.5");
//        int sommen = ( 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10);
//        System.out.println(sommen + "\n");
//
//        //opdracht 1.6
//        System.out.println("Opdracht 1.6");
//        double breuk = 4.0 * (1.0 - 1/3.0 +1/5.0 - 1/7.0 + 1/9.0 - 1/11.0 + 1/13.0);
//        System.out.println(breuk + "\n");
//
//        //opdracht 1.7
//        System.out.println("Opdracht 1.7");
//        double math = 3.14159;
//        double straal = 6.5;
//        double oppervlakte = straal * straal * math;
//        double omtrek = 2 * straal * math;
//        System.out.println("oppervlakte = " + oppervlakte);
//        System.out.println("omtrek = " + omtrek + "\n");
//
//        //opdracht 1.8
//        System.out.println("Opdracht 1.8");
//        double lengte = 5.3;
//        double breedte =  8.6;
//        double oppervlakted = lengte * breedte;
//        double omtrekd = 2 * ( lengte + breedte );
//        System.out.println("oppervlakte = " + oppervlakted);
//        System.out.println("omtrek = " + omtrekd + "\n");
//
//        //opdracht 2.1
//        System.out.println("Opdracht 2.1");
//        System.out.println("Typ het aantal mijlen:");
//        double userInput = scanner.nextDouble();
//        double kilometers = userInput * 1.6;
//        System.out.println(kilometers + "\n");
//
//        //opdracht 2.2
//        System.out.println("Opdracht 2.2");
//        System.out.print("Hoeveel jaar oud ben je?");
//        int jaar = scanner.nextInt();
//        System.out.print("Hoeveel maanden komen daar nog bij?");
//        int maanden = scanner.nextInt();
//        int j =  jaar * 365 * 24 * 60;
//        int m = maanden * 30 * 24 * 60;
//        int uitkomst = j + m;
//        System.out.println(" Je bent nu ongeveer " + uitkomst + " minuten oud\n");
//
//        //opdracht 2.3
//        System.out.println("Opdracht 2.3");
//        System.out.print("Typ het startbedrag:");
//        double sb = scanner.nextDouble();
//        System.out.print("Typ het rentepercentage:");
//        double rp = scanner.nextDouble();
//        double rente = rp / 100 * sb;
//        double totaalbedrag = sb + rente;
//        System.out.println(" de rente is " + rente +" en het totaalbedrag is " + totaalbedrag + "\n");

//        //opdracht 2.4
//        System.out.println("Opdracht 2.4");
//        System.out.print("Typ een getal tussen 10 en 100:");
//        double getal = scanner.nextDouble();
//        while (getal < 10 || getal > 100) {
//            System.out.println("Vul een goed getal in tussen de 10 en 100: ");
//            getal = scanner.nextDouble();
//        }
//        System.out.println(getal -2 + " ");
//        System.out.println(getal -1 + " ");
//        System.out.println(getal + " ");
//        System.out.println(getal +1 + " ");
//        System.out.println(getal +2 + " \n");

//        //opdracht 2.5
//        System.out.println("Opdracht 2.5");
//        System.out.print("Typ een getal tussen 0 en 1000:");
//        double nummer = scanner.nextDouble();
//        while (nummer < 0 || nummer > 100) {
//            System.out.println("Vul een goed getal in tussen de 10 en 1000: ");
//            nummer = scanner.nextDouble();

//            //opdracht 3.1
//            System.out.println("Opdracht 3.1");
//            int random1 = (int)(Math.random() * 11 + 1);
//            int random2 = (int)(Math.random() * 11 + 1);
//            System.out.print("Hoeveel is " + random1+  " + " + random2 + " = ");
//            int antwoord = random1 + random2;
//            double uitkomst = scanner.nextDouble();
//            if (uitkomst == random1 + random2){
//                System.out.println("Klopt!");
//            }else {
//                System.out.println("Je antwoord is fout. het antwoord moest zijn " + antwoord );
//            }

//            //opdracht 3.2
//            System.out.println("Opdracht 3.2");
//            int random1 = (int)(Math.random() * 10 + 1);
//            int random2 = (int)(Math.random() * 10 + 1);
//            int random3 = (int)(Math.random() * 10 + 1);
//            System.out.println("Hoeveel is " + random1 + " x " + random2 + " x " + random3 + "?");
//            int antwoord = random1 * random2 * random3;
//            int uitkomst = scanner.nextInt();
//            if (uitkomst == random1 * random2 * random3){
//                System.out.println("Het antwoord is goed");
//            } else {
//                System.out.println("Je antwoord is fout. het antwoord moest zijn " + antwoord );
//            }

//        //opdracht 3.3
//        System.out.println("Opdracht 3.3");
//        int random1 = (int)(Math.random() * 12 + 1);
//        if (random1 == 1) {
//            System.out.println("Het random getal is 1 en dat is de maand januari");
//        }else if (random1 == 2){
//            System.out.println("Het random getal is 2 en dat is de maand februari");
//
//        }else if (random1 == 3){
//            System.out.println("Het random getal is 3 en dat is de maand maart");
//
//        }else if (random1 == 4){
//            System.out.println("Het random getal is 4 en dat is de maand april");
//
//        }else if (random1 == 5){
//            System.out.println("Het random getal is 5 en dat is de maand mei");
//
//        }else if (random1 == 6){
//            System.out.println("Het random getal is 6 en dat is de maand juni");
//
//        }else if (random1 == 7){
//            System.out.println("Het random getal is 7 en dat is de maand juli");
//
//        }else if (random1 == 8){
//            System.out.println("Het random getal is 8 en dat is de maand augustus");
//
//        }else if (random1 == 9){
//            System.out.println("Het random getal is 9 en dat is de maand september");
//
//        }else if (random1 == 10){
//            System.out.println("Het random getal is 10 en dat is de maand oktober");
//
//        }else if (random1 == 11){
//            System.out.println("Het random getal is 11 en dat is de maand november");
//
//        }else if (random1 == 12){
//            System.out.println("Het random getal is 12 en dat is de maand december");
//
//        }

        //opdracht 3.4
        System.out.println("Opdracht 3.4");

    }


    }

