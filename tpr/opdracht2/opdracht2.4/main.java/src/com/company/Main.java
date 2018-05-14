package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Typ een getal tussen 10 en 100");
        int getal = scanner.nextInt();
        System.out.print( getal - 2 + " ");
        System.out.print( getal - 1 + " ");
        System.out.print( getal + " ");
        System.out.print( getal + 1 + " ");
        System.out.print( getal + 2 + " ");

    }
}