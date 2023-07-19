package P04_IIK4dersDegerlendirmeSorulari;

public class C06_Math02 {
    public static void main(String[] args) {
        // verilen 3 double sayıdan büyük olanını, diğer ikisinin toplamından buyuk ise
        // ekran true, aksi halde ekrana false yazdırın
        // Mat class kullanılarak yapılacak
        double a = 10;
        double b = 15;
        double c = 26;
        // en büyüğünü bulun
        // en buyuk , diğer ikisinin toplamından buyukse true , küçükse false yazdırın

        double max = Math.max(a,b);
        double enBuyuk = Math.max(max,c);



        double kucuk2Sayinintoplami = (a + b + c - enBuyuk);
        // eğer a en buyuk ise en buyuk olmayanın toplamı b+c dir =3ününTopam - a
        // eğer b en buyuk ise en buyuk olmayanın toplamı a+c dir =3ününTopam - b
        // eğer c en buyuk ise en buyuk olmayanın toplamı a+b dir =3ününTopam - c

        // en buyuk olmayan ikinin toplamı = 3 unu topla - enbuyuk
        // toplam = 22 - (10+15
        boolean ekran = enBuyuk > kucuk2Sayinintoplami;
        System.out.println(ekran);



    //    System.out.println(max > (a + b) || max > (a + c) || max > (b + c));
    }
}
