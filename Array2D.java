public class Array2D {
          public static void main(String[] args) {
                    int[][] nums = new int[2][3];

                    nums[0][0] = 10;
                    nums[0][1] = 20;
                    nums[0][2] = 30;
                    nums[1][0] = 40;
                    nums[1][1] = 50;
                    nums[1][2] = 60;

                    for (int row = 0; row < 2; row++) {
                              for (int col = 0; col < 3; col++) {
                                        System.out.print(" " + nums[row][col]);
                              }
                    }
          }
}
