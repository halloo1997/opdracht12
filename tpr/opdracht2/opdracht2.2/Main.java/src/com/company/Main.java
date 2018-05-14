package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hoeveel jaar oud ben je?");
        int jaar = scanner.nextInt();
        System.out.println("Hoeveel maanden komen daar nog bij?");
        int maanden = scanner.nextInt();
        int j =  jaar * 365 * 24 * 60;
        int m = maanden * 30 * 24 * 60;
        int berekening = j + m;
        System.out.println("Dan ben je nu ongeveer " + berekening + " minuten oud.");


    }
}