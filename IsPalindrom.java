import java.util.Scanner;

public class IsPalindrom {
          public static void main(String[] args) {
                    Scanner num = new Scanner(System.in);
                    int sum = 0, r, temp, numInput;
                    System.out.print("Enter any number : ");
                    numInput = num.nextInt();

                    temp = numInput;

                    while (temp != 0) {
                              r = temp % 10;
                              sum = sum * 10 + r;
                              temp = temp / 10;
                    }
                    if (numInput == sum) {
                              System.out.println("Palindrom number");
                    } else {
                              System.out.println("Not a palindrom number");
                    }
          }
}
