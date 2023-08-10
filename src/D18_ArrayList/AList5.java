package D18_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class AList5 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>
                (Arrays.asList("Orange","Kiwi" , "Peach" , "Banana" , "Orange"));
        //  yukarıda dizide ki elemanların uzunlukları toplamını bulunuz



        int toplam = 0;
        for (int i= 0; i<fruits.size(); i++) {
        toplam += fruits.get(i).length();

        }
        System.out.println(toplam);
        }
    }



