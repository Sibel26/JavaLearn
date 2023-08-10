package Quiz;

import java.util.Arrays;

public class Q05 {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
        Arraydaki en büyük 2. elemanı yazdıran bir program yazın.
         */

        // Kodu aşağıya yazınız..
        int[] numbers = {15, 25, 22, 18, 30};

        // Diziyi sıralayalım
        Arrays.sort(numbers);

        // En büyük 2. elemanı bulalım
        int secondLargest = numbers[numbers.length - 2];

        // Sonucu yazdır
        System.out.println("En büyük 2. eleman: " + secondLargest);
    }

}

