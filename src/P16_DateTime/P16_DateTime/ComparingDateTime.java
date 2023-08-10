package P16_DateTime.P16_DateTime;

import java.time.LocalDate;

public class ComparingDateTime {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate date1 = today.minusDays(700);

        System.out.println(today.compareTo(date1));
        System.out.println(today.getMonth().compareTo(date1.getMonth()));
    }
}
