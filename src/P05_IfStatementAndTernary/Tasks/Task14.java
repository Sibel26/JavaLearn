package P05_IfStatementAndTernary.Tasks;

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {
        /*
          TASK -> kullanıcının cinsiyeti KADIN ise 60 yasından buyuk ve prim gunu 6000 den  fazla ise emekliliğini
                kullanıcının cinsiyeti ERKEK ise 65 yasından buyuk ve prim gunu 7000 den  fazla ise emekliliğini
                kontrol edip kalan yıl ve prim gununu print eden code create ediniz...
         */
        Scanner input = new Scanner(System.in);

        System.out.print("agam cinsiyet  giresen E/K :  ");
        char cns = input.next().charAt(0);
        System.out.print("agam yasini giresen : ");
        int yas = input.nextInt();
        System.out.print("agam prim gunu giresen : ");
        int primGun = input.nextInt();

        if (cns == 'K') {
            if (yas >= 60) {
                if (primGun >= 6000) {
                    System.out.println("Tebrikler emekliliğe hak kazandiniz " + (primGun - 6000) + "  gün fazla calismissiniz");
                } else {
                    System.out.println("Emeklilik icin" + (6000 - primGun) + " gün daha calismalisinniz");

                }
            } else {
                if (primGun >= 6000) {
                    System.out.println("Tebrikler Prim gününü doldurdunuz " + (primGun - 6000) + "  gün fazla calismissiniz");
                    System.out.println("Emeklilik icin " + (60 - yas) + "  yil daha calismalisinniz");


                } else {
                    System.out.println("Emeklilik icin" + (6000 - primGun) + " gün daha calismalisinniz");
                    System.out.println("Emeklilik icin " + (60 - yas) + "  yil daha calismalisinniz");
                }
            }
        } else {
            if (yas >= 65) {
                if (primGun >= 7000) {
                    System.out.println("Tebrikler emekliliğe hak kazandiniz " + (primGun - 7000) + "  gün fazla calismissiniz");
                } else {
                    System.out.println("Emeklilik icin" + (7000 - primGun) + " gün daha calismalisinniz");

                }
            } else {
                if (primGun >= 7000) {
                    System.out.println("Tebrikler Prim gününü doldurdunuz " + (primGun - 7000) + "  gün fazla calismissiniz");
                    System.out.println("Emeklilik icin " + (65 - yas) + "  yil daha calismalisinniz");


                } else {
                    System.out.println("Emeklilik icin" + (7000 - primGun) + " gün daha calismalisinniz");
                    System.out.println("Emeklilik icin " + (65 - yas) + "  yil daha calismalisinniz");
                }
            }
        }

        //ternary cozumu





    }
}












