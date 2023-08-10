package P15_Varargs.Tasks;

import java.util.Arrays;

public class Task04 {
    public static void main(String[] args) {

        int[] array = new int[10];
        array = metottur(15,6,9,8,7);
        System.out.println(Arrays.toString(array));
    }
    private static int[] metottur(int...ints) {
        int [] array = new int[10 ];
        int index=0;
        for(int value:ints) {
            array[index] = value;
        }
        return array;
    }


}
