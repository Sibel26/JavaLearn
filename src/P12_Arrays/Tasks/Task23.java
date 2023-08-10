package P12_Arrays.Tasks;

import java.util.Arrays;

public class Task23 {
    public static void main(String[] args) {
        // N elemanlı bir dizi üretin, rastgele doldurun , yazdırın
        // sonra başka bir dizi kullanmadan bu diziyi ters çevirin
        // [4,7,9,1,1,0,5]
        // [5,0,1,1,9,7,4]
        int n=10;
        int[] arr = new int[n];
        for (int i = 0; i < arr.length ; i++) {
            // diziyi o ile 19 arası sayılarla doldurduk
            arr[i] = (int) (Math.random()*20);
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length/2 ; i++) {
            int temp= arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }


}
