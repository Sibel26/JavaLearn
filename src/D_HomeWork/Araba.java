package D_HomeWork;

public class Araba {

    String marka;
    String model;
    int km;
    double motorHacim;
    boolean automatic;
    boolean ikinciEl;
    int yil;
     /*
        Task-> fields: marka,model,km,motorHacim,vitesAotu,ikinciel,yıl olan
         3 obj  create ederek fields print eden code create ediniz.
         */

    @Override
    public String toString() {
        return "Araba{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", km=" + km +
                ", motorHacim=" + motorHacim +
                ", automatic=" + automatic +
                ", ikinciEl=" + ikinciEl +
                ", yil=" + yil +
                '}';
    }

    public static void main(String[] args) {
        Araba araba1 = new Araba();
        araba1.marka = "Toyota";
        araba1.model = "Corolla";
        araba1.km = 15000;
        araba1.motorHacim = 1.6;
        araba1.automatic = true;
        araba1.ikinciEl = false;
        araba1.yil = 2022;

        Araba araba2 = new Araba();
        araba2.marka = "Honda";
        araba2.model = "Civic";
        araba2.km = 25000;
        araba2.motorHacim = 1.8;
        araba2.automatic = false;
        araba2.ikinciEl = true;
        araba2.yil = 2019;

        Araba araba3 = new Araba();
        araba3.marka = "Ford";
        araba3.model = "Focus";
        araba3.km = 100000;
        araba3.motorHacim = 1.5;
        araba3.automatic = true;
        araba3.ikinciEl = true;
        araba3.yil = 2020;


        System.out.println(araba1);
        System.out.println(araba2);
        System.out.println(araba3);

    }
}