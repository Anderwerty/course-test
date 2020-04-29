package com.example.calculator;

import java.util.Scanner;

public class CalculatorApplication {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int division = scanner.nextInt();
        final int divisor = scanner.nextInt();

        final int result = division / divisor;
        final int delta = division % divisor;

        System.out.println(result + " delta=" + delta);
    }
}
