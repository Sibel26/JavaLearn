package P07_StringManipulation04.SorularCozumler;

public class S03 {
    public static void main(String[] args) {
        // isim ve soy isim veriliyor baş harflerini büyük harf yapalım
        // hasan can
        // bosluk ındeksi 5,
        // H+boşluk dahil ekle+soy isim başlangıç harfini bul buyut+ kalanı kucult ve ekle

        String str = "şalış çalım";

        // bolum 1 : boşluk indeksini bul
        int i = str.indexOf(' ');

        // ilk harfi buyuk olarak al
        String isimIlkHarf = str.substring(0,1).toUpperCase();// "H"
        String isimGeriKalan=str.substring(1,i+1).toLowerCase(); // kucult // "asan "
        String soyIsimIlkHarf=str.substring(i+1,i+2).toUpperCase(); // buyut "C"
        String soyIsimGeriyeKalan=str.substring(i+2).toLowerCase(); // kucult "an"

        str = isimIlkHarf+isimGeriKalan+soyIsimIlkHarf+soyIsimGeriyeKalan;
        // str="H"+"asan "+"C"+"an"; Hasan Can
        System.out.println(str);

    }
}
