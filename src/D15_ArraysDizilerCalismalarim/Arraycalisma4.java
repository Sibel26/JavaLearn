package D15_ArraysDizilerCalismalarim;

import java.util.Arrays;

public class Arraycalisma4 {
    public static void main(String[] args) {
        // TASK 02 )
// String str = "28/12/1972";
// output -->
// day : 28
// month : 12
// year : 1972
// WRİTE CODE BY USING ARRAYS METHODS

        String str = "28/12/1972";
        String [] arr= str.split( "/");
        System.out.println(Arrays.toString(arr));
        System.out.println("day : " + arr[0]);
        System.out.println("month : "+arr[1]);
        System.out.println("year : "+arr[2]);






    }
}
