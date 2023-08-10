package P13_Arrays03.Tasks02;

import java.util.ArrayList;
import java.util.Arrays;

public class T03 {
    public static void main(String[] args) {
         /*
    hillNum() isminde bir method oluşturun.
    Parametre olarak Integer ArrayList
    Return tipi int,
    Eğer sayı, önceki sayıdan küçük ve bir sonraki sayıdan büyük ise, o sayıyı yazdırın.
    Örneğin;
    ArrayList  5,4,6,2,1
    2, 6'dan küçük ve 1 den büyüktür.
    Return 2 olmalı.
     */

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 4, 6, 2, 1));
        int sayi = hillNum(list);
        System.out.println("Şartı sağlayan sayı => " + sayi);

    }

    private static int hillNum(ArrayList<Integer> list) {
        int sayi = 0;
        for (int i = 1; i < list.size() - 1; i++) {
            if (list.get(i) < list.get(i - 1) && list.get(i) > list.get(i + 1)) {
                sayi = list.get(i);
            }
        }
        return sayi;
    }
}




