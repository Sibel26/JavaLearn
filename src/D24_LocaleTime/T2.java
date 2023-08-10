package D24_LocaleTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class T2 {
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();// M buyuk harfle gösterilir saati gösterir

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd MM yyyy");
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("hh:mm:ss");
      /*  DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("dd MM yyyy");
        DateTimeFormatter dtf6 = DateTimeFormatter.ofPattern("dd MM yyyy");*/

        System.out.println(dtf.format(date));
        System.out.println(dtf2.format(date));
        System.out.println(dtf3.format(date));
        System.out.println(dtf4.format(date));


    }



}
