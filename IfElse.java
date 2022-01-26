import java.util.Scanner;

public class IfElse {
          public static void main(String[] args) {
                    int Samsung = 15000;
                    int Walton = 90000;

                    if (Samsung > Walton) {
                              System.out.println("I will buy Walton Phone.");
                    } else {
                              System.out.println("I will buy a Samsung Phone.");
                    }

                    System.out.print("Enter any number : ");
                    Scanner numInput = new Scanner(System.in);
                    int num = numInput.nextInt();

                    if (num > 0) {
                              System.out.println("Positive");
                    } else if (num == 0) {
                              System.out.println("Zero");
                    } else {
                              System.out.println("Nagetive");
                    }
          }
}