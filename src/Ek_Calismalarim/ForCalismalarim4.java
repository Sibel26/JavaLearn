package Ek_Calismalarim;

import java.util.Scanner;

public class ForCalismalarim4 {
    public static void main(String[] args) {
        // Task 04 ) 1 den n e kadar olan çift sayıların toplamını yazdıran code create ediniz ( n --> kullanıcıdan alınacak )
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir tane n sayisi yaziniz ");
        int n = scanner.nextInt();



        int toplam = 0;
        for (int i=0 ; i <= n ;i++) {
            toplam = toplam +i;

        } System.out.println("toplam= "+toplam);

    }
}
