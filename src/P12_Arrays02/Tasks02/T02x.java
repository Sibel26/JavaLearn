package P12_Arrays02.Tasks02;

public class T02x {
    public static void main(String[] args) {
        int[] arr = {21, 27, 46, 79, 44, 2, 1, 80};
        // Arrays.sort kullanmadan diziyi sıralayınız
        // selection sort , seçmli sıralama
        // int[] arr3 = {21, 27, 46, 79, 44, 2, 1, 80};
        // int[] arr3 = {1, 27, 46, 79, 44, 2, 21, 80};
        // int[] arr3 = {1, 2, 46, 79, 44, 27, 21, 80};
        // int[] arr3 = {1, 2, 21, 27, 44, 79, 46, 80};
        // int[] arr3 = {1, 2, 21, 27, 44, 79, 46, 80};
        // int[] arr3 = {1, 2, 21, 27, 44, 46, 79, 80};
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i; j < arr.length ; j++) {

            }
        }
        // 2.sıralama yöntemi (buble sort, kabarcık sıralama
        // {21, 27, 46, 79, 44, 2, 1, 80};
        // {21, 27, 46, 44, 2, 1, 79, 80};
        //
        int temp = arr[1];
        arr[1] = arr[5];
        arr[5] = temp;



    }
}
