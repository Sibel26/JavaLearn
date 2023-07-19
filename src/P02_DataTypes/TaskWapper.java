package P02_DataTypes;

import P01_Variable.Task.Task01;

public class TaskWapper {
    // Tüm sorular Wapper Class kullanılarak çözülmelidir.
    // if, ternary , + , ifadeleri kullanılamyacak
    // Task01 : float, double, byte, short ve int'in maximum ve minimum degerlerini print eden code create ediniz.
    // Task02 : verilen 3 sayıdan en buyuk olanını , wapper class yöntemi ile bulan bir code yazınız

    // Task04 : Verilen 3 sayıdan, en küçüğü ile en büyüyünün toplamını bulan program yazınız
    // Task05 : verilen 2 sayının farkını bulun sonuç 0 dan büyük olsun
    //
    public static void main(String[] args) {
        //Task01
        System.out.println("Float Maximum Deger: " + Float.MAX_VALUE);
        System.out.println("Float Minimum Deger: " + Float.MIN_VALUE);

        System.out.println("Double Maximum Deger: " + Double.MAX_VALUE);
        System.out.println("Double Minimum Deger: " + Double.MIN_VALUE);

        System.out.println("Byte Maximum Deger: " + Byte.MAX_VALUE);
        System.out.println("Byte Minimum Deger: " + Byte.MIN_VALUE);

        System.out.println("Short Maximum Deger: " + Short.MAX_VALUE);
        System.out.println("Short Minimum Deger: " + Short.MIN_VALUE);

        System.out.println("Int Maximum Deger: " + Integer.MAX_VALUE);
        System.out.println("Int Minimum Deger: " + Integer.MIN_VALUE);

        //Task02
        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 30;
        int buyuk = Integer.max( sayi1, sayi2);
        buyuk = Integer.max( buyuk, sayi3);
        System.out.println("en buyuk sayi" + buyuk);


        //Task04
        int s1= 6;
        int s2= 7;
        int s3= 8;
         buyuk = Integer.max( s1, s2);
         buyuk = Integer.max( buyuk, s3);
         int kucuk = Integer.min( s1, s2);
         kucuk = Integer.min( kucuk, s3);

         int toplam = Integer.sum( buyuk, kucuk);
        System.out.println("toplam esittir " + toplam);


        //Task05
        int sy1= 3;
        int sy2= 4;
        buyuk = Integer.max( sy1, sy2);
        kucuk = Integer.min( sy1, sy2);
       int fark = buyuk - kucuk;
        System.out.println("fark =" + fark);

























    }
}
