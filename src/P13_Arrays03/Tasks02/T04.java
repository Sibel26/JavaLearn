package P13_Arrays03.Tasks02;

import java.util.ArrayList;
import java.util.Arrays;

public class T04 {
    public static void main(String[] args) {
        /*
        commonValues() isminde bir method oluşturun.
        Parametre olarak 2 tane Integer ArrayList
        Return tipi integer ArrayList olmalı
         İki arraylist alın ve arraylist'teki tüm ortak değerleri döndürün
        Örneğin;
        ArrayList 1:    3 , 2 , 5 , 6
        ArrayList 2:     5 , 8 , 9
        return  5 olmalı

        Örneğin;
        ArrayList 1: 8,7,9,6,7
        ArrayList 2: 6,7,12,3,1
        return 6 ve 7 olmalı
     */


        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(8,7,9,6,7));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(6,7,12,3,1));
        ArrayList<Integer> list3 = new ArrayList<>();

        list3 = commonValues(list1,list2);
        System.out.println(list3);


    }

    private static ArrayList<Integer> commonValues(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> commonList =new ArrayList<>();
        for (int i = 0; i <list1.size() ; i++) {
            for (int j = 0; j <list2.size() ; j++) {
                if (list1.get(i).equals(list2.get(j))){
                    if(!commonList.contains(list1.get(i))) commonList.add(list1.get(i));
                }

            }
        }

        return commonList;
    }
}










