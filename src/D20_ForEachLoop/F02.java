package D20_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class F02 {
    public static void main(String[] args) {
        //Diziyi alt alta gelecek sekilde print ediniz
        List<Integer> sayiList = new ArrayList<>(List.of(16, 21, 33, 54, 15, 45, 58));


        for (Integer veri : sayiList) {
            System.out.println(veri);
        }


//bu dizideki tek sayilari print ediniz
        for (Integer veri : sayiList) {
            if (veri % 2 != 0) {
                System.out.println(veri);
            }


        }
    //bu dizideki ilk iki eleman disinda kalanlari prin edin
    for (Integer veri : sayiList.subList(2,sayiList.size())) {
        System.out.println(veri);
    }



    }}
