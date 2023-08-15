package D_HomeWork;

public class Personel {
    // Adres : mahallet, cadde,no
    // Personel : adres, name, bolum,maas
    // Yonetici : personel , eğitimDurumu, medeniHali
    // oluşturun, veri atayın,print edin


        Adres adres;
        String name;
        String bolum;
        int maas;

    public Personel() {
    }

    public Personel(Adres adres, String name, String bolum, int maas) {
        this.adres = adres;
        this.name = name;
        this.bolum = bolum;
        this.maas = maas;
    }

    @Override
    public String toString() {
        return "Personel{" +
                "adres=" + adres +
                ", name='" + name + '\'' +
                ", bolum='" + bolum + '\'' +
                ", maas=" + maas +
                '}';
    }
}

