package D08_Substring;
import java.util.Scanner;
public class D08_Substring {

    public static void main(String[] args) {

// isim ve soy isim veriliyor baş harflerini büyük harf yapalım
// hasan can
// bosluk ındeksi 5,
// H+boşluk dahil ekle+soy isim başlangıç harfini bul buyut+ kalanı kucult ve ekle


        String fullName = "hasan can";
        int bosluk = fullName.indexOf(" "); // Boşluk indeksini bulma

        String firstName = fullName.substring(0, bosluk); // İsim kısmını alma
        String lastName = fullName.substring(bosluk + 1); // Soyisim kısmını alma












    }






}
