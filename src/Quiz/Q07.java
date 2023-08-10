package Quiz;

import java.util.Arrays;

public class Q07 {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,7,10,5,6,9,1,2};
        int[] array2 = {21, 27, 46, 79, 44, 2, 1, 80};

        // yukarıdaki diziler veriliyor, aşağıdaki işlemleri yapıp, diziyi her defasında yazdırın
        // a) 1. dizinin boyutunu 2. dizinin boyutuna eşit olacak şekilde boyutunu arttırın

        // b) dizler eşitmidir, 2 yöntem ile karşılaştırın

        // c) diziyi sıralayın

        array2 = Arrays.copyOf(array2,array1.length);
        System.out.println(Arrays.toString(array2));

        System.out.println(Arrays.equals(array2, array1));
        //sort la uzunlugunu bul
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));







    }
}
