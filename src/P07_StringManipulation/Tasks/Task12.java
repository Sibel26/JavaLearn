package P07_StringManipulation04.Tasks;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
       /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimelik  ismi
         Örn. "Haluk Bilgin Java" -> H.B.J.  şeklinde print eden code create ediniz.
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen Adınızı ve soyadınızı giriniz = "); //Ahmet Emin Yilmaz
        String adAd2Soyad = scan.nextLine();


        /*Haluk Bilgin Java
         H : adAd2Soyad.CharAt(0);
         B : 1.boşluk karakterinin indexinin 1 fazlası
         J : Son boşluğun indexinin 1 fazlası */


    }
}
