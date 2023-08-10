package D23_LocaleDate;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class C01 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();// Günün tarihini alma, yerel tarih
        System.out.println(today);
        System.out.println(today.getDayOfWeek());
        System.out.println(today.getDayOfYear());
        System.out.println(today.getDayOfMonth());
        System.out.println(today.getMonth());
        System.out.println(today.getYear());
        LocalDate newDate = LocalDate.of(2023,9,10);//Kendimiz tarihi set ettik atadik
        LocalDate newDate2 = LocalDate.of(2023, Month.SEPTEMBER,10);

        System.out.println(newDate);
        System.out.println(newDate2);
        System.out.println(today.plusDays(5));//plus 5 gün ekle bu tarihe
        System.out.println(today.minusDays(5));//azaltma
        newDate=newDate.plusDays(100);//atama yapiliyor degisiyor,100 gün ileri aliyor
        System.out.println(newDate);
        System.out.println(today.plusWeeks(1));// today den bir sonraki tarih
        System.out.println(today.minusWeeks(1));// today den bir önceki tarih
        System.out.println(today.plusMonths(3));//today den 3 ay sonraki tarih
        System.out.println(today.minusYears(2));// today den 2 yil önceki tarih
        System.out.println(today.minusYears(2).getDayOfWeek());//today dan 2 yil önceki gün hangi gündür
        System.out.println(today.lengthOfYear());// yilin kac gün oldugunu verir, artik yil buradan bulunabilir, 366 gün müdür seklinde
        System.out.println(today.getDayOfWeek().getValue());// haftanin kacinci gunu, 2 haftaici sali

//value deger anlamina geliyor
    }

}
