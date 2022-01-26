import java.util.Scanner;

public class PrimeNumber {
          public static void main(String[] args) {
                    Scanner primeInput = new Scanner(System.in);
                    System.out.print("Enter any number to check whether it is prime or not : ");
                    int prime = primeInput.nextInt();

                    int c = 0;
                    for (int i = 2; i < prime; i++) {
                              if (prime % i == 0) {
                                        c++;
                                        break;
                              }
                    }
                    if (c == 0) {
                              System.out.println("Prime number");
                    } else {
                              System.out.println("Not a prime number");
                    }
          }
}