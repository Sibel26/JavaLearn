package Ek_Calismalarim;

import java.util.Scanner;

public class ForCalismalarim5 {
    public static void main(String[] args) {
        // Task 05 ) 1 den n e kadar olan tek ve çift sayıların toplamlarını ayrı ayrı yazdıran code create ediniz ( n --> kullanıcıdan alınacak )

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi giriniz ");
        int sayi = scanner.nextInt();
        int tekt = 0;
        int ciftt = 0;


        for (int i = 1; i <=sayi; i++) {
            if(i%2==0) {
                ciftt = ciftt + i;

            }else {
              tekt= tekt + i; //tekt+=i

            }

        }
        System.out.println("tektoplam = " + tekt);
        System.out.println("cifttoplam = " + ciftt);







    }
}
