package D09_Loops;

import java.util.Scanner;

public class Loops4For {
    public static void main(String[] args) {
        //n adet rastgele sayi uretip toplamini bulunuz

        Scanner scanner = new Scanner(System.in);
        System.out. println("kac adet sayi toplanacak: " );
        int n = scanner.nextInt();
        int toplam = 0;
        for (int i = 1; i < n; i++) {
            int sayi = (int) (Math.random()*11); // 0 ile 10 arasinda üretir


                    toplam = toplam + sayi;

        }


        System.out.println("Toplam = "+toplam);




    }






}
