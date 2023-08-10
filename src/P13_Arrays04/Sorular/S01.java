package P13_Arrays04.Sorular;

import java.util.ArrayList;

public class S01 {
    public static void main(String[] args) {
        // 1 den 10 kadar elemanlar dan oluşan bir arraylist oluşturun.
        //Arrays.aslist kullanmadan
        ArrayList<Integer> dizi = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            dizi.add(i+1);
        }
        System.out.println(dizi);

        // diziye 10 adet çift sayı ekleyin
        for (int i = 0; i <10 ; i++) {
            dizi.add((i+1)*2);
        }
        System.out.println(dizi);
        // dizi yi eleman elman yazdıralım

        for (int i = 0; i < dizi.size() ; i++) {
            System.out.print(" ");
            System.out.print(dizi.get(i)+",");
        }
    }
}
