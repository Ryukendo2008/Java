public class StringDemo3 {
          public static void main(String[] args) {
                    String s1 = "Bangladesh_is_my country";
                    System.out.println(s1);

                    String s2 = s1.replace("i", "j");
                    System.out.println(s2);

                    String[] s3 = s1.split("_");
                    for (String x : s3) {
                              System.out.println(x);
                    }
          }
}
