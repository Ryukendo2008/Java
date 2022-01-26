import java.util.Scanner;

public class FarenhiteToCelcius {
          public static void main(String[] args) {
                    double cel, far;

                    System.out.print("Farenhite : ");
                    Scanner farInput = new Scanner(System.in);
                    far = farInput.nextDouble();

                    cel = (double) 5 / 9 * (far - 32);
                    System.out.println("Celcius : " + cel);
          }
}
