package D25_CalismalarConstractor;

public class Main {
    public static void main(String[] args) {

        TsFabrika obje = new TsFabrika();

        obje.renk= "mavi";
        obje.beden= "small";
        obje.cinsiyet= "bayan";
       // System.out.println(obje.yakalimi);
        //System.out.println(obje.yas);

        TsFabrika obje2 = new TsFabrika("Kirmizi", "Bayan");
        System.out.println(obje2);


    }



}
