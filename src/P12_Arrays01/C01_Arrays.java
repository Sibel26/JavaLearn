package P12_Arrays01;

import java.util.Arrays;

public class C01_Arrays {
     /*
        Array (Dizi): Java'da birden fazla aynı type variable depolamak (store etmek) icin kullanilan bir objedir.
        Array tanımlamak için:
        1- data type (Bir array'in icerisinde sadece ayni data tipinden variable omalıdır.)
        2- length (length array'e depolanacak  max eleman sayisini belirtir ve length'den
        fazla eleman  koyulursa RTE verir)

         Array'de primitive datalar veya non-primitive datalarin referanslari store edilebilir
         isimler array'inin icinde isim degerleri degil, isimlerin referanslari saklanır
         Hata tipleri :
         Run Time Error     : RTE
         Compile Time Error : CTE



         */

     public static void main(String[] args) {
        // int dizi[] = new int[5]; // tercih edilmez
        // int dizi oluşturulduğunda içi sıfırla doludur , String ise null
        // dizi nin boyutu sonradan değiştirilemez, boyut tanımlanırken parametre kullanılabilir.
         int[] notList = new int[5];
         for (int i = 0; i < notList.length ; i++) {
             System.out.println(notList[i]);
         }
         String[] isimList = new String[10];
         for (int i = 0; i <isimList.length ; i++) {
             System.out.println(isimList[i]);
         }
         // diziye başlangıç değerleri verme
         int[] sayiList={10,3,4,67,5,6};
         // sayiList dizisinin elemanlarının toplamını bulunuz
         int sum = Arrays.stream(sayiList).sum();

         String str = "selamlar";





     }
}
