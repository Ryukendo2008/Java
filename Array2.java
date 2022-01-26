import java.util.Scanner;

public class Array2 {
          public static void main(String[] args) {
                    Scanner input = new Scanner(System.in);
                    System.out.print("Enter 10 numbers : ");

                    int[] nums = new int[10];

                    nums[0] = input.nextInt();
                    nums[1] = input.nextInt();
                    nums[2] = input.nextInt();
                    nums[3] = input.nextInt();
                    nums[4] = input.nextInt();
                    nums[5] = input.nextInt();
                    nums[6] = input.nextInt();
                    nums[7] = input.nextInt();
                    nums[8] = input.nextInt();
                    nums[9] = input.nextInt();

                    int sum = 0;

                    for (int i = 0; i < nums.length; i++) {
                              sum = sum + nums[i];
                    }

                    double avarege = sum / nums.length;

                    System.out.println("The sum is : " + sum);
                    System.out.println("The avarege is : " + avarege);

                    double max = nums[0], min = 0;
                    for (int i = 1; i < nums.length; i++) {
                              if (max < nums[i]) {
                                        max = nums[i];
                              } else {
                                        min = nums[i];
                              }
                    }
                    System.out.println("The maximum is : " + max);
                    System.out.println("The minimum is : " + min);
          }
}
