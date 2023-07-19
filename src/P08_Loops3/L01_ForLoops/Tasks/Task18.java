package P08_Loops3.L01_ForLoops.Tasks;

import java.util.Scanner;

public class Task18 {

    /*
    task-> Girilen bir tamsayının  3 üssü olup olmadığınıkontrol eden code create ediniz.
        Örnek 1:
        Girdi: 27
        Çıktı: true
        Açıklama: 3*3*3 =27
        Sonuç= true

        Örnek 2:
        Girdi: 0
        Çıktı: false
        Örnek 3:
        Girdi: 9
        Çıktı: true
        Açıklama: 3*3 = 9
        Sonuç= true

        Örnek 4:
        Girdi: 45
        Çıktı:: false
        Açıklama: 3*3*3*3 =81
        Sonuç= false
        45, 3ün üssü (kuvveti) değildir.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi = input.nextInt();
        int kaciciKuvvet=0;
        int ucunKuvveti = 1;
        boolean ucunKuvvetidir = false;
        for (int i = 1; i < sayi; i++) {
            ucunKuvveti = ucunKuvveti * 3;
            if (ucunKuvveti == sayi) {
                ucunKuvvetidir = true;
                kaciciKuvvet=i;
                break; // fordan dışarı atar
            }

        }
        if (ucunKuvvetidir) System.out.println(sayi+" üçün "+kaciciKuvvet+ ".kuvetidir");
        else System.out.println(sayi+ " üçün kuvveti değildir");


    }
}
