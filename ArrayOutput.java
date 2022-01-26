public class ArrayOutput {
          public static void main(String[] args) {
                    int numbers[][] = new int[4][5];
                    int k = 0;

                    for (int row = 0; row < 4; row++) {
                              for (int col = 0; col < 5; col++) {
                                        numbers[row][col] = k;
                                        k++;
                              }
                    }

                    for (int row = 0; row < 4; row++) {
                              for (int col = 0; col < 5; col++) {
                                        System.out.print(" " + numbers[row][col]);
                              }
                              System.out.println();
                    }
          }
}
