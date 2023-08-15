package D_HomeWork;

public class Yonetici {


    Personel personel;
    String egitimDurumu;
    String medeniHali;

    public Yonetici() {
    }

    public Yonetici(Personel personel, String egitimDurumu, String medeniHali) {
        this.personel = personel;
        this.egitimDurumu = egitimDurumu;
        this.medeniHali = medeniHali;
    }
}
