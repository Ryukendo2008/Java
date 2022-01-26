public class ConversionBetweenStringPrimitive {
          public static void main(String[] args) {
                    int i = 100;
                    String s = Integer.toString(i);
                    System.out.println(s);

                    boolean b = true;
                    String s2 = Boolean.toString(b);
                    System.out.println(s2);

                    String s3 = "34";
                    int i2 = Integer.parseInt(s3);
                    System.out.println(i2);
          }
}
