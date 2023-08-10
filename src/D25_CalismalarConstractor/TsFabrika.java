package D25_CalismalarConstractor;

public class TsFabrika {
    String renk;
    String beden;
    String cinsiyet;
    int yas;
    boolean yakalimi;
    boolean resimlimi;

    public TsFabrika() {

    }

    public TsFabrika(String renk, String beden, String cinsiyet, int yas, boolean yakalimi, boolean resimlimi) {
        this.renk = renk;
        this.beden = beden;
        this.cinsiyet = cinsiyet;
        this.yas = yas;
        this.yakalimi = yakalimi;
        this.resimlimi = resimlimi;
    }

    public TsFabrika(String renk, String cinsiyet) {
        this.renk = renk;
        this.cinsiyet = cinsiyet;
    }

    @Override
    public String toString() {
        return "TsFabrika{" +
                "renk='" + renk + '\'' +
                ", beden='" + beden + '\'' +
                ", cinsiyet='" + cinsiyet + '\'' +
                ", yas=" + yas +
                ", yakalimi=" + yakalimi +
                ", resimlimi=" + resimlimi +
                '}';
    }
}
