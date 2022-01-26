import java.util.Scanner;

public class SumOfDigits {
          public static void main(String[] args) {
                    Scanner num = new Scanner(System.in);
                    int sum = 0, r, temp, numInput;
                    System.out.print("Enter any number : ");
                    numInput = num.nextInt();

                    temp = numInput;

                    while (temp != 0) {
                              r = temp % 10;
                              sum = sum + r;
                              temp = temp / 10;
                    }
                    System.out.println("Sum of digits : " + sum);
          }
}
