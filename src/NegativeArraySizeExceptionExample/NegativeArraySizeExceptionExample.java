//  Java program that uses try and catch block and check whether the given array size is negative or not

package NegativeArraySizeExceptionExample;

import java.util.Scanner;

class NegativeArraySizeExceptionExample {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the size of the array: ");
            int size = scanner.nextInt();

            try {
                int[] array = new int[size];
                System.out.println("Array created with size: " + array.length);
            } catch (NegativeArraySizeException e) {
                System.out.println("Exception occurred: " + e.getMessage());
            }
        }
    }
}
