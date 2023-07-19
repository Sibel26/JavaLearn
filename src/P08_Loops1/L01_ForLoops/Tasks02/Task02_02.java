package P08_Loops1.L01_ForLoops.Tasks02;

import java.util.Scanner;

public class Task02_02 {
    public static void main(String[] args) {
        // verilen n adet sayıdan en küçüğünü bulan code create ediniz


        Scanner scanner = new Scanner(System.in);
        System.out.println("Bana bir n sayisi giriniz");
        int n = scanner.nextInt();

        int enKucuk = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". sayi giriniz");//1.sayiyi girdi
            int sayi = scanner.nextInt();
            if (sayi < enKucuk)
            {
                enKucuk = sayi;
            }


        }
        System.out.println();
        System.out.println("enKucuk = " + enKucuk);


    }
}
