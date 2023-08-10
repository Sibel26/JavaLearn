package P16_DateTime.P16_DateTime;

import java.time.LocalTime;
import java.util.Random;

public class C02_LocaleTime {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println(now);
        System.out.println(now.getHour());
        System.out.println(now.getMinute());
        System.out.println(now.getSecond());
        System.out.println(now.getNano());
        System.out.println(now.plusHours(2));
        System.out.println("--------------");
        String str="";
     //   System.out.println(LocalTime.now().getNano()+" "+LocalTime.now().getSecond());
        long t1 = System.currentTimeMillis();
        for (int i = 0; i <30000000 ; i++) {
            str = str+i;
            if (str.length()>100) str="";
        }
   //     System.out.println(LocalTime.now().getNano()+" "+LocalTime.now().getSecond());
        long t2 = System.currentTimeMillis();
        System.out.println(t2-t1);
    }
}
