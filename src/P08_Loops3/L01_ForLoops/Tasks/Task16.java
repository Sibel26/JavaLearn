package P08_Loops3.L01_ForLoops.Tasks;

import java.util.Scanner;

public class Task16 {

    /*
     task-> Girilen sayının asal olmasını kontrol eden code create ediniz.
     * */
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("agam bir sayi giresen : ");
        boolean asalMi = true;
        int sayi = input.nextInt();
        for (int i = 2; i <(sayi/2+1) ; i++) {
            if (sayi%i == 0) {
                asalMi =false;
            }
        }

        if (asalMi) System.out.println("sayı asal dır");
        else System.out.println("sayı asal değildir");



    }
}
