package P13_Arrays03;

import java.util.ArrayList;
import java.util.Arrays;

public class C02_ArrayListRemove {
    public static void main(String[] args) {
        ArrayList<String> meyveler = new ArrayList<>
                (Arrays.asList("elma","muz","kivi","muz","portakal","çilek","muz","karpuz"));
        System.out.println(meyveler);
        String silinenMeyve = meyveler.remove(5);
        System.out.println("silinenMeyve = " + silinenMeyve);
        System.out.println(meyveler);
        boolean sonuc = meyveler.remove("muz");
        System.out.println("sonuc = " + sonuc);
        System.out.println(meyveler);


        ArrayList<Integer> sayilar = new ArrayList<>(Arrays.asList(15,6,3,8,9,11,34,23,61));
        System.out.println(sayilar);
        int silinenSayi= sayilar.remove(6);
        System.out.println("silinenSayi = " + silinenSayi);
        System.out.println(sayilar);
        boolean sildimi = sayilar.remove((Integer) 23);
        System.out.println("sildimi = " + sildimi);
        System.out.println(sayilar);

    }
}
