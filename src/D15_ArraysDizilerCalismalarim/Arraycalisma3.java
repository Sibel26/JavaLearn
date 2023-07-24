package D15_ArraysDizilerCalismalarim;

import java.util.Arrays;

public class Arraycalisma3 {
    public static void main(String[] args) {
        // TASK 01 )
// String StringValue = "John Gilbert:43:UK";
// output -->
// name : John Gilbert
// age : 43
// country : UK
// WRİTE CODE BY USING ARRAYS METHODS

      String ad  = "ayse kek yedi";
      String [] arr = ad.split( "e"); // ( " ") yazarsak kelimeleri böler
        System.out.println(Arrays.toString(arr));


        String StringValue = "John Gilbert:43:UK";
        String [] arr1 = StringValue.split( ":" );
        System.out.println(Arrays.toString(arr1));
        System.out.println("name : "+arr1[0]);
        System.out.println("age : "+arr1[1]);
        System.out.println("country : "+arr1[2]);




    }
}
