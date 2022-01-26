import java.util.Scanner;

public class Matrix {
          public static void main(String[] args) {
                    Scanner input = new Scanner(System.in);
                    int[][] numbers = new int[2][3];
                    int sum = 0;
                    for (int row = 0; row < 2; row++) {
                              for (int col = 0; col < 3; col++) {
                                        numbers[row][col] = input.nextInt();
                                        System.out.println(numbers[row][col]);
                                        sum = sum + numbers[row][col];
                              }
                    }
                    System.out.println(sum);
          }
}
