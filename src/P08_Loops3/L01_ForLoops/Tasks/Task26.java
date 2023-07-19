package P08_Loops3.L01_ForLoops.Tasks;

import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        //task -> verilen bir tam sayinin rakamlari toplamini print eden code create ediniz

 //   input : 345    ,  output : 12
        Scanner input = new Scanner(System.in);

        System.out.println(" bi sayi gir bakennn : ");
        int sayi = input.nextInt();
        // * cozum 1
        int rakamlarToplami=0;
        String str = ""+sayi;
        for (int i = 0; i <str.length() ; i++) {
            rakamlarToplami += Integer.parseInt(str.substring(i,i+1));
        }
        System.out.println("rakamlarToplami = " + rakamlarToplami);
        // cozum 2
        rakamlarToplami=0;
        for (int i = sayi; i >0 ; i=i/10) {
            rakamlarToplami += i%10;
        }
        System.out.println(rakamlarToplami);

    }
}
