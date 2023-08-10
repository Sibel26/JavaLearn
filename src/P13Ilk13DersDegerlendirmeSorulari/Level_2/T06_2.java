package P13Ilk13DersDegerlendirmeSorulari.Level_2;

public class T06_2  {
    static int s1;
    static int s2;
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
    s1 = Integer.parseInt(str.substring(0,index));
    s2 = Integer.parseInt(str.substring(index+1));
    System.out.println("ch = " + ch);
    System.out.println("index = " + index);
    switch (ch) {
        case '+' : toplam();break;
        case '-' : cikar();break;
        case '*' : carp();break;
        case '/' : bol();break;
        case ':' : bol();break;
        case '<' : kucukBul();break;
        case '>' : buyukbul();break;
    }
}

        private static void buyukbul() {
            System.out.println(Math.max(s1,s2));
        }
        private static void kucukBul() {
            System.out.println(Math.min(s1,s2));
        }
        private static void bol() {
            System.out.println(1.0*s1/s2);
        }
        private static void carp() {
            System.out.println(s1*s2);
        }
        private static void cikar() {
            System.out.println(s1-s2);
        }
        private static void toplam() {
            System.out.println(s1+s2);
        }
}
