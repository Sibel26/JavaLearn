package P16_DateTime.P16_DateTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class C01_LocaleDate {
    // LocaleDate date
    public static void main(String[] args) {
        LocalDate today = LocalDate.now(); // bu günün tarihini aldık
        System.out.println(today);
        System.out.println(today.getDayOfWeek());
        System.out.println(today.getDayOfMonth());
        System.out.println(today.getDayOfYear());
        System.out.println(today.getMonth());
        System.out.println(today.getYear());

        LocalDate newDate = LocalDate.of(2023,9,10); // kendimiz tarih set ettik
        LocalDate newDate2 = LocalDate.of(2023, Month.SEPTEMBER,10);// kendimiz tarih set ettik
        System.out.println(newDate);
        System.out.println(newDate2);
        System.out.println(today.plusDays(5));// 5 gün ileri tarihi yaz
        System.out.println(today);
        System.out.println(today.minusDays(5)); // 5 gün onceki tarihi yaz
        newDate = newDate.plusDays(100); // newdate objesindeki tarih verisini 100 gün ileri al
        System.out.println(today);
        System.out.println(today.plusWeeks(1));  // today den bir hafta sonraki tarih
        System.out.println(today.minusWeeks(1)); // today den bir hafta önceki tarih
        System.out.println(today.plusMonths(3)); // today den 3 ay sonraki tarih
        System.out.println(today.minusYears(2)); // today den 2 yıl önceki tarih
        System.out.println(today.minusYears(2).getDayOfWeek()); // today den 2 yıl önceki gün hangi gündür
        System.out.println(today.lengthOfYear()); // yılın kaç gün olduğunu verir
        System.out.println(today.getDayOfWeek().getValue());


    }
}
