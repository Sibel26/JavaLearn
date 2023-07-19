package P08_Loops2.L01_ForLoops.Tasks;

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {
// task-> girilen iki tamsayı arasındaki çift sayıları print eden code create ediniz...

        Scanner input=new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int sayi1=input.nextInt();
        System.out.print("Bir sayı daha giriniz : ");
        int sayi2=input.nextInt();
        int bas,son;
        if (sayi1>sayi2) {
            bas=sayi2;
            son=sayi1;
        }else {
            bas=sayi1;
            son=sayi2;
        }

        for (int i = bas; i <son ; i++) {

        }
        // cozum 2
        for (int i = Math.min(sayi1,sayi2); i <Math.max(sayi1,sayi2) ; i++) {

        }




    }
}
