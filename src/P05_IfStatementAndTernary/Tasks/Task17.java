package P05_IfStatementAndTernary.Tasks;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        /*
        Task-> taş- kağıt -makas oyununu simüle eden code create ediniz
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen seciminizi giriniz (T)as/ (K)ağıt / (M)akas ? : ");
        char secim = scanner.next().toUpperCase(). charAt(0);
        int bilSec = (int) (Math.random ()*3); // 3 farkli sayi tutulabilir,secebilir 1 yada 2yada 3yada 3ihtimal
        char bilSecim = ' ';
        if (bilSec==0) bilSecim='T';
        if (bilSec==1) bilSecim='K';
        if (bilSec==2) bilSecim='M';

        if (secim=='T') { // kullanici tas giriyor
            if (bilSecim=='T') System.out.println("Pat");
            if (bilSecim=='K') System.out.println("Bilgisayar kazandi");
            if (bilSecim=='M') System.out.println("Tebrikler kazandiniz");

            // bilSecim Makastir


        }else {
            if ( secim == 'K') {
                if (bilSecim=='T') System.out.println("Tebrikler kazandınız");
                if (bilSecim=='K') System.out.println("Pat");
                if (bilSecim=='M') System.out.println("Bilgisayar kazandı");
            } else {
                if (secim == 'M') {
                    if (bilSecim=='T') System.out.println("Bilgisayar kazandı");
                    if (bilSecim=='K') System.out.println("Tebrikler kazandınız");
                    if (bilSecim=='M') System.out.println("Pat");
                } else System.out.println("Hatalı seçim");

            }
        }



    }
}


