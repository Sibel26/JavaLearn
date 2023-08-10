package Level_2;

public class T06 {
    public static void main(String[] args) {
        /* String str= "20+8" şeklinde bir strin geriliyor bu strin 2 sayı ve ortasında bir
        matematiksel işlemden oluşmaktadır, ortasındaki matematiksel işleme göre işlemi yapıp sonucu yazdırın
        output: = 20+8 = 28
        ortasındaki işlem 4 işlemin yanı sıra  "<" = küçüğünü bul, ">" büyüğünü bul işlemide olabilir
        switch  kullanın, case içerisinde ise her bir işlem için bir metot olsun

         */

        String str = "20+8";
        int index=0;
        for (int i = 0; i <str.length(); i++) {
            char ch= str.charAt(i);
            if (!Character.isDigit(ch)) {
                index = i;
                break;
            }
        }

        }








    }

