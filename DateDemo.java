import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
          public static void main(String[] args) {
                    Date date = new Date();
                    System.out.println(date);

                    DateFormat df = new SimpleDateFormat("dd/MM/YYYY");
                    String currentDate = df.format(date);
                    System.out.println(currentDate);
          }
}
