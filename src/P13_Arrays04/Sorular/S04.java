package P13_Arrays04.Sorular;

import java.util.ArrayList;
import java.util.Arrays;

public class S04 {
    public static void main(String[] args) {
        /*
        getSum() isminde bir method oluşturun.
        Parametresi ArrayList olmalı
        Return tipi int olmalı.
        ArrayList teki tüm sayıları birbiri ile toplayın.
        return olarak toplam sonucu döndürün.
        Örneğin;
        Arraylist = 5,2,4,4,1
        return 15 olmalı
         */
        ArrayList <Integer> list = new ArrayList<>(Arrays.asList(5,2,4,4,1));

        int toplam = getSum(list);
        System.out.println("toplam = " + toplam);

        list = new ArrayList<>(); // yeni referans atar

        list.clear();



        System.out.println("list="+list);
    }
    private static int getSum(ArrayList<Integer> dizi) {
        int toplam = 0;
        for (int i = 0; i < dizi.size(); i++) {
            toplam += dizi.get(i);

        }
        return toplam;
    }
}
