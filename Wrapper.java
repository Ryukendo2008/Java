public class Wrapper {
          public static void main(String[] args) {
                    // primitive to object
                    int x = 3;
                    Integer y = Integer.valueOf(x);
                    System.out.println(y);

                    Integer z = x; // Integer.valueOf(x) //autoboxing
                    System.out.println(z);

                    // object to primitive
                    Double d = new Double(10.5);
                    System.out.println(d);

                    double e = d.doubleValue();
                    System.out.println(e);
          }
}
