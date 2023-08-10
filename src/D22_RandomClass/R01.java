package D22_RandomClass;

import java.util.Arrays;
import java.util.Random;

public class R01 {
    public static void main(String[] args) {
        byte[] dizi = new byte[10];
        Random r = new Random();
        r.nextBytes(dizi);
        System.out.println(Arrays.toString(dizi));
        int sayi= 10;
        topla(sayi);


    }

    private static void topla(int sayi){
        sayi= sayi*2;
    }


}
