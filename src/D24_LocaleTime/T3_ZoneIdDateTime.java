package D24_LocaleTime;

import java.time.Duration;
import java.time.LocalTime;

public class T3_ZoneIdDateTime {
    public static void main(String[] args) {

        LocalTime t1 = LocalTime.of(10,5);
        LocalTime t2 = LocalTime.of(20,15);
        Duration timeDif= Duration.between(t1,t2);
        System.out.println(timeDif);


    }
}
