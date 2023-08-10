package P12_Arrays.Sorular;

import java.lang.reflect.Array;
import java.util.Arrays;

public class S04 {

    public static void main(String[] args) {

        /*
        Şu şekilde olan bir int Array'î oluşturunuz.  [{2,3,2} , {4,1,5} , {7,2,5}]
        Bütün 2'leri 6'yla değiştirin.
        Array'i yazdırınız.
         */

        //Kodu aşağıya yazınız.
        String [] sehirler = {"istanbul","ankara","mus"};

        int[][] array = {{2,3,2} , {4,1,5} , {7,2,5}, {1,2,6}};
        // i=2 ,  j=1
        System.out.println("eleman = "+array[1][2]);

        for (int i = 0; i <array.length ; i++) { // 4 elemanlı
            for (int j = 0; j <array[i].length ; j++) {
                if (array[i][j]==2) array[i][j]=6;
            }
        }


        // cok boyutlu array print
        System.out.println(Arrays.deepToString(array));

        // 2 boyutlu array print
        for (int i = 0; i < array.length ; i++) {
            System.out.println(Arrays.toString(array[i]));
        }




    }
}