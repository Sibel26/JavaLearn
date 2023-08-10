package D27_ConsMentöring;

public class HayvanSahipleriRunner {

    public static void main(String[] args) {
        Hayvanlar h1 = new Hayvanlar("kedi", 23, "pamuk");
        h1.isim = "boncuk";
        System.out.println(h1);

        Kisiler k1 = new Kisiler("ayşe", 11, "yozgat", new Hayvanlar("kopek", 34, "karabas"));
        Kisiler k = new Kisiler();
        Hayvanlar h2 = new Hayvanlar();
        k1.adi = "ayşe";
        k1.il = "yozgat";
        k1.yas = 11;
        k1.hayvan.tur = "ss";
        k1.hayvan.isim = "koc";
        k1.hayvan.hyvnId = 23;
        System.out.println(k1);


    }
}