package P12_Arrays.Sorular;

import java.util.Arrays;

public class S05 {

    public static void main(String[] args) {

        /*
        Şu şekilde olan bir 2D int Array'i oluşturunuz.  [{5,2,1} , {10,2,3,6} , {1,2}]
        2D array'de olan elemanları toplayınız.
        toplamı yazdırınız.
        Sonuç 32 olmalıdır.
         */

        int [][] dizi = {{5,2,1} , {1,2,3,6,7,9,2,4} , {1,2}};

      //  dizi[2] = new int[5]; // 5 elemanlı olarak yeniden tanımladık, hepsi sıfır oldu
        dizi[2] = Arrays.copyOf(dizi[2],5); // dizinin boyutunu uzattık 5 yaptık

        int toplam=0;
        for (int i = 0; i < dizi.length ; i++) {
            for (int j = 0; j <dizi[i].length ; j++) {
                toplam += dizi[i][j];
                System.out.print(dizi[i][j]+" ");
            }
            System.out.println();

        }
        System.out.println("toplam = " + toplam);

    }
}