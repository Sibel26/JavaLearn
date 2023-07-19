package P05_IfStatementAndTernary;

import java.util.Scanner;

public class C05_if_3sayidanBuyukOlan {
    public static void main(String[] args) {
        // Klavyeden okutulan 3 sayıdan en büyük olanı ekrana yazdırın,
        // eşitlik kontrolü yapmayın
        Scanner sc = new Scanner(System.in);
        System.out.print("Birinci sayı : ");
        int s1 = sc.nextInt();
        System.out.print("İkinci sayı  : ");
        int s2 = sc.nextInt();
        System.out.print("Üçüncü sayı  : ");
        int s3 = sc.nextInt();
        if (s1 > s2) { // en buyuk s1 veya s3
           if (s1>s3) {
               System.out.println("En buyuk sayı = " + s1);
           }else {
               System.out.println("En buyuk sayı = " + s3);
           }
        }else { // s2 veya s3
            if (s2>s3) {
                System.out.println("En buyuk sayı = " + s2);
            }else {
                System.out.println("En buyuk sayı = " + s3);
            }
        }
        // cozum 2
        if (s1 > s2 && s1 > s3 ) {
            System.out.print("En büyük sayı " + s1);
        }
        if (s2 > s1 && s2 > s3) {
            System.out.print("En büyük sayı " + s2);
        }
        if (s3 > s1 && s3 > s2) {
            System.out.println("En büyük sayı " + s3);
        }

    }
}
