package D18_ArrayList;

import java.util.ArrayList;

public class AList3 {
    public static void main(String[] args) {
        // diziye 10 adet çift sayı ekleyin

        ArrayList<Integer> dizi = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            dizi.add((i + 1) * 2);

        }
        System.out.println(dizi);
       //diziyi eleman eleman yazdiralim
        System.out.println(" ");
        for(int i = 0; i <dizi.size(); i++) {
            System.out.print(dizi.get(i)+", ");
        }

    }

}
