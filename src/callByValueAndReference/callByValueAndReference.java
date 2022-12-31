// Java Program to demonstrate call by value and call by reference
package callByValueAndReference;

import java.util.Scanner;

public class callByValueAndReference {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Call by value
            System.out.println("Enter a value for call by value: ");
            int value = scanner.nextInt();
            System.out.println("Original value: " + value);
            changeValue(value);
            System.out.println("Value after calling changeValue method: " + value);

            // Call by reference
            int[] values = { 0 };
            System.out.println("Enter a value for call by reference: ");
            values[0] = scanner.nextInt();
            System.out.println("Original values: " + values[0]);
            changeReference(values);
            System.out.println("Values after calling changeReference method: " + values[0]);
        }
    }

    public static void changeValue(int value) {
        value = 20;
    }

    public static void changeReference(int[] values) {
        values[0] = 20;
    }

}
