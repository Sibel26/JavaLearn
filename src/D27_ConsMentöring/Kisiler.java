package D27_ConsMentöring;

public class Kisiler {
    String adi;
    int yas;
    String il;
    Hayvanlar hayvan;

    public Kisiler() {
    }

    public Kisiler(String adi, int yas, String il, Hayvanlar hayvan) {
        this.adi = adi;
        this.yas = yas;
        this.il = il;
        this.hayvan = hayvan;
    }

    @Override
    public String toString() {
        return "Kisiler{" +
                "adi='" + adi + '\'' +
                ", yas=" + yas +
                ", il='" + il + '\'' +
                ", hayvan=" + hayvan +
                '}';


    }

}
