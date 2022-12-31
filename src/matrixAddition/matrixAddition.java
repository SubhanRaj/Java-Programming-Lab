// Java program to add two given matrices
package matrixAddition;

import java.util.Scanner;

public class matrixAddition {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the number of rows in the matrix: ");
            int m = input.nextInt();
            System.out.println("Enter the number of columns in the matrix: ");
            int n = input.nextInt();
            int[][] matrix1 = new int[m][n];
            int[][] matrix2 = new int[m][n];
            int[][] sum = new int[m][n];
            System.out.println("Enter the elements of the first matrix: ");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    matrix1[i][j] = input.nextInt();
                }
            }
            System.out.println("Enter the elements of the second matrix: ");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    matrix2[i][j] = input.nextInt();
                }
            }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    sum[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
            System.out.println("The sum of the two matrices is: ");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(sum[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

}
