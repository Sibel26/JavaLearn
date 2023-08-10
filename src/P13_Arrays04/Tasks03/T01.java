package P13_Arrays04.Tasks03;

import java.util.ArrayList;

public class T01 {
    public static void main(String[] args) {
        // Arraylist oluşturun ras gele 10 sayı ekleyin
        ArrayList<Integer> liste = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            int sayi = (int) (Math.random()*50);
            liste.add(sayi);
        }
        for (int i = 0; i <liste.size() ; i++) {
            boolean asalmi= asalControl(liste.get(i));
            if (!asalmi) {
                liste.remove(i);
                i--;
            }
        }
        System.out.println(liste);
    }

    private static boolean asalControl(Integer integer) {
        boolean asalmi=false;
        // Islemı yapın
        return asalmi;
    }
}
