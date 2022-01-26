public class StringBuilderDemo {
          public static void main(String[] args) {
                    StringBuilder str = new StringBuilder("Ryukendo");

                    System.out.println("Str : " + str);

                    str.append(" Rijin");
                    System.out.println(str);

                    str.reverse();
                    System.out.println(str);

                    str.delete(2, 5);
                    System.out.println(str);
          }
}
