package D26_Constractor;

import java.util.ArrayList;

public class AnaClasss {

        int patId;
        String patName;
        String patSpecies;//hayvancinsi demek patSpecies

    public AnaClasss(int patId, String patName, String patSpecies) {
        this.patId = patId;
        this.patName = patName;
        this.patSpecies = patSpecies;
    }

    public AnaClasss() {

    }

    public AnaClasss(int patId) {
        this.patId = patId;
    }

    public static void main (String[] args) {
        AnaClasss pat = new AnaClasss(20,"Tom","Cat");
        //5 adet veri girelim,yeni obje tanimlamadan,bu verileri arrayListe aktaralim
        //Tablo seklinde arrayListi yazdiralim







    }




    }

