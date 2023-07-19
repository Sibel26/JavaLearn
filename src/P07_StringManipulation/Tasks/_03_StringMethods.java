package P07_StringManipulation04.Tasks;

import java.util.Scanner;

public class _03_StringMethods {
    public static void main(String[] args) {
        // ekrandan isim ve soy ismi tek boşluk ile okutunuz,
        // ve büyük harf kısaltma olarak yazınız
        // input "can taman"
        // output "C.T."
    // ad ve soyadı ekrandan tek boşluk ile okut
        // tümünü büyüt //  CAN TAMAM
        // C sıfırcı karekter
        // boşluğun indexi + 1. karekter ise soy isimin ilk karekteridir

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ad ve Soyad giriniz : ");
        String adSoyad = scanner.nextLine().toUpperCase();
        int indexSoyAd= adSoyad.indexOf(' ')+1;
        System.out.println(adSoyad.charAt(0)+"."+(adSoyad.charAt(indexSoyAd))+"." );


    }
}
