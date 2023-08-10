package P12_Arrays02;

import java.util.Arrays;

public class C05_ArraysBinarySearch {
    public static void main(String[] args) {
        int[] arr = {21, 27, 46, 79, 44, 2, 1, 80};
        //binarySearch kullanmak için mutlaka önce dizi sıralanmalıdır

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr,80));
        System.out.println(Arrays.binarySearch(arr,27));
        System.out.println(Arrays.binarySearch(arr,10));
        System.out.println(Arrays.binarySearch(arr,21));
        System.out.println(Arrays.binarySearch(arr,25));
        System.out.println(Arrays.binarySearch(arr,81));




    }
}
