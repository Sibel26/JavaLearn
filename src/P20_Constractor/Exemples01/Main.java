package P20_Constractor.Exemples01;

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
        fert.adress.zipCode="2320";

        kisiler.add(fert);

        System.out.println(fert.adi+" "+fert.sAdi+" "+fert.dYili + " "+ fert.isStudent);

        for (int i = 0; i <kisiler.size() ; i++) {
            System.out.println(kisiler.get(i).adi+" "+kisiler.get(i).dYili);

        }
        Kisi fert2;
        Adres adr = new Adres("haskjfh","kadhf","2");
        fert  = new Kisi("Kamil"," Tas", 1990,false,new Adres("","",""));
        fert2 = new Kisi("salih"," Tas", 1998,false,adr);

    }
}
