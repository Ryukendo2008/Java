import java.util.Scanner;

public class Switch {
          public static void main(String[] args) {
                    int digit;
                    Scanner digitInput = new Scanner(System.in);
                    digit = digitInput.nextInt();
                    switch (digit) {
                              case 1:
                                        System.out.println("One");
                                        break;
                              case 2:
                                        System.out.println("Two");
                                        break;
                              case 9:
                                        System.out.println("Nine");
                                        break;
                              case 16:
                                        System.out.println("sixteen");
                                        break;
                              case 0:
                                        System.out.println("Zero");
                                        break;

                              default:
                                        System.out.println("Not a Number");
                                        break;
                    }
          }
}
