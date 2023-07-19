package P04_JavaOperatorsAndMathClass.ArithmeticOperators;

public class C01_ArithmeticOperators {
    public static void main(String[] args) {
        int a = 13;
        int b = 10;
        int c = 2;

        int sayi = b+a*c; // 36,
  //      System.out.println("sayi = " + sayi);

        sayi=c-a/(b-c)+a*b;
  //      System.out.println("sayi = " + sayi); // 131

        sayi= (int) (c-a/(b-c*1.0)+a*b); //130
        // 2-1+130
        // 2-1.6+130 // 130.4 = 130

  //      System.out.println("sayi = " + sayi);

        double dd = 10.0/3;
 //       System.out.println("dd = " + dd);
        // adem bey     128,625
        // hüseyin bey  128,625
        // halime hanım 128
        // özcan bey,sibel hanım    129

  //      System.out.println("sayi = " + sayi);
//        String str = a+b+"";
//        System.out.println(str);
//        str= ""+a+b;
//        System.out.println(str);
//int'i int'e boldugunuz zaman sonuc int cikar.
        //Java yuvarlama islemi yapmaz, sonucun tam kismini bolme isleminin sonucu olarak ekrana yazar.
        //Ornegin 47/10 isleminin sonucu matematikte 4.7'dir fakat Java'da 4'd�r.
  //      System.out.println(c / a); // 0 dır
        double d2 = 4;
        // a=13, b=10;
        double dT = a+b/d2;
 //       System.out.println("dT = " + dT); //
        	/*
		 Islem Onceligi:
		  1)üs ve Parantez ici islemler
		  2)Carpma ve bolmeler
		  3)Toplama ve cikarmalar
		 */
        // a=13, b=10; c=2;
//        System.out.println(b + a * c); // 36
//        System.out.println(b + (c - 2 * b) / 2); // 1
//
//        System.out.println(c - a / (b - c) + a * b); //131

        //Farkli data type'lari ile matematiksel islemler yaparsaniz sonuc buyuk data type'inda verilir.
        //byte < short < int < long < float < double
        int d = 12;
        double e = 4;
        float f = 4f;
//        System.out.println(d / e);//3.0
//        System.out.println(d + e);//16.0
//        System.out.println(e / d);//0.3333333333333333
//        System.out.println(f / d);//0.33333334
        //Modulus Islemi : Iki ondalik olmayan sayi birbirine bolundugunde kalani verir
        //Java'da Modulus Islemi'nin sembolu "%" isaretidir.
//        System.out.println(13 % 5);
//        System.out.println(245 % 3);
        //Cift Sayi (even) : 2'ye bolundugunde 0 kalanini veren sayilardir.
        //Tek Sayi (odd) : 2'ye bolundugunde 1 kalanini veren sayilardir.
//        if (sayi%2==0) System.out.println("sayı çifttir");
//        else System.out.println("sayı tektir");
        int g=2;
        int h=3;
        String  s="JavaCAN";

        //Task-> g h s variable'ları kullanarak 61JavaCAN-1 print eden code create ediniz.

        System.out.println(""+(g*h)+(h-g)+s+(g-h));//61JavaCAN-1

        int ii = 10;
        long ll=20;
        ii = (int) (ii*ll); // sonuç long olduğu için tip dönüşümü istedi

    }
}
