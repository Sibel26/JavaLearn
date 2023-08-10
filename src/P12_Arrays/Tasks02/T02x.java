package P12_Arrays.Tasks02;

import java.util.Arrays;

public class T02x {
    public static void main(String[] args) {
        int[] arr = {21, 27, 46, 79, 44, 2, 1, 8};
        // Arrays.sort kullanmadan diziyi sıralayınız
        // selection sort , seçmli sıralama
        // int[] arr3 = {21, 27, 46, 79, 44, 2, 1, 80};
        // int[] arr3 = {1, 27, 46, 79, 44, 2, 21, 80};
        // int[] arr3 = {1, 2, 46, 79, 44, 27, 21, 80};
        // int[] arr3 = {1, 2, 21, 27, 44, 79, 46, 80};
        // int[] arr3 = {1, 2, 21, 27, 44, 79, 46, 80};
        // int[] arr3 = {1, 2, 21, 27, 44, 46, 79, 80};
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i; j < arr.length ; j++) {

            }
        }
        // 2.sıralama yöntemi (buble sort, kabarcık sıralama
        // {21, 27, 46, 79, 44, 2, 1, 80};
        // {21, 27, 46, 44, 2, 1, 79, 80};
        //

        arr = selectionSort(arr);
     //   arr = bubleSort(arr);
      //  System.out.println(Arrays.toString(arr));

    }

    private static int[] bubleSort(int[] arr) {
        // int[] arr = {21, 27, 46, 79, 44, 2, 1, 80};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length-1-i ; j++) {
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                System.out.println(Arrays.toString(arr));
            }
            System.out.println();
            System.out.println();
            System.out.println(Arrays.toString(arr));
        }

        return arr;
    }

    private static int[] selectionSort(int[] arr) {
        System.out.println(Arrays.toString(arr));
        int ekIndex=0;
        for (int i = 0; i < arr.length ; i++) {
            int eK= arr[i];
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[j]<eK) {
                    eK=arr[j];
                    ekIndex=j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[ekIndex];
            arr[ekIndex] = temp;
            System.out.println("en kucuk = "+eK+" index="+ekIndex);
            System.out.println(Arrays.toString(arr));
        }

        return arr;
    }
}
