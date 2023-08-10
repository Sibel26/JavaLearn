package P16_DateTime.P16_DateTime;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class C04_DateTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd MMM yyyy");
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        DateTimeFormatter tf1 = DateTimeFormatter.ofPattern("hh:mm:ss"); // 12 saat formatına göre verir
        DateTimeFormatter tf2 = DateTimeFormatter.ofPattern("HH:mm:ss"); // 24 saat e göre verir
        DateTimeFormatter tf3 = DateTimeFormatter.ofPattern("h:mm:ss");




        System.out.println(dtf.format(date));
        System.out.println(dtf2.format(date));
        System.out.println(dtf3.format(date));


        System.out.println(tf1.format(date));
        System.out.println(tf2.format(date));
        System.out.println(tf3.format(date));



    }
}
