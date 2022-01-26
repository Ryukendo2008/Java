public class IsStringPalindrome {
          public static void main(String[] args) {
                    String s1 = "madam";

                    StringBuffer sb = new StringBuffer(s1);

                    String s2 = sb.reverse().toString();

                    if (s1.equals(s2)) {
                              System.out.println("It's a palindrome");
                    } else {
                              System.out.println("Not a palindrome");
                    }
          }
}
