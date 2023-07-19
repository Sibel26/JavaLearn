package P08_Loops3.L01_ForLoops.Tasks;

import java.util.Scanner;

public class Task33 {
    /*
        Bir sayinin mükemmel olup olmadiğini bulan bir program yaziniz.
        Mükemmel sayi : bir sayinin kendisi hariç bölenlerinin toplamı, kendisine eşitse o sayi mükemmeldir.
        ORNEK:
        INPUT     : 6
        OUTPUT : 1,2,3
                      1+2+3 = 6 = 6 (Mükemmel)



        */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      //  System.out.print("Lutfen bir sayi giriniz : ");
       // int sayi = scan.nextInt();
        // Integer maximum sınırına kadar tüm mükemmel sayıları bulduk
        for (int sayi = 2; sayi <Integer.MAX_VALUE; sayi++) {
            int toplam = 0;
            for (int i = 1; i <sayi ; i++) {
                if (sayi%i==0) {
                    toplam +=i;
                }

            }

            if (sayi==toplam) System.out.println(sayi+" Mukemmel sayıdır");

        }



    }


}
