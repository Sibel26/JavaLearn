package D26_Constractor;

public class Ogretmen {
    /*
   --> Bir Ogretmen clası olusturun

   --> Classın variables larını olusturun
   isim      (String)
   tecrube   (int)    = 5;
   kidem     (int)
   brans     (String)


   --> isim , tecrübe özellikleri olan yeni bir obje üretin
   --> isim , tecrube , kıdem , brans özellikleri olan yeni bir obje üretin
   --> Ogretmenin kıdemini hesaplayan ismi kidemHesapla olan bir method yazın (Kıdem Hesabı = tecrübe*2)
       a) Tecrübeyi default deger olarak alınız
       b) Tecrübeyi 10 yıl alınız
   --> Önce objeleri yazdırın
   --> Sonra objelerin özelliklerini tek tek yazdırın


 */
    String name;
    int tecrube =5;
    int kidem;
    String brans;

    public Ogretmen(String name, int tecrube) {
        this.name = name;
        this.tecrube = tecrube;
    }
    public Ogretmen(String name, int tecrube, int kidem, String brans) {
        this.name = name;
        this.tecrube = tecrube;
        this.kidem = kidem;
        this.brans = brans;
    }


    @Override
    public String toString() {
        return "Ogretmen{" +
                "name='" + name + '\'' +
                ", tecrübe=" + tecrube +
                ", kidem=" + kidem +
                ", brans='" + brans + '\'' +
                '}';

    }

    public int kidemHesapla(int tecrube) {
        this.kidem = this.tecrube*2;
        return this.kidem;
    }

      // a) Tecrübeyi default deger olarak alınız
    public static void main(String[]args){
        Ogretmen first = new Ogretmen("Mehmet", 25);
        System.out.println(first);
        System.out.println(first.name+" "+first.tecrube+" "+first.kidem+" "+first.brans);

      //  b) Tecrübeyi 10 yıl alınız
        Ogretmen second = new Ogretmen("Ayse",10);




    }




}
