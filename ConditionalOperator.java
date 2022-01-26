import java.util.Scanner;

public class ConditionalOperator {
          public static void main(String[] args) {
                    Scanner numInput = new Scanner(System.in);
                    System.out.print("Enter two numbers : ");
                    int num1 = numInput.nextInt();
                    int num2 = numInput.nextInt();
                    int large = (num1 > num2) ? num1 : num2;
                    System.out.println("The large number is : " + large);
          }
}
