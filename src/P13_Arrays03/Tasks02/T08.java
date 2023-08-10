package P13_Arrays03.Tasks02;

import java.util.ArrayList;
import java.util.Arrays;

public class T08 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>
                (Arrays.asList("Orange","Kiwi" , "Peach" , "Banana" , "Orange"));
        String meyve="muz";
        // meyve yi kiwiden sonraya yerleştirin
        for (int i = 0; i < fruits.size(); i++) {
            if (fruits.get(i).equals("Kiwi")){
                int kiwiIndex=i;
                fruits.add(kiwiIndex+1,meyve);
            }
        }
        System.out.println(fruits);
    }
}


