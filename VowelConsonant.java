import java.util.Scanner;

public class VowelConsonant {
          public static void main(String[] args) {
                    Scanner charInput = new Scanner(System.in);
                    System.out.print("Enetr any letter : ");
                    char chara = charInput.next().charAt(0);

                    if (chara == 'a' || chara == 'e' || chara == 'i' || chara == 'o' || chara == 'u' || chara == 'A'
                                        || chara == 'E' || chara == 'I' || chara == 'O' || chara == 'U') {
                              System.out.println("The letter is a vowel");
                    } else {
                              System.out.println("The letter is a consonant");
                    }

                    int Walton = 9000;
                    int LG = 7000;
                    int Lava = 80000;
                    if (Walton > LG && Walton > Lava) {
                              System.out.println("I will buy Walton");
                    } else {
                              System.out.println("I will not buy Walton");
                    }
          }
}