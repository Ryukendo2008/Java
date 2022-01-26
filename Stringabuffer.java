public class Stringabuffer {
          public static void main(String[] args) {
                    StringBuffer sb = new StringBuffer("Ryukendo");

                    System.out.println(sb);

                    sb.append(" Rijin");
                    System.out.println(sb);

                    sb.reverse();
                    System.out.println(sb);

                    sb.delete(0, 5);
                    System.out.println(sb);

                    sb.setLength(7);
                    System.out.println(sb);
          }
}
