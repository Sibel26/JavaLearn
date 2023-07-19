package P08_Loops3.L02_WhileLoops.Tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        // task-> Girilen sayıların toplamı 333'ü geçtiğinde girilen sayı adetini ve
        // toplamını print eden code create edinz
        // 70+50+200+15
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        // 1 , 2, 4, 9, 10

        Scanner scanner = new Scanner(System.in);

        int toplam = 0;
        int sayac = 0;
        while (toplam <= 333) {
            System.out.println("Bir sayi giriniz ");
            int sayi = sc.nextInt();
            sayac ++;
            toplam = toplam + sayi;
            // toplam += sayi
            System.out.println(toplam);
            System.out.println(sayac);


        }


    }}

