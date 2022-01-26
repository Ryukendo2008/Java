public class StringDemo2 {
          public static void main(String[] args) {
                    String firstName = "Ryukendo";
                    String lastName = " Rijin";
                    String fullName = firstName.concat(lastName);

                    System.out.println("Full name is : " + fullName);

                    String upperName = fullName.toUpperCase();
                    System.out.println("Full name is : " + upperName);

                    String lowerName = fullName.toLowerCase();
                    System.out.println("Full name is : " + lowerName);

                    //////////
                    System.out.println(firstName.startsWith("R"));

                    System.out.println(lastName.endsWith("n"));

                    //////////
                    String[] names = { "Mahmud", "Rimi", "Nishad", "Jihad" };
                    for (String x : names) {
                              System.out.print(x + " ");
                    }
          }
}
