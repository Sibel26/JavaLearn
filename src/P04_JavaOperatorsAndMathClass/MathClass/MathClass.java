package P04_JavaOperatorsAndMathClass.MathClass;

public class MathClass {
    public static void main(String[] args) {
        int sayi1 = 10;
        int sayi2 = 15;
/*
        int mutlakDeger = Math.abs(sayi1-sayi2);
        System.out.println("mutlakDeger = " + mutlakDeger);
        double dd=Math.pow(2,31);
        System.out.println((long) dd);
        System.out.println(Math.pow(2,3));
        System.out.println(Math.pow(2,1.5));

        System.out.println(Math.floor(3.9)); // alta yuvarlama

        int rondomSayi = (int) (Math.random()*100); // 0 ila 99 arasında sayı üretir
        System.out.println(rondomSayi);

        for (int i = 0; i <50 ; i++) {
            double dd = Math.random();
            int s1  = (int) (dd*3); // 0 ile 2 arası üretir
            System.out.print( s1 + " ");
        }
        System.out.println();
        for (int i = 0; i <50 ; i++) {
            double dd = Math.random();
            int s2  = (int) (dd*4); // 0 ile 3 arası üretir
            System.out.print( s2 + " ");
        }
        System.out.println();
        for (int i = 0; i <50 ; i++) {
            double dd = Math.random();
            int s3  = (int) (dd*3+1); // 1 ile 3 arası üretir
            System.out.print( s3 + " ");
        }
*/
        System.out.println(Math.round(3.5)); // yuvarlar 4
        System.out.println(Math.round(3.4)); // yuvarlar 3
        int ss= Math.round(3.5f);
        int sa= (int) Math.round(3.5);
        System.out.println(Math.ceil(7.1)); // üste yuvarlar floor un tersi, sonuc 8
        System.out.println(Math.sqrt(2));
        double dd=Math.pow(120,(1.0/3)); // küp kök alır
        System.out.println(dd);




    }
}
