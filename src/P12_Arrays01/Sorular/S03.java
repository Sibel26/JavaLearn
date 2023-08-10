package P12_Arrays01.Sorular;

import java.util.Arrays;

public class S03 {
    public static void main(String[] args) {
        // 10 elamnlı int bir dizi oluşturun ,
        // içerisini 1 ila 100 arasında random sayı ile doldurun.
        // oluşan diziyi print edin
        // en küçük elemanın indexi ile en büyük elemanın indexi
        // arasında kalan elemanları print edin
        int [] dizi = new int[10];
        for (int i = 0; i < dizi.length ; i++) {
            dizi[i] = (int) (Math.random()*100);

        }
        System.out.println(Arrays.toString(dizi));

    }
}
