package P12_Arrays02;

import java.util.Arrays;

public class C03_ArraysClass {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 46, 79, 80, 21, 27, 44};
        int[] arr2 = {1, 2, 46, 79, 80, 21, 27, 44};
        int[] arr3 = {21, 27, 46, 79, 44, 2, 1, 80};

        if (Arrays.equals(arr1,arr2)) System.out.println("eşittir");
        else System.out.println("eşit değildir");
        // ikis tamamen aynı
        boolean sonuc=Arrays.equals(arr1,arr2);
        if (sonuc) System.out.println("eşittir");
        else System.out.println("eşit değildir");

        // eşitse 0 değilse, -1 dönderiyor (int olarak)
        System.out.println(Arrays.compare(arr1,arr2));
        System.out.println(Arrays.compare(arr1,arr3));
        System.out.println(Arrays.compare(arr2,arr3));

        // dizinnin uzunluğunu değiştiriyot
        arr1 = Arrays.copyOf(arr1,20);
        System.out.println(Arrays.toString(arr1));

        // diziyi 5 eleman uzatalım
        arr1 = Arrays.copyOf(arr1,arr1.length+5);
        // aynı işi yapar
        arr1 = Arrays.copyOfRange(arr1,0,arr1.length+5);

        // arr1 in 5 den 10 kadar olan elemanlarından yeni bir dizi oluşturuyor
        arr2 = Arrays.copyOfRange(arr1,5,10);

        // dizinin içerisini doldurmak için
        Arrays.fill(arr1,10);
        // arr1 dizisinin 5 den 10 kadar elemanlarınının hepsinni 44 yap
        Arrays.fill(arr1,5,10,44);


    }
}
