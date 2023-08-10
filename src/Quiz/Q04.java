package Quiz;

public class Q04 {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
        En küçük (minimum) sayıyı yazdırınız.
         */

        //Int Array olusturalim
        int[] sayi = {14, 19, 5, 21};
       // En küçük sayıyı bulmak için ilk elemanı minimum olarak kabul edelim
        int minSayi = sayi[0];

        // Diziyi dolaşarak en küçük sayıyı bulalım
        for (int i = 1; i < sayi.length; i++) {
            if (sayi[i] < minSayi) {
               minSayi = sayi[i];
            }
        }

        // Sonucu yazdır
        System.out.println("En küçük sayı: " + minSayi);
    }
}





