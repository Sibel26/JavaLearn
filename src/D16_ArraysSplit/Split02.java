package D16_ArraysSplit;

public class Split02 {
    public static void main(String[] args) {
        int[] arr={21,27,46,79,44,2,1,80};
        //Arrays.sort kullanmadan diziyi siralayiniz
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length; j++) {

            }
        }

        //2.siralama yöntemi

        int temp = arr[1];
        arr[1] = arr[5];
        arr[5] = temp;

    }



}
