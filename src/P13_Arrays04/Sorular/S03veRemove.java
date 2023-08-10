package P13_Arrays04.Sorular;

import java.util.ArrayList;
import java.util.Arrays;

public class S03veRemove {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>
                (Arrays.asList("Orange","Kiwi" , "Peach" , "Banana" , "Orange"));
        //  yukarıda dizide ki elemanların uzunlukları toplamını bulunuz
        int counter=0;
        for (int i = 0; i < fruits.size() ; i++) {
            counter = counter + fruits.get(i).length();
        }
        System.out.println(counter);

        // remove 1 , verdiğimiz indexdeki veriyi siliyor o veriyi bize geri döndürüyor
        System.out.println(fruits);

        String result = fruits.remove(0);
        System.out.println(result);
        System.out.println(fruits);



    }
}
