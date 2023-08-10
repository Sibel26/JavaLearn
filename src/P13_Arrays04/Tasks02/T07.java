package P13_Arrays04.Tasks02;

import java.util.ArrayList;
import java.util.Arrays;

public class T07 {
    public static void main(String[] args) {
        // Task ->  bir listte istenen sayı yı diziden silen  eden code create ediniz.
        // ornek silinecek sayı 1 olsun, tüm birler silinmeli
        ArrayList<Integer> listSayi = new ArrayList<>(Arrays.asList(1,24, 23, 14, 19, 1, 1, 55, 27, 1, 38));
        int sayi=1;
        // cozum1,
        listSayi = listtenSayiyiSil(listSayi,sayi);
        System.out.println(listSayi);
        // cozum2, bunun çalışması için yukarıdaki metot cağırmayı yoruma alın.
        for (int i = 0; i <listSayi.size() ; i++) {
           if (listSayi.get(i) == sayi) {
               listSayi.remove(i);
               i--;
           }
        }

        System.out.println();
        System.out.println(listSayi);
    }

    private static ArrayList<Integer> listtenSayiyiSil(ArrayList<Integer> listSayi, int sayi) {
        int i = 0;
        while (i<listSayi.size()) {
            if (listSayi.get(i) == sayi) {
                listSayi.remove(i);
            } else i++;
        }


        return listSayi;
    }
}
