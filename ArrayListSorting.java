import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListSorting {
          public static void main(String[] args) {
                    ArrayList<Integer> nums = new ArrayList<>();

                    nums.add(8);
                    nums.add(-4);
                    nums.add(6);
                    nums.add(34);
                    nums.add(76);
                    nums.add(54);

                    System.out.println("Before sorting : " + nums);

                    // Sorting
                    Collections.sort(nums);
                    System.out.println("Ascending : " + nums);

                    Collections.sort(nums, Collections.reverseOrder());
                    System.out.println("Descending : " + nums);
          }
}
