import java.util.Scanner;

public class InputDemo {
          public static void main(String[] args) {

                    System.out.println("Enter Any Number :");
                    Scanner input = new Scanner(System.in);
                    int num = input.nextInt();

                    String name;
                    System.out.println("What is your name ?");
                    Scanner nameInput = new Scanner(System.in);
                    name = nameInput.nextLine();
                    System.out.println("Hi," + name + ". How are you ?");

          }
}