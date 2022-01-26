import java.util.Scanner;

public class Series {
          public static void main(String[] args) {
                    Scanner nInput = new Scanner(System.in);
                    System.out.print("Enter nth number : ");
                    int n = nInput.nextInt();
                    int sum = 0;
                    for (int i = 1; i <= n; i++) {

                              sum = sum + i * i;
                    }
                    System.out.println(sum);
          }
}