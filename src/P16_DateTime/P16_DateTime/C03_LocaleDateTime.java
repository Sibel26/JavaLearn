package P16_DateTime.P16_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class C03_LocaleDateTime {
    public static void main(String[] args) {
        //LocalDateTime -> yıl-ay-gün saat-dakika-saniye datalarını tutar

        LocalDateTime ldt= LocalDateTime.now();// sistemiden mevcut date ve tiem datası ldt'ye atandı
        System.out.println("ldt = " + ldt);// 2023-02-24T21:45:32.610425

        LocalDate date=LocalDate.of(2022,12,27);
        LocalTime time=LocalTime.of(17,23,44);

        LocalDateTime ldt1=LocalDateTime.of(date,time);
        System.out.println("ldt1 = " + ldt1);// 2022-12-27T17:23:44

        LocalDateTime ldt2=LocalDateTime.of(1999, Month.AUGUST,17,3,02,33);
        System.out.println("ldt2 = " + ldt2);// 1999-08-17T03:02:33

        System.out.println("ldt2.getHour() = " + ldt2.getHour());//
        System.out.println("ldt2.getDayOfWeek() = " + ldt2.getDayOfWeek());//
        System.out.println("ldt2.getDayOfYear() = " + ldt2.getDayOfYear());//
        System.out.println(ldt2.plusYears(21).plusDays(123).minusMonths(45).minusHours(34));//
    }
}
