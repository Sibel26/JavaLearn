package P12_Arrays.Sorular;

import java.util.Arrays;

public class S01 {
    public static void main(String[] args) {
        // sayiList dizisinin elemanlarının toplamını bulunuz
        int[] sayiList={10,3,4,67,5,6};
        // cozum 1
        int sum = Arrays.stream(sayiList).sum();
        System.out.println("toplam = " + sum);
        // cozum 2
        sum=0;
        for (int i = 0; i <sayiList.length ; i++) {
            sum+=sayiList[i];
        }
        System.out.println("toplam = " + sum);
    }
}
