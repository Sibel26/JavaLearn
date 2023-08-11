package P20_Constractor.Exemples02;

import java.util.ArrayList;

public class Adress {
    // avenue , district , zipCode , doreNumber
    String avenue;
    String district;
    int zipCode;
    int doreNumber;

    public Adress(String avenue, String district, int zipCode, int doreNumber) {
        this.avenue = avenue;
        this.district = district;
        this.zipCode = zipCode;
        this.doreNumber = doreNumber;
    }

    public static void main(String[] args) {
        Adress adr1 = new Adress("MarinKalli","Saunalahti",02223,29);
        Adress adr2 = new Adress("Portti","Lajalahti",02123,15);
        ArrayList<Adress> liste = new ArrayList<>();
        liste.add(adr1);
        liste.add(adr2);
        for (int i = 0; i <liste.size() ; i++) {
            System.out.printf("%15s%15s%5d%5d\n",liste.get(i).avenue,liste.get(i).district,
                    liste.get(i).zipCode,liste.get(i).doreNumber);
        }

    }
}
