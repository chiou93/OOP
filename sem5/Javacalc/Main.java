package Javacalc;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Please select the type of number to work with:");
                System.out.println("1. Rational");
                System.out.println("2. Complex");
                System.out.println("3. Exit");

                int choice = scanner.nextInt();
                if (choice == 3) {
                    break;
                }

                System.out.println("Please select the operation to perform:");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");

                int operation = scanner.nextInt();

                if (choice == 1) { //Rational
                    System.out.println("Enter the numerator of first rational number:");
                    int numer1 = scanner.nextInt();
                    System.out.println("Enter the denominator of first rational number:");
                    int denom1 = scanner.nextInt();
                    RationalNumber a = new RationalNumber(numer1, denom1);
                    System.out.println("Enter the numerator of second rational number:");
                    int numer2 = scanner.nextInt();
                    System.out.println("Enter the denominator of second rational number:");
                    int denom2 = scanner.nextInt();
                    RationalNumber b = new RationalNumber(numer2, denom2);
                    if (operation == 1) {
                        System.out.println("The result is : " + Calculator.add(a, b));
                    } else if (operation == 2) {
                        System.out.println("The result is : " + Calculator.subtract(a, b));
                    } else if (operation == 3) {
                        System.out.println("The result is : " + Calculator.multiply(a, b));
                    } else if (operation == 4) {
                        System.out.println("The result is : " + Calculator.divide(a, b));
                    } else {
                        System.out.println("Invalid operation");
                    }
                } else if (choice == 2) { //Complex
                    System.out.println("Enter the real part of first complex number:");
                    double real1 = scanner.nextDouble();
                    System.out.println("Enter the imaginary part of first complex number:");
                    double imaginary1 = scanner.nextDouble();
                    ComplexNumber a = new ComplexNumber(real1, imaginary1);
                    System.out.println("Enter the real part of second complex number:");
                    double real2 = scanner.nextDouble();
                    System.out.println("Enter the imaginary part of second complex number:");
                    double imaginary2 = scanner.nextDouble();
                    ComplexNumber b = new ComplexNumber(real2, imaginary2);
                    if (operation == 1) {
                        System.out.println("The result is : " + Calculator.add(a, b));
                    } else if (operation == 2) {
                    System.out.println("The result is : " + Calculator.subtract(a, b));
                    } else if (operation == 3) {
                    System.out.println("The result is : " + Calculator.multiply(a, b));
                    } else if (operation == 4) {
                    System.out.println("The result is : " + Calculator.divide(a, b));
                    } else {
                    System.out.println("Invalid operation");
                    }
                    } else {
                    System.out.println("Invalid choice");
                    }
                    }
        }
                }
                }
