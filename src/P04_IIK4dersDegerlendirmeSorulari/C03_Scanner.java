package P04_IIK4dersDegerlendirmeSorulari;

import java.util.Scanner;

public class C03_Scanner {
    // 2 sayıyı ekrandan okutun, çarpımlarını yazdırın
    // Sonuc = ?? 'dir //şeklinde çıktı versin
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci sayiyi giriniz: ");
        int sayi1 = scanner.nextInt();
        System.out.print("Ikinci sayiyi giriniz : ");
        int sayi2 = scanner.nextInt();


        System.out.println("Sonuc = " + (sayi1 * sayi2));
    }
}
