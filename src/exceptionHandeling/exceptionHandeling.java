// Java Program that demonstrate exception handling mechanism.
package exceptionHandeling;

import java.util.Scanner;

public class exceptionHandeling {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int num = scanner.nextInt();

            try {
                // This code may throw an exception
                int result = 100 / num;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                // This block is executed if an exception is thrown
                System.out.println("Exception occurred: " + e.getMessage());
            } finally {
                // This block is always executed, regardless of whether an exception is thrown
                System.out.println("Finally block is executed");
            }
        }
    }
}
