public class StringDemo1 {
          public static void main(String[] args) {
                    String s1 = "Ryukendo Rijin";
                    String s2 = new String("ryukendo Rijin");

                    char[] c1 = { 'M', 'a', 'h', 'm', 'u', 'd' };

                    System.out.println("String 1 : " + s1);
                    System.out.println("String 2 : " + s2);
                    System.out.println(c1);

                    System.out.println("Length of s1 : " + s1.length());

                    if (s1.equals(s2)) {
                              System.out.println("Equals");
                    } else {
                              System.out.println("Not equals");
                    }

                    if (s1.equalsIgnoreCase(s2)) {
                              System.out.println("Equals");
                    } else {
                              System.out.println("Not equals");
                    }

          }
}
