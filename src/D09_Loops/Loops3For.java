package D09_Loops;

import java.util.Scanner;

public class Loops3For {

    public static void main(String[] args) {

        // n sadet sayi veriliyor, toplamini bulunuz
       Scanner scanner = new Scanner(System.in);
        System.out. println("kac adet sayi toplanacak: " );  //  n kez sayi olacak ve toplanacak
        int n = scanner.nextInt();
        int toplam = 0;
        for (int i = 1; i < n; i++) {
            System.out.println((i+1)+".sayi ? :");
        }
            int sayi = scanner. nextInt();
            toplam = toplam + sayi;
        System.out.println("Toplam = "+toplam);

    }







}
