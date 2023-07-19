package P09_BreakContinue;

import java.util.Scanner;

public class C05_AsalControl {
    public static void main(String[] args) {
        //task-> girilen tamsayının asal olmasını kontrol eden code create ediniz
        //asal tamsayı: 1 ve kendisinden başka tam böleni olmayan sayılar->asil bölünemeyen sayı

        Scanner input = new Scanner(System.in);
        System.out.print("Asal konrolü yapılacak sayi giriniz :");
        int sayi = input.nextInt();
        boolean asalMi=true;
        for (int i = 2; i <sayi ; i++) {
            System.out.print(i+" ");

            if(sayi%i == 0){
                asalMi=false;
               break;
            }

        }
        System.out.println();
        if (asalMi) System.out.println(sayi+" asaldır");
        else System.out.println(sayi+" asal değildir");
    }
}
