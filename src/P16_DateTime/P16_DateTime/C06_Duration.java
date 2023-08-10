package P16_DateTime.P16_DateTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class C06_Duration {
    public static void main(String[] args) {
        LocalTime t1 = LocalTime.of(10,5);
        LocalTime t2 = LocalTime.of(20,15);
        Duration timeDif= Duration.between(t1,t2);
        System.out.println(timeDif);

/*  desteklemedi
        LocalDate d1 = LocalDate.now();
        LocalDate d2 = LocalDate.of(2020,11,10);
        Duration dateDif = Duration.between(d1,d2);
        System.out.println(dateDif);

 */
    }
}
