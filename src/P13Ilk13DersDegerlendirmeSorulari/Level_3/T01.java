package P13Ilk13DersDegerlendirmeSorulari.Level_3;

import java.util.ArrayList;

public class T01 {
    public static void main(String[] args) {
        // Rastgele (0 ile 9 arasında ) 100 adet sayı üretin,
        // a)  her bir sayının kaç kez tekrar üretildiğini edildiğini bulunuz
        // output   0   ?? kez tekrar edilmiştir
        //          1   ?? kez tekrar edilmiştir
        //         ...
        //

        // b) a şıkkını tekrar yapın ama toplam kullandığınız ";" sayısı 5 i geçmesin

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i <10 ; i++) list.add((int) (Math.random()*10));

        int[] arr = new int[10];

        for (int i = 0; i <list.size() ; i++)
            arr[list.get(i)]++;

        for (int i = 0; i < arr.length ; i++)
            System.out.println(i+" sayısı toplam "+arr[i]+" adet üretilmiştir");

    }
}
