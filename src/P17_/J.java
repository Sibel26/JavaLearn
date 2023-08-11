package P17_;

import java.util.Arrays;
import java.util.Random;

public class J {






        public static void main(String[] args) {
            byte[] dizi = new byte[10];
            Random r = new Random();
            r.nextBytes(dizi);
            System.out.println(Arrays.toString(dizi));
            int sayi=10;
            sayi=topla(sayi);
            System.out.println(sayi);
            System.out.println(r.nextInt(sayi));
            System.out.println(sayi);
        }
        private static int topla(int sayi){
            sayi=sayi*2;
            return sayi;
        }
    }




