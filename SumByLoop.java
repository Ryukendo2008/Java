import java.util.Scanner;

public class SumByLoop {
          public static void main(String[] args) {
                    // int sum = 0;
                    // for (int i = 1; i <= 10; i++) {
                    // sum = sum + i;
                    // }
                    // System.out.println(sum);

                    System.out.print("Enter first number : ");
                    Scanner firstInput = new Scanner(System.in);
                    int x = firstInput.nextInt();

                    System.out.print("Enter second number : ");
                    Scanner secondInput = new Scanner(System.in);
                    int y = secondInput.nextInt();

                    int add = 0;
                    int add2 = 0;
                    for (int i = x; i <= y; i++) {
                              if (i % 2 == 0) {
                                        add = add + i;
                              } else if (i % 2 != 0) {
                                        add2 = add2 + i;
                              }
                    }
                    System.out.println(add2);
                    System.out.println(add);
          }
}
