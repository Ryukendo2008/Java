import java.util.ArrayList;

public class ArrayListDemo2 {
          public static void main(String[] args) {
                    ArrayList<Integer> nums = new ArrayList<Integer>();

                    nums.add(1);
                    nums.add(2);
                    nums.add(2, 3);
                    nums.add(4);

                    nums.clear();
                    System.out.println(nums);

                    boolean check = nums.isEmpty();
                    System.out.println(check);

                    boolean contain = nums.contains(2);

                    System.out.println(contain);

                    System.out.println(nums.indexOf(3));

                    nums.set(3,50);
                    System.out.println(nums);
          }
}