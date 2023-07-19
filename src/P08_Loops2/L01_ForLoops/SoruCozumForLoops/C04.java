package P08_Loops2.L01_ForLoops.SoruCozumForLoops;

import java.util.Scanner;

public class C04 {
    public static void main(String[] args) {
        // n adet sayı veriliyor, toplamını bulunuz
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç adet sayı toplanacak : ");
        int n = scanner.nextInt();
        int toplam=0;
        for (int i = 0; i <n ; i++) {
            System.out.print((i+1)+". sayı ? : ");
            int sayi = scanner.nextInt();
            toplam = toplam + sayi;
        }

        System.out.println("Toplam = "+toplam);

    }
}
