public class NumberConversion {
          public static void main(String[] args) {
                    int decimal = 10;
                    String binary = Integer.toBinaryString(decimal);
                    System.out.println(binary);

                    int decimal2 = 10;
                    String octal = Integer.toOctalString(decimal2);
                    System.out.println(octal);

                    int decimal3 = 10;
                    String hexa = Integer.toHexString(decimal3);
                    System.out.println(hexa);
          }
}
