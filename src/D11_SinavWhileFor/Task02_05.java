package D11_SinavWhileFor;

import java.util.Scanner;

public class Task02_05 {
    public static void main(String[] args) {
        // ekrandan 10 adet sayı giriniz ve bunların toplamını bulunuz

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi giriniz : ");
        int count = 0;
        int toplam = 0;
        while (count < 10) {
       //not:bu arayada yukaridaki sout u yazabilirdim,sonuc ayni olurdu
            int sayi = scanner.nextInt();
            toplam += sayi;
            count++;
        }
        System.out.println("Girilen sayilarin toplami : " + toplam);


    }
}
