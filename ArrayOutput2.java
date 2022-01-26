public class ArrayOutput2 {
          public static void main(String[] args) {

                    int numbers[][] = new int[4][];
                    int k = 0;

                    for (int row = 0; row < 4; row++) {
                              for (int col = 0; col < 5; col++) {
                                        numbers[row] = new int[col];
                              }
                    }

                    for (int row = 0; row < 4; row++) {
                              for (int col = 0; col < row + 1; col++) {
                                        numbers[row][col] = k;
                                        k++;
                              }
                              System.out.println();
                    }

                    for (int row = 0; row < 4; row++) {
                              for (int col = 0; col < row + 1; col++) {
                                        System.out.print(" " + numbers[row][col]);
                              }
                              System.out.println();
                    }
          }
}
