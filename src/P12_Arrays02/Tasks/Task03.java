package P12_Arrays02.Tasks;

import java.util.Arrays;

public class Task03 {

    public static void main(String[] args) {
		
		 /*
       Task-> Verilen  bir arrayin tum elemanlarini
        bir sonraki konuma print eden code create ediniz
       input:  [1, 2, 3, 7] , [a,b,c,d]
        output [7 , 1 , 2, 3], [b,c,d,a]
        */
        int[] array  = {1,2,3,7,10,5,6,9,1,2};
        System.out.println(Arrays.toString(array));
        // * cozum 1
        int lastItem= array[array.length-1];

        for (int i = array.length-1; i >0 ; i--) {
            array[i] = array[i-1];
        }
        array[0] = lastItem;
        System.out.println(Arrays.toString(array));
        // cozum 2
        int[] array2 = new int[array.length];
        for (int i = 0; i <array.length-1 ; i++) {
            array2[i+1] = array[i];
        }
        array2[0] = array[array.length-1];
        System.out.println(Arrays.toString(array2));

        // cozum 3
        int[] array3 = new int[array.length];
        for (int i = 1; i <array.length ; i++) {
            array3[i] = array[i-1];
        }
        array3[0] = array[array.length-1];
        System.out.println(Arrays.toString(array3));


    }

}
