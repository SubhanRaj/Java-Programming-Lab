// Java program for sorting a given list of names

package nameSorting;
import java.util.Scanner;
import java.util.Arrays;


public class nameSorting {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the number of names: ");
            int n = input.nextInt();
            String[] names = new String[n];
            System.out.println("Enter the names: ");
            for (int i = 0; i < n; i++) {
                names[i] = input.next();
            }
            Arrays.sort(names);
            System.out.println("The sorted names are: ");
            for (int i = 0; i < n; i++) {
                System.out.println(names[i]);
            }
        }
    }
    
}
