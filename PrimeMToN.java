import java.util.Scanner;

public class PrimeMToN {
          public static void main(String[] args) {
                    Scanner input = new Scanner(System.in);
                    System.out.print("Enter frist number : ");
                    int x = input.nextInt();
                    Scanner input2 = new Scanner(System.in);
                    System.out.print("Enter second number : ");
                    int y = input2.nextInt();

                    int count = 0;
                    for (int i = x; i <= y; i++) {
                              for (int j = 2; j <= i - 1; j++) {
                                        if (y % i == 0) {
                                            count++;
                                                break;
                                        }
                              }
                              if (count == 0) {
                                    System.out.println(i);
                                  count = 0;
                              }
                    }
          }
}
