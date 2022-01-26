public class BreakContinue {
          public static void main(String[] args) {
                    for (int i = 1; i <= 50; i++) {
                              if (i > 15) {
                                        break;
                              }
                              System.out.println(i);
                    }

                    for (int e = 1; e <= 50; e++) {
                              if (e == 15) {
                                        continue;
                              }
                              System.out.println(e);
                    }
          }
}