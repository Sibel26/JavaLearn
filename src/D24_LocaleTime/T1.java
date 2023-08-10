package D24_LocaleTime;

import java.time.LocalTime;

public class T1 {
    public static void main(String[] args) {
       LocalTime now = LocalTime.now();
        System.out.println(now.getHour());
        System.out.println(now.getMinute());
        System.out.println(now.getSecond());
        System.out.println(now.getNano());
        System.out.println(now.plusHours(2));
        System.out.println("----------");

        System.out.println(LocalTime.now().getNano());

//localtime da hem saat hem zaman kullanabiliyoru


    }


}
