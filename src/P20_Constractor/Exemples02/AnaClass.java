package P20_Constractor.Exemples02;

import java.util.ArrayList;

public class AnaClass {
    public static void main(String[] args) {
        Adress adres= new Adress("a caddesi","b bolgesi",2323,34);
        Pats evcilH   = new Pats(20,"twity","bird");
        Kisi fert = new Kisi("Hasan",adres,evcilH);
        // hasanın hayvanın adını yazdırın
        System.out.println(fert.patler.patName);

        // ferdin avenue yazdıralım
        System.out.println(fert.adrs.avenue);

        Kisi feet2 = new Kisi("Mehmet",
                new Adress("a2 cad","a2 bolg",101,65),
                new Pats(30,"canvar","dog"));
        patList();
    }

    private static void patList() {
         /* - 5 adet veri girelim, yeni obje tanımlamadan
          - bu verileri arrayListe aktaralım
          - tablo şeklinde arraylisti yazdıralım
        */
        ArrayList<Pats> arrayList = new ArrayList<>();
        Pats pat = new Pats(20,"tom","cat");arrayList.add(pat);
        pat = new Pats(21,"tom","cat");         arrayList.add(pat);
        pat = new Pats(22,"jery","dog");        arrayList.add(pat);
        pat = new Pats(23,"tomdur","bird");     arrayList.add(pat);
        pat = new Pats(24,"tombalak","cat");    arrayList.add(pat);
        for (int i = 0; i <arrayList.size() ; i++) {
            System.out.printf("%4d%10s%10s%n",arrayList.get(i).patId,arrayList.get(i).patName,arrayList.get(i).patSpecies);
        }
        System.out.println("----static olmayan metotlar a ulaşım-----");
        for (int i = 0; i < arrayList.size() ; i++) {
            pat.voice(arrayList.get(i).patSpecies);
        }

        System.out.println("--------- statik metotları kullanalım");
        Pats.voice2(pat.patSpecies);

        System.out.println(pat.toString());
    }
}
