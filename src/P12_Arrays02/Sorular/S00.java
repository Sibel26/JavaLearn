package P12_Arrays02.Sorular;

import java.util.Arrays;

public class S00 {
    public static void main(String[] args) {
        int[] sayiList={10,3,4,67,5,6};
        // soru : dizinin son elemanını yazdırınız
        System.out.println("son eleman "+ sayiList[sayiList.length-1]);
        // soru 2: sayiList dizisinin sayiList.length . elemanını print ediniz
       // System.out.println(sayiList[sayiList.length]);

        // soru 3: sayiList dizisinin eleman sayısını print ediniz
        System.out.println("Eleman sayısı = "+sayiList.length);

        // soru 4: sayıList dizisinin 2.ve 3. elemanını toplayıp, 2.elemanına koyunuz
        sayiList[2] = sayiList[2]+sayiList[3];

        // soru 5 : sayiList Dizisini print ediniz
        for (int i = 0; i < sayiList.length ; i++) {
            System.out.print(sayiList[i]+ " ");
        }
        System.out.println();
        // soru 5 cozum 2
        System.out.println(Arrays.toString(sayiList));
    }
}
