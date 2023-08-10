package D20_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class F01 {

    public static void main(String[] args) {
        List<Integer> sayiList = new ArrayList<Integer>(List.of(16,21,33,54,15,45,58));
        int toplam=0;

        for (int i=0; i<sayiList.size(); i++) {
            toplam += sayiList.get(i);
        }

        for(Integer veri : sayiList) { // veri= sayiList[i]
            toplam += toplam +veri;
        }
        System.out.println("toplam = " + toplam);


    }
}
