package Ek_Calismalarim;

import java.util.Scanner;

public class ForCalismalarim7 {
    public static void main(String[] args) {
        // Task 07 ) başlangıc ve bitiş degeri kullanıcıdan alınan 2 sayının arasındaki çift sayıları yazdıran code create ediniz

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int baslangic = scanner.nextInt();
        System.out.println(" bir sayi giriniz");
        int bitis = scanner.nextInt();
        for(int i=baslangic; i<=bitis; i++) {
            if(i%2 == 0) {
                System.out.println(i);
            }
        }




    }

}
