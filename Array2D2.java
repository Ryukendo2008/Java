import java.util.Scanner;

public class Array2D2 {
          public static void main(String[] args) {
                    Scanner input = new Scanner(System.in);
                    Scanner input2 = new Scanner(System.in);
                    int[][] A = new int[2][3];
                    int[][] B = new int[2][3];

                    // getting input for A matrix
                    for (int row = 0; row < 2; row++) {
                              for (int col = 0; col < 3; col++) {
                                        A[row][col] = input.nextInt();
                              }
                    }
                    // printing A matrix
                    System.out.print("A = ");
                    for (int row = 0; row < 2; row++) {
                              for (int col = 0; col < 3; col++) {
                                        System.out.print(" " + A[row][col]);
                              }
                    }

                    // getting input for B matrix
                    for (int row = 0; row < 2; row++) {
                              for (int col = 0; col < 3; col++) {
                                        B[row][col] = input2.nextInt();
                              }
                    }
                    // printing B matrix
                    System.out.print("B = ");
                    for (int row = 0; row < 2; row++) {
                              for (int col = 0; col < 3; col++) {
                                        System.out.print(" " + B[row][col]);
                              }
                    }
          }
}