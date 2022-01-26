import java.util.Scanner;

public class Area {
          public static void main(String[] args) {
                    // area of a triangle

                    float half = 1 / 2f;

                    System.out.print("Base : ");
                    Scanner baseInput = new Scanner(System.in);
                    int base = baseInput.nextInt();

                    System.out.print("Height : ");
                    Scanner heightInput = new Scanner(System.in);
                    int height = heightInput.nextInt();

                    double area = half * base * height;
                    System.out.println("The area of a triangle is : " + area);

                    // area of a square
                    System.out.print("Enter an angle of a square : ");
                    Scanner angleInput = new Scanner(System.in);
                    double angle = angleInput.nextDouble();

                    double result = angle * angle;

                    System.out.println("The area of a square is : " + result);
          }
}
