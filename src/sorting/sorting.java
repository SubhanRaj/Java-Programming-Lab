// Java Program to sort given list of numbers 
package sorting;

import java.util.Scanner;

public class sorting {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the number of elements in the array: ");
            int n = input.nextInt();
            int[] array = new int[n];
            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < n; i++) {
                array[i] = input.nextInt();
            }
            System.out.println("The elements of the array are: ");
            for (int i = 0; i < n; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
            System.out.println("The sorted array is: ");
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (array[i] > array[j]) {
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }
}
