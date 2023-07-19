package P08_Loops1.L01_ForLoops.Tasks02;

import java.util.Scanner;

public class Task02_01 {
    public static void main(String[] args) {
        // 10 dan 20 ye kadar ( 10 ve 20 dahil) sayıların toplamını
        // for çevrimi ile bulan bir program yazınız

        Scanner scanner = new Scanner(System.in);

        System.out.print("Baslangic degerini girin : ");
        int baslangic = scanner.nextInt();
        System.out.println("Bitis degerini girin : ");
        int bitis = scanner.nextInt();

        int toplam = 0;
        for (int i = baslangic; i <=bitis ; i++) {  //yada 21 < de olabilir
            toplam +=i;  // toplam = toplam + i; en pratik yol toplam +=i; //

        }
        System.out.println("toplam = " + toplam);










    }
}
