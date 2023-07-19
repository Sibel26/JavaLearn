package P07_StringManipulation_Version1.Tasks;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
       /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimelik  ismi
         Örn. "Haluk Bilgin Java" -> H.B.J.  şeklinde print eden code create ediniz.
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen Adınızı ve soyadınızı giriniz = "); //Haluk Bilgin Java
        String adAd2Soyad = scan.nextLine();


        /*Haluk Bilgin Java
         H : adAd2Soyad.CharAt(0);
         B : 1.boşluk karakterinin indexinin 1 fazlası
         J : Son boşluğun indexinin 1 fazlası */



  /*Haluk Bilgin Java
         H : adAd2Soyad.CharAt(0);
         B : 1.boşluk karakterinin indexinin 1 fazlası
         J : Son boşluğun indexinin 1 fazlası */
        String kisaltma=adAd2Soyad.substring(0, 1).toUpperCase().concat(".")
                .concat(adAd2Soyad.substring(adAd2Soyad.indexOf(" ") + 1, adAd2Soyad.indexOf(" ") + 2).toUpperCase()
                        .concat(".")).concat(adAd2Soyad.substring(adAd2Soyad.lastIndexOf(" ") + 1, adAd2Soyad.lastIndexOf(" ") + 2).toUpperCase()
                        .concat("."));

        System.out.println(kisaltma);

        //hocanin cozumu

        int indexBosluk1= adAd2Soyad.indexOf(" ");
        int indexBosluk2=adAd2Soyad.indexOf(" ",indexBosluk1+1);

        String str= adAd2Soyad.substring(0,1)+"."+adAd2Soyad.substring(indexBosluk1+1,indexBosluk1+2)+
                "."+adAd2Soyad.substring(indexBosluk2+1,indexBosluk2+2)+".";
        System.out.println(str);



















    }
}
