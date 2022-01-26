import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ArrayListDemo {
          public static void main(String[] args) {
                    ArrayList<Integer> numbers = new ArrayList<Integer>();

                    // adding elements
                    numbers.add(10);
                    numbers.add(20);
                    numbers.add(30);
                    numbers.add(0, 40);

                    // System.out.println(numbers);

                    // for (int x : numbers) {
                    // System.out.print(" " + x);
                    // }

                    // Iterator itr=numbers.iterator();
                    // while (itr.hasNext()) {
                    // System.out.print(" "+itr.next());
                    // }

                    numbers.remove(1);
                    System.out.print(numbers + " ");
          }
}
