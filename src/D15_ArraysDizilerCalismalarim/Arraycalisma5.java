package D15_ArraysDizilerCalismalarim;

import java.util.Arrays;

public class Arraycalisma5 {
    public static void main(String[] args) {
        //  TASK 03)
// int[] arr = { 13, 7, 6, 45, 21, 9, 2, 100 };
// 1- do natural order kücükten büyüge siralama sort metodu
// 2- do natural ordes between 1 to 4 index ( 1 ve 4 dahil ) //1 ve 4.arasindakileri sirala


        int[] arr = { 13, 7, 6, 45, 21, 9, 2, 100 };
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr1 = { 13, 7, 6, 45, 21, 9, 2, 100 };
        Arrays.sort(arr1,1,5);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = { 13, 7, 6, 45, 21, 9, 2, 100 };
        int [] a = Arrays.copyOfRange(arr2,1,5);
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));





    }
}
