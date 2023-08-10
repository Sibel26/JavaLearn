package Quiz;

import java.util.Arrays;

public class Qx04 {
    // 20 elemanlı random bir dizi üretin
    // dizi üretildikten sonra, tek sayıları diziden çıkartın
    // üretilen dizi : int[] arr = {21, 27, 46, 79, 44, 2, 1, 80};
    // istenen hali          arr = {46, 44, 2, 80};
    public static void main(String[] args) {
        int[] arr = {21, 27, 46, 79, 44, 2, 1, 80};
        int index= 0;
        for (int i =0; i < arr.length; i++) {
            if(arr[i]%2 == 0) { // ilk elemeani sifira bölunuyor mu hayir
                arr[index]=arr[i];//index++
                index++;

            }
        }
        arr= Arrays.copyOf(arr,index);
        System.out.println(Arrays.toString(arr));


    }
}
