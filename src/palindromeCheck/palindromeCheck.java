// Java program to check weather a given string is a palindrome or not
package palindromeCheck;

import java.util.Scanner;


public class palindromeCheck {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the string: ");
            String str = input.nextLine();
            String rev = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                rev += str.charAt(i);
            }
            if (str.equals(rev)) {
                System.out.println("The string is a palindrome");
            } else {
                System.out.println("The string is not a palindrome");
            }
        }
    }
    
}
