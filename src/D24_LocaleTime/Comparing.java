package D24_LocaleTime;

import java.time.LocalDate;

public class Comparing {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate date1 = today.minusDays(50); // 2 ay fark cikar

        System.out.println(today.compareTo(date1));
        System.out.println(today.getMonth().compareTo(date1.getMonth()));




    }
}
