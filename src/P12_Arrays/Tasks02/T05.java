package P12_Arrays.Tasks02;

import java.util.Arrays;

public class T05 {
    public static void main(String[] args) {
        // diziyi tersten geriye sıralı yazdırınız
        // en soldaki ile en bastaki degisiyor
        int[] arr = {21, 27, 46, 79, 44, 2, 1, 80};
        for (int i = 0; i <= arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;


        }
        System.out.println(Arrays.toString(arr));
    }
}