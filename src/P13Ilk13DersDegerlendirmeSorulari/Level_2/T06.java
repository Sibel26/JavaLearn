package P13Ilk13DersDegerlendirmeSorulari.Level_2;

public class T06 {
    public static void main(String[] args) {
        /* String str= "20+8" şeklinde bir strin geriliyor bu strin 2 sayı ve ortasında bir
        matematiksel işlemden oluşmaktadır, ortasındaki matematiksel işleme göre işlemi yapıp sonucu yazdırın
        output: = 20+8 = 28
        ortasındaki işlem 4 işlemin yanı sıra  "<" = küçüğünü bul, ">" büyüğünü bul işlemide olabilir
        switch  kullanın, case içerisinde ise her bir işlem için bir metot olsun

         */
        String str="20*8";
        int index=0;

        char ch=' ';


        for (int i = 0; i <str.length() ; i++) {
            ch=str.charAt(i);
            if (!Character.isDigit(ch)) {
                index = i;
                break;
            }
        }
        int s1 = Integer.parseInt(str.substring(0,index));
        int s2 = Integer.parseInt(str.substring(index+1));
        System.out.println("ch = " + ch);
        System.out.println("index = " + index);
        switch (ch) {
            case '+' : toplam(s1,s2);break;
            case '-' : cikar(s1,s2);break;
            case '*' : carp(s1,s2);break;
            case '/' : bol(s1,s2);break;
            case ':' : bol(s1,s2);break;
            case '<' : kucukBul(s1,s2);break;
            case '>' : buyukbul(s1,s2);break;
        }
    }

    private static void buyukbul(int s1, int s2) {
        System.out.println(Math.max(s1,s2));
    }
    private static void kucukBul(int s1, int s2) {
        System.out.println(Math.min(s1,s2));
    }
    private static void bol(int s1, int s2) {
        System.out.println(1.0*s1/s2);
    }
    private static void carp(int s1, int s2) {
        System.out.println(s1*s2);
    }
    private static void cikar(int s1, int s2) {
        System.out.println(s1-s2);
    }
    private static void toplam(int s1, int s2) {
        System.out.println(s1+s2);
    }
}
