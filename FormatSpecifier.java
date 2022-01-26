public class FormatSpecifier {
          public static void main(String[] args) {
                    boolean b = true;
                    int i = 8956657;
                    char c = 'y';
                    float f = 8975.9f;
                    short s = 7835;
                    double d = 567.4565343;

                    System.out.printf("Boolean b = %b\n", b);
                    System.out.printf("Char c = %c\n", c);
                    System.out.printf("Short s = %d\n", s);
                    System.out.printf("Integer i = %d\n", i);
                    System.out.printf("Float f = %.3f\n", f);
                    System.out.printf("Double d = %.2f\n", d);
          }
}
