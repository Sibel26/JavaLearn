package P02_DataTypes;

public class C02_Concatenation {
    public static void main(String[] args) {
        // Birden çok String variable ile farklı data type  variable'ler + ile işleme alınırsa
        // java birleştirme yaparak yeni bir String oluşturur.
        // TRICK :) Bir aritmetik işlem içinde String kullanılırsa, aritmetik işlem önceliğine göre
        // işlem yapılıp String variable’a Concatenation yapılır.

        // Trick ->  String variable cok gucludur. Hangi data turu ile isleme girerse girsin kendine benzetir. -> ch+isim=1Haluk

        long ll = 30;
        String str1 = "Hasan";
        String str2 = "Kamil";
        String str3 = str1+" "+str2;
        String str4 = str2+" "+str1;

        System.out.println(str3);
        System.out.println(str4);

//        String str1 = "Hasan";
//        String str2 = "jamil";
//        String str4 = " ";
//        String str3 = str1+str4+str2;
//        System.out.println(str3);

        String s1 = "7";
        String ss = s1+s1; // "77"
        System.out.println("ss = " + ss);

        String str5 = str1+s1;
        System.out.println(str5);

        int sayi = 9;
        str5 = str5+sayi;
        System.out.println(str5);

        double dd =3;
        str5 = str5+dd;
        System.out.println(str5);

        String str6 =""+ sayi;

        str6 = "" + sayi+dd;
        // "9"
        // "93.0"
        str5 = sayi+dd+"";
        // 12.0
        // "12.0"

        System.out.println(str6);
        System.out.println(str5);


    }
}
