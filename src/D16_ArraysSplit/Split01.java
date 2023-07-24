package D16_ArraysSplit;

import java.util.Arrays;

public class Split01 { // her hangi etodu parcalar split, bosluga hiclige göre harflere göre
    public static void main(String[] args) {
        int[] arr1 = {1, 2,46,79,80,21,27,44};
        int[] arr2 = {1,2,46,79,80,21,27,44};
        int[] arr3 = {21,27,46,79,44,2,1,80};
        if(Arrays.equals(arr1, arr2)) System.out.println("esittir");
        //ikisi de tamamen ayni
        else System.out.println("esit degildir");
        boolean sonuc=Arrays.equals(arr1, arr2);
        if(sonuc) System.out.println("esittir");
        else System.out.println("esit degildir");
        //esitse 0 degilse, -1 döndürüyor int olarak

        System.out.println(Arrays.compare(arr1, arr2));// compare demek karsilastirma
        System.out.println(Arrays.compare(arr1, arr3));
        System.out.println(Arrays.compare(arr2, arr3));
// dizinin uzunlugu degistiriyor
        arr1 = Arrays.copyOf(arr1, 20);
        System.out.println(Arrays.toString(arr1));
        //diziyi 5 eleman uzatalim
        arr1 = Arrays.copyOf(arr1, arr1.length+5);
        // ayni isi yapar
        arr1 = Arrays.copyOfRange(arr1, 0, arr1.length+5);
        // arr1 in 5 den 10 kadar olan elemanlarindan yeni bir dizi olusturuyor
        arr2 = Arrays.copyOfRange(arr1, 5, 10);

    }
}
