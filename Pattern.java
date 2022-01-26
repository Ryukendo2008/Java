import java.util.Scanner;

public class Pattern {
          public static void main(String[] args) {
                    Scanner num = new Scanner(System.in);
                    System.out.print("Enter a number : ");
                    int n = num.nextInt();

                    for (int row = n; row >= 1; row--) {
                              for (int col = 0; col <= row; col++) {
                                        System.out.print(" " + col);
                              }
                              System.out.println();
                    }
          }
}
