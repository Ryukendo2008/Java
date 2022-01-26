import java.util.Random;

public class RandomNumber {
          public static void main(String[] args) {
                    Random rand = new Random();

                    int random = rand.nextInt(10);
                    System.out.println("Random numbers : " + random);

                    // another system
                    int ranNum = (int) (Math.random() * 10);
                    System.out.println("Random numbers : " + ranNum);
          }
}
