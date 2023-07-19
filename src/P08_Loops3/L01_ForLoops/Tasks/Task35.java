package P08_Loops3.L01_ForLoops.Tasks;

import java.util.Arrays;

public class Task35 {
    public static void main(String[] args) {

        // verilen sayi adedince fibonacci serisinden sayilar yazdiran bir method olusturun
        // Fibonacci serisi = 0 1 1 2 3 5 8 13 21 34 .........
        // fibonacci serisi 0 ve 1 olarak başlar, daha sonraki eleman
        // kendinden önceki 2 elemanın toplamıdır
        fibonaccidenSayiYazdir();
    }   // A B C D E

    public static void fibonaccidenSayiYazdir() {
        int sayi=20;
        int ikiOnceki=0;
        int birOnceki=1;
        System.out.print(ikiOnceki+" "+birOnceki+" ");
        for (int i = 2; i <sayi ; i++) {
            int yeniSayi=ikiOnceki+birOnceki;
            System.out.print(yeniSayi+" ");
            ikiOnceki = birOnceki;
            birOnceki = yeniSayi;
        }
        System.out.println();
        int [] fibonacci = new int[sayi];
        fibonacci[0]=0;
        fibonacci[1]=1;
        for (int i = 2; i <sayi ; i++) {
            fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];
        }
        for (int i = 0; i <sayi ; i++) {
            System.out.print(fibonacci[i]+" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(fibonacci));

    }
}
