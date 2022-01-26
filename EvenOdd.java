import java.util.Scanner;

public class EvenOdd {
          public static void main(String[] args) {
                    Scanner checkInput = new Scanner(System.in);
                    System.out.print("Enetr any number : ");
                    int check = checkInput.nextInt();

                    int remainder = check % 2;
                    if (remainder == 0) {
                              System.out.println("The number is Even .");
                    } else {
                              System.out.println("The number is Odd .");
                    }
          }
}
