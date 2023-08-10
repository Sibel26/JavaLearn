package P12_Arrays.Sorular;

import java.util.Arrays;

public class S09 {
    public static void main(String[] args) {
        int arr[][] = {
                {3, 5},//0. kat
                {2, 4, 1},//1. kat
                {6, 1, 2, 2},//2. kat
        };
        // yukarıdaki şekilde verilen her bir boyutu kendi içinde sıralayınız

        int[][] arr1 = {{3, 5}, {2, 4, 1}, {6, 1, 2, 2}};
        System.out.println(Arrays.toString(arr1[1]));

        for (int i = 0; i < arr1.length; i++) {
            Arrays.sort(arr1[i]);
        }
        System.out.println(Arrays.deepToString(arr1));
    }
}