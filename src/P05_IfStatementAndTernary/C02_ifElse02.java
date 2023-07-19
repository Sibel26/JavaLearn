package P05_IfStatementAndTernary;

import java.util.Scanner;

public class C02_ifElse02 {
    public static void main(String[] args) {
        // Ali ve Hasanın yaşları veriliyor, büyük yaşını ekrana yazdırınız
        Scanner sc = new Scanner(System.in);
        System.out.print("Ali'nin yasini giriniz: ");
        int ali = sc.nextInt();
        System.out.print("Hasanin yasini giriniz: ");
        int hasan = sc.nextInt();
        if (ali > hasan) {
            System.out.println("(1)buyuk olan " + ali);
        }

        if (hasan > ali) {
            System.out.println("(1) buyuk olani " + hasan);
        }

        if (ali > hasan) {
            System.out.println("(2)buyuk olan " + ali);
        } else  {
            System.out.println("(2) buyuk olani " + hasan);
        }


    }
}