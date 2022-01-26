import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class TimeDemo {
          public static void main(String[] args) {
                    LocalTime time = LocalTime.now();
                    System.out.println("Now : " + time);

                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss");
                    String ft = time.format(dtf);

                    System.out.println(ft);
          }
}