import java.util.Scanner;

public class ArithmeticDemo {
          public static void main(String[] args) {
                    // int num1, num2, result;
                    // num1 = 17;
                    // num2 = 6;

                    // result = num1 + num2;
                    // System.out.println("Sum = " + result);

                    // result = num1 - num2;
                    // System.out.println("Submission = " + result);

                    // result = num1 * num2;
                    // System.out.println("Sum = " + result);

                    // result = num1 / num2;
                    // System.out.println("Sum = " + result);

                    // result = num1 % num2;
                    // System.out.println("Sum = " + result);

                    int num1, num2, result;

                    System.out.print("Enter 1st number : ");
                    Scanner numberInput = new Scanner(System.in);
                    num1 = numberInput.nextInt();
                    System.out.print("Enter 2nd number : ");
                    Scanner numberInput2 = new Scanner(System.in);
                    num2 = numberInput2.nextInt();

                    result = num1 + num2;
                    System.out.println("The result is : " + result);

                    double divission = num1 / (double) num2;
                    System.out.println("The result is : " + divission);
          }
}
