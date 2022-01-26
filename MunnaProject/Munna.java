import java.util.Scanner;

public class Munna {
          public static void main(String[] args) {
                    System.out.println("   ");
                    System.out.println("   ");
                    System.out.println("                                   TEA  ");
                    System.out.println("\t\t\t       -----------  ");
                    System.out.println("   ");
                    System.out.println("The rulles of this prosses:");
                    System.out.println("1. To Start - enter '1'");
                    System.out.println("2. To be agree/know and positive answer - enter '2'");
                    System.out.println("3. To avoid and negetive answer - enter '3'");
                    System.out.println("4. To know next level - enter '4'");
                    System.out.println("##If you enter any wrong key , it may not work");
                    System.out.println("   ");

                    int x;
                    Scanner Input = new Scanner(System.in);
                    System.out.println("Now enter the key to start");
                    x = Input.nextInt();

                    if (x == 1) {
                              System.out.println("-Today we will know how to make tea?");
                              System.out.println("  ");

                              Scanner input = new Scanner(System.in);
                              System.out.println("Do you know how to make tea ?");
                              x = input.nextInt();

                              if (x == 3) {
                                        System.out.println("Well! I will help you.");
                                        System.out.println("");
                                        Scanner put = new Scanner(System.in);
                                        System.out.println("Can I start now?");
                                        x = put.nextInt();

                                        if (x == 2) {
                                                  System.out.println("Ok! I am starting now.");
                                                  System.out.println("");
                                                  System.out.println("At first , take water in a pan and put it on the stove. ");

                                                  Scanner inputs = new Scanner(System.in);
                                                  x = inputs.nextInt();
                                                  if (x == 4) {
                                                            System.out.println("Put some cinnamon, small cardamom, ginger in water and boiled it.");

                                                            Scanner mm = new Scanner(System.in);
                                                            x = mm.nextInt();

                                                            if (x == 4) {

                                                                      System.out.println("Then give some tea leaves in the boiled water and take the filted water in a cup. ");
                                                                      System.out.println(" Or take water in cup first and give there a tea bag.");

                                                                      Scanner mms = new Scanner(System.in);
                                                                      x = mms.nextInt();

                                                                      if (x == 4) {
                                                                                System.out.println("Then give some sugger and serve it.");
                                                                                System.out.println("");
                                                                                System.out.println("Thus, you can make intersting tea");
                                                                                System.out.println("No more today. Bye!");

                                                                      } else {
                                                                                System.out.println("You have entered wrong key. Plz run again and enter '4' to know next level.");
                                                                      }
                                                            } else {
                                                                      System.out.println("You have entered wrong key. Plz run again and enter '4' to know next level.");
                                                            }
                                                  } else {
                                                            System.out.println("You have entered wrong key. Plz run again and enter '4' to know next level.");
                                                  }

                                        } else {
                                                  Scanner Inputs = new Scanner(System.in);
                                                  System.out.println("I think you are not interested. Am I right?");
                                                  x = Inputs.nextInt();
                                                  if (x == 2) {
                                                            System.out.println("Ok! I will not insist you. Bye!");
                                                  } else {
                                                            System.out.println("Have you done any mistake? Run the program again.");
                                                  }

                                        }

                              } else {
                                        System.out.println("Ok! Then you don't need my Help.");
                                        System.out.println("assalamualaikum");
                              }
                    } else {
                              System.out.println("Run this prosses again and enter '1' as a key.");
                    }

          }
}