package P10_MethodCreation01.Sorular;

import java.util.Scanner;

public class S06 {
    public static void main(String[] args) {
        // T01 deki metodu kullanarak N adet rastgele sayıdan (  )
        // en buyuğünü bulan bir code crate ediniz
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı ? :");
        int n= scan.nextInt();
        int enBuyuk=Integer.MIN_VALUE; // =0, 7 , 10,12
        // 7 10 12 5
        for (int i = 0; i <n ; i++) {
          //  int sayi = (int) (Math.random()*100+1);
            int sayi = C01.rastgele(1,100);
            System.out.print(sayi+" ");
            //    if (sayi>enBuyuk) enBuyuk=sayi;
           // enBuyuk = buyukBul2(enBuyuk,sayi);
            enBuyuk = S05.buyukBul(enBuyuk,sayi);
        }
        System.out.println();
        System.out.println(enBuyuk);


    }

    private static int buyukBul2(int enBuyuk, int sayi) {
        return Math.max(enBuyuk,sayi);
    }
}
