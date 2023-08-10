package P12_Arrays.Tasks02;

import java.util.Arrays;

public class T04 {
    // Dizi için contains metodu yazınız, geri dönüş tipi boolean olsun
    public static void main(String[] args) {
        int[] dizi = {3,6,8,3,4,7,11,55,77,3,4,5,6};
        int sayi=77;
        boolean sonuc = Dizi.contains(dizi,sayi);
        if (sonuc) System.out.println(sayi+" dizi içerisinde vardır");
        else  System.out.println(sayi+" dizi içerisinde yoktur");
    }


}
