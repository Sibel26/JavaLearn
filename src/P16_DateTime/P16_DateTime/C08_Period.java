package P16_DateTime.P16_DateTime;

import java.time.LocalDate;
import java.time.Period;

public class C08_Period {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate date1 = today.plusDays(90);

        Period pp = Period.between(today,date1);
        System.out.println(pp);
        System.out.println(pp.getMonths());
        System.out.println(Period.ofDays(9));
        System.out.println(pp.toTotalMonths());
        System.out.println(pp.getDays());
    }
}
