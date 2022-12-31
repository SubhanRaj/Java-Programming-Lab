// Java program to implement binary search
package binarySearch;
import java.util.Scanner;

public class binarySearch {
    
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
            int low = 0;
            int high = n - 1;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (array[mid] == search) {
                    System.out.println("The element is present at position " + (mid + 1));
                    flag = 1;
                    break;
                } else if (array[mid] < search) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            if (flag == 0) {
                System.out.println("The element is not present in the array");
            }
        }
    }
}
