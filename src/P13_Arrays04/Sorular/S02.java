package P13_Arrays04.Sorular;

import java.util.ArrayList;
import java.util.Arrays;

public class S02 {
    public static void main(String[] args) {
      /*
        ismi getCount() olan bir method oluşturun.
        Parametre olarak bir String ArayList  ve  bir tane String

        Return tipi int olmalı.

        ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
        Örneğin;
        ArrayList = Orange , Kiwi , Peach , Banana , Orange
        String Orange:
        Count = 2 olmalı. (Orange 2 kez yazılmış)
         */
        ArrayList<String> fruits = new ArrayList<>
                (Arrays.asList("Orange","Kiwi" , "Peach" , "Banana" , "Orange"));
        String meyve="Orange";
        int tekrarSayisi = getCount(fruits,meyve);
        System.out.println(meyve+" "+tekrarSayisi+" defa dize de kullanılmıştır");

        // soru 2 : bu dizinin tüm elemanlarını büyük harfe çeviren setUpperCase adında bir metot yazınız
        fruits = setUpperCase(fruits);
        System.out.println(fruits);
    }

    private static ArrayList<String> setUpperCase(ArrayList<String> fruits) {
        for (int i = 0; i <fruits.size() ; i++) {

         //   fruits.set(i, fruits.get(i)); -- sağ sol aynı şey-- fruits[i] = fruits[i];
            fruits.set(i, fruits.get(i).toUpperCase());  // fruits[i] = fruits[i].toUpperCase;

        }
        return fruits;
    }

    private static int getCount(ArrayList<String> fruits, String meyve) {
        int counter=0;
        for (int i = 0; i <fruits.size() ; i++) {
            if (fruits.get(i).equals(meyve)) counter++;
        }

        return counter;
    }
}
