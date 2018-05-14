package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("typ het aantal mijlen: ");
        double userInput = scanner.nextDouble();
        double kilometers = userInput * 1.6;

        int tussenstap = (int) (kilometers * 10);
        double result = tussenstap / 10.0;
        System.out.println(result);
    }
}
