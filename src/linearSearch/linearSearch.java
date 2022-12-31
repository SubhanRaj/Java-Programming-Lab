// Java program to implement linear search
package linearSearch;

import java.util.Scanner;

public class linearSearch {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the number of elements in the array: ");
            int n = input.nextInt();
            int[] array = new int[n];
            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < n; i++) {
                array[i] = input.nextInt();
            }
            System.out.println("Enter the element to be searched: ");
            int search = input.nextInt();
            int flag = 0;
            for (int i = 0; i < n; i++) {
                if (array[i] == search) {
                    System.out.println("The element is present at position " + (i + 1));
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("The element is not present in the array");
            }
        }
    }
}
