package P12_Arrays.Tasks;

import java.util.Arrays;

public class Task10 {

    public static void main(String[] args) {
        /* TASK :
        bir int Array elemanlarinin işaretini(+-)degistiren  bir METHOD create ediniz.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6

         */
        // cozum

        int[] array = {1, 2,3,-7,10,5,6,-9,1,2};
        int sayi = 5;
        sayi = -1*sayi;
        System.out.println(Arrays.toString(array));
        for(int i=0; i<array.length; i++) {
            array[i] = -1*array[i];
        }
        System.out.println(Arrays.toString(array));




    }
}
