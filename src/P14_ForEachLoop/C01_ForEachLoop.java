package P14_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C01_ForEachLoop {
    public static void main(String[] args) {
        List<Integer> sayiList =new ArrayList<>( List.of(16,21,33,54,15,45,58));
        int toplam=0;

        for (int i = 0; i <sayiList.size() ; i++) {
            toplam +=sayiList.get(i);
        }

        for (Integer veri : sayiList) { // veri = sayilist[i]
            toplam +=  veri;
        }
        System.out.println("toplam = " + toplam);

        // dizinin her bir elemanını print edin
        for (Integer veri:sayiList){
            System.out.println(veri);
        }

        // Bu dizdeki tek sayıları print edin
        for (Integer veri:sayiList){
            if(veri%2==1) System.out.println(veri);
        }
        System.out.println(" ------------------ ");
        // bu dizideki ilk iki eleman dışında kalanları print edin
        for (Integer veri:sayiList.subList(2,sayiList.size())){
            System.out.println(veri);
        }
    }
}
