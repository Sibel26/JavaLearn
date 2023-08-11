package P20_Constractor.Exemples01;

public class Kisi {
    String adi;
    String sAdi;
    int dYili;
    boolean isStudent;
    Adres adress;

    public Kisi(String adi, String sAdi, int dYili, boolean isStudent) {
        this.adi = adi;
        this.sAdi = sAdi;
        this.dYili = dYili;
        this.isStudent = isStudent;
    }

    public Kisi(String adi, String sAdi, int dYili, boolean isStudent, Adres adress) {
        this.adi = adi;
        this.sAdi = sAdi;
        this.dYili = dYili;
        this.isStudent = isStudent;
        this.adress = adress;
    }


    public Kisi() {

    }
}
