package P12_Arrays.Tasks02;

import java.util.Arrays;

public class T08 {
    // 2 dizi var, compare kullanarak ,
    // diziler eşit ise true değilse false dönderen bir method yazınız
    public static void main(String[] args) {
        int[] arr1 = {3,5,8};
        int[] arr2 = {2,5,8};

        boolean sonuc = Dizi.compare(arr1,arr2);
        System.out.println("sonuc = " + sonuc);

    }


}
