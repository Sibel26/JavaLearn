package P08_Loops1.L01_ForLoops.Tasks02;

import java.util.Scanner;

public class Task02_03 {
    public static void main(String[] args) {
        // 1 den n kadar çift sayıların toplamını bulan bir program yazınız

        Scanner scanner = new Scanner(System.in);
        System.out.print("n= ");
        int n= scanner.nextInt();

        int ciftToplam=0;

        for (int i=1; i<=n; i++) {
            System.out.println("sayi "+i+"= "+i+" ");
            if (i%2==0){

                ciftToplam=ciftToplam+i;
            }
        }
        System.out.println();
        System.out.println("Cift sayilatin Toplami= "+ciftToplam);





    }
}
