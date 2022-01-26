public class Factorial {
          public static void main(String[] args) {
                    int x, sum;
                    x = 13;
                    sum = 1;
                    for (int i = 1; i <= x; i++) {
                              sum = sum * i;
                    }
                    System.out.println(sum);
                    // 6!=1*2*3*4*5*6 = sum
          }
}