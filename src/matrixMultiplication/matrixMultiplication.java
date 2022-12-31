// Java program to multiply two matrices
package matrixMultiplication;

import java.util.Scanner;

public class matrixMultiplication {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the number of rows in the first matrix: ");
            int m = input.nextInt();
            System.out.println("Enter the number of columns in the first matrix: ");
            int n = input.nextInt();
            int[][] matrix1 = new int[m][n];
            System.out.println("Enter the elements of the first matrix: ");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    matrix1[i][j] = input.nextInt();
                }
            }
            System.out.println("Enter the number of rows in the second matrix: ");
            int p = input.nextInt();
            System.out.println("Enter the number of columns in the second matrix: ");
            int q = input.nextInt();
            int[][] matrix2 = new int[p][q];
            System.out.println("Enter the elements of the second matrix: ");
            for (int i = 0; i < p; i++) {
                for (int j = 0; j < q; j++) {
                    matrix2[i][j] = input.nextInt();
                }
            }
            if (n == p) {
                int[][] matrix3 = new int[m][q];
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < q; j++) {
                        for (int k = 0; k < n; k++) {
                            matrix3[i][j] += matrix1[i][k] * matrix2[k][j];
                        }
                    }
                }
                System.out.println("The product of the two matrices is: ");
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < q; j++) {
                        System.out.print(matrix3[i][j] + " ");
                    }
                    System.out.println();
                }
            } else {
                System.out.println("The matrices cannot be multiplied");
            }
        }
    }

}
