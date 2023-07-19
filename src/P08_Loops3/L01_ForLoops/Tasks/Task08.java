package P08_Loops3.L01_ForLoops.Tasks;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
/*
        task-> girilen boyutta kare çarpım tablosu print eden code create ediniz
          Örnek Ekran çıktısı
       1  2  3  4  5        1,1    1,2     1,3    1,4    1,5
       2  4  6  8 10        2,1
       3  6  9 12 15
       4  8 12 16 20
       5 10 15 20 25

       5x5
         */
        Scanner input=new Scanner(System.in);
        System.out.print("birinç sayı gir bakennn : ");
        int n=input.nextInt();

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
            //    System.out.print(i*j+" ");
                System.out.printf("%4d",(i*j));
            }
            System.out.println();
        }


    }
}
