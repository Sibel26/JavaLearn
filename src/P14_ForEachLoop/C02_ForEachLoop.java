package P14_ForEachLoop;

import java.util.Arrays;

public class C02_ForEachLoop {
    public static void main(String[] args) {
        int[][] arr = {{2, 3, 7}, {4,5}, {1,9,0,5, 6, 7}};

        for (int[] satir : arr ) {
            System.out.println(Arrays.toString(satir));
        }
        System.out.println("----------------");
        for (int[] satir : arr ) {
            for (int deger:satir     ) {
                System.out.print(deger+" ");
            }
            System.out.println();
        }




    }
}
