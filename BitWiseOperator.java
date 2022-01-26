import java.util.Scanner;

public class BitWiseOperator {
          public static void main(String[] args) {
                    // int a, b, c;
                    // a = 32;
                    // b = 12;
                    // c = a & b;
                    // System.out.println(c);

                    int x, y, large, small;
                    x = 9;
                    y = 8;
                    large = (x > y) ? x : y;
                    System.out.println("The large number is : " + large);

                    small = (x < y) ? x : y;
                    System.out.println("The small number is : " + small);
          }
}
