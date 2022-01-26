import java.util.Scanner;

public class TimeTable {
          public static void main(String[] args) {
                    Scanner userInput = new Scanner(System.in);
                    System.out.print("Enter any number to multiplicate it : ");
                    int x = userInput.nextInt();
                    System.out.print("Enter the length : ");
                    int y = userInput.nextInt();

                    for (int i = 1; i <= y; i++) {
                              System.out.println(x + " X " + i + " = " + x * i);
                    }
          }
}