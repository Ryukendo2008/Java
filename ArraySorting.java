import java.util.Arrays;

public class ArraySorting {
          public static void main(String[] args) {
                    int[] numbers = { 10, -30, 25, 18, 5 };

                    Arrays.sort(numbers);

                    System.out.print("Assending : ");
                    for (int i = 0; i < numbers.length; i++) {
                              System.out.print(" " + numbers[i]);
                    }
                    System.out.println();

                    System.out.print("Dessending : ");
                    for (int i = numbers.length - 1; i >= 0; i--) {
                              System.out.print(" " + numbers[i]);
                    }
                    System.out.println();
          }
}
