package org.example;

import java.util.Scanner;

import static org.example.Calculator.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        // Use the static methods you wrote in the Calculator class
        // to assign proper values to the four variables below
        // (instead of 0)
        int sum = 0;
        int difference = 0;
        int product = 0;
        int quotient = 0;

        System.out.println("The sum is " + add(3,5));
        System.out.println("The difference is " + difference(7, 5));
        System.out.println("The product is " + product(3,3));
        System.out.println("The quotient is " + divide(6, 2));
    }



}