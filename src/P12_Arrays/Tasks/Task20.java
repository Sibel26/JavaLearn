package P12_Arrays.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task20 {
    public static void main(String[] args) {
        // Task-> verilen bir array'den istenmeyen eleman harici kalanlari
        // yeni bir array'a atayıp print eden METHOD create ediniz

        int[] arr={3,4,2,3,5,7,3,8,5,2,4};
        //        {4,2,5, , , , , }
        int istenmeyenEleman=3;
        int istenmeyenSayisi=0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]==istenmeyenEleman) istenmeyenSayisi++;
        }
        int k=0;
        int[] newArr= new int[arr.length-istenmeyenSayisi];
        // i= 0,1,2,3,4,5
        // k= 0,1,2,3
        for (int i = 0; i <arr.length ; i++) {

            if (arr[i] != istenmeyenEleman) {
                newArr[k] = arr[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(newArr));

    }


}
