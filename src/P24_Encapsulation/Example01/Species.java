package P24_Encapsulation.Example01;

public class Species{
    // rengi, kilosu, evcil mi ? -> string, double ve boolean olacak
    private String rengi ;
    private double kilosu;
    private boolean evcilMi;

    public Species() {
    }

    public Species(String rengi, double kilosu, boolean evcilMi) {
        this.rengi = rengi;
        this.kilosu = kilosu;
        this.evcilMi = evcilMi;
    }

    public String getRengi() {
        return rengi;
    }

    public void setRengi(String rengi) {
        this.rengi = rengi;
    }

    public double getKilosu() {
        return kilosu;
    }

    public void setKilosu(double kilosu) {
        this.kilosu = kilosu;
    }

    public boolean isEvcilMi() {
        return evcilMi;
    }

    public void setEvcilMi(boolean evcilMi) {
        this.evcilMi = evcilMi;
    }

    @Override
    public String toString() {
        return "Species{" +
                "rengi='" + rengi + '\'' +
                ", kilosu=" + kilosu +
                ", evcilMi=" + evcilMi +
                '}';
    }
}
