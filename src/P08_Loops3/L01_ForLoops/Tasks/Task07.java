package P08_Loops3.L01_ForLoops.Tasks;

public class Task07 {
    public static void main(String[] args) {
        /*
        Task ->
        girilen boyuttta tek sayı bir kare için
         Ekran Çıktısı
            Bir sayı giriniz: 7
            1 0 0 0 0 0 0
            0 1 0 0 0 0 0
            0 0 1 0 0 0 0
            0 0 0 1 0 0 0
            0 0 0 0 1 0 0
            0 0 0 0 0 1 0
            0 0 0 0 0 0 1


            Bir sayi giriniz: 5
            1 0 0 0 0
            0 1 0 0 0
            0 0 1 0 0
            0 0 0 1 0
            0 0 0 0 1

            şekli print eden code create ediniz
         */

        int n=5;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                if (i==j) System.out.print("1  ");
                else System.out.print("0  ");
            }
            System.out.println();
        }

        // sorunun 2.formu
/*
            0 0 0 0 1
            0 0 0 1 0
            0 0 1 0 0
            0 1 0 0 0
            1 0 0 0 0
           i = 0 , j = 4
           i = 1 , j = 3
           i = 2 , j = 2
           i = 3 , j = 1
           i = 4 , j = 0
           i=n-j-1
           i+j=n-1

 */
        System.out.println();

        n=9;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                if ((i+j)==(n-1)) System.out.print("1  ");
                else System.out.print("0  ");
            }
            System.out.println();
        }













    }
}
