package P20_Constractor00.Exemples01;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Kisi fert = new Kisi("Kamil"," Tas", 1990,false);

        System.out.println(fert.adi+" "+fert.sAdi+" "+fert.dYili + " "+ fert.isStudent);
        // Kisi class ından bir arraylist oluşturalım
        ArrayList<Kisi> kisiler = new ArrayList<>();
        kisiler.add(fert);

        fert = new Kisi(); // yeni veri atarken referansı bu şekilde sıfırlayalım
        fert.adi="Hasan";
        fert.sAdi =" Can";
        fert.dYili=2000;
        fert.isStudent=true;

        kisiler.add(fert);

        System.out.println(fert.adi+" "+fert.sAdi+" "+fert.dYili + " "+ fert.isStudent);

        for (int i = 0; i <kisiler.size() ; i++) {
            System.out.println(kisiler.get(i).adi+" "+kisiler.get(i).dYili);

        }
    }
}
