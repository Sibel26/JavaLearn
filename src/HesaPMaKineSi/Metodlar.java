package HesaPMaKineSi;

import java.util.Scanner;



public class Metodlar {
    //metod deposu

    public static void menu(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Hesap Makinemize hosgeldiniz");
        System.out.println("Hangi islemi yapmak istersiniz:  \nToplama-1\nCikarma-2\nCarpma-3\nBolme-4");
        int secim = scan.nextInt();
        System.out.println("islem yapmak istediginiz sayilari giriniz :");
        int num01 = scan.nextInt();
        int num02 = scan.nextInt();

        //to do: bu menüyü while icine al--> dogru girene kadar dongu donsun

     switch (secim) {

    case 1 :toplama(num01,num02);menu(); break; //asagidakiyle 2 farkli metod olmus oluyor
    case 2 : cikarma(num01,num02);menu();break;
    case 3 : carpma(num01,num02);menu(); break;
    case 4 : bolme(num01,num02);menu(); break;
         default:
             System.out.println();

        }
    }
    //parametre)
    // to do :Buyugu kucuge bol
    private static void toplama(int num01, int num02) {
        System.out.println("toplama sonucu : " +(num01 + num02));
    }

    private static void carpma(int num01, int num02)  {
        System.out.println("carpma sonucu : " +(num01 * num02));
    }

    private static void bolme(int num01, int num02) {
        System.out.println("bolme sonucu : " +(num01 / num02));
    }
// to do : buyukten kucugu cikar
    private static void cikarma(int num01, int num02) {
        System.out.println("cikarma sonucu : " +(num01 - num02));
    }


}
