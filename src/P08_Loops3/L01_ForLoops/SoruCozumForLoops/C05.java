package P08_Loops3.L01_ForLoops.SoruCozumForLoops;

import java.util.Scanner;

public class C05 {
    public static void main(String[] args) {
        // n adet rastgele 0 ila 10 arasında sayı üretip toplamını bulunuz
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç adet sayı toplanacak : ");
        int n = scanner.nextInt();
        int toplam=0;
        for (int i = 0; i <n ; i++) {

            int sayi = (int) (Math.random()*11); // 0 ila 10 arasında sayı üretir
            // 1 ila 10 arasında deseydim Math.random()*10+1 bu şekilde olurdu.
            toplam = toplam + sayi;
        }

        System.out.println("Toplam = "+toplam);
    }
}
