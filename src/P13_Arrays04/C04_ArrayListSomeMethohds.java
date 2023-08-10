package P13_Arrays04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class C04_ArrayListSomeMethohds {
    public static void main(String[] args) {
        // sort():-> list elelmanlarını NATUREL sıralama yapar
        // reverse() method list elemanlarını index sırasına göre ters sıralar..
        //list'i  array'e cevirme ->toArray();
        // array i , ArrayList e çevirme
        ArrayList<String> ulkelist = new ArrayList<>
                (Arrays.asList("Alamanya", "Güba", "Polkonya", "Dingiltere", "Amerigonya"));
        Collections.sort(ulkelist);
        System.out.println(ulkelist);
        Collections.reverse(ulkelist);
        System.out.println(ulkelist);
        System.out.println(" ---from Arraylist to Array -- - - -");
        String ulkeArr[] =ulkelist.toArray(new String[0]);
        System.out.println(Arrays.toString(ulkeArr));

        System.out.println(" ---from Array to Arraylist -- - - -");
        ArrayList<String> yeniListe = new ArrayList<>(Arrays.asList(ulkeArr));

        System.out.println(yeniListe);




        Object  ulkeArr1 []=ulkelist.toArray();//list elelmanları toArray method ile Object data type ulkeArr atandı






    }
}
