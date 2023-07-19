package P05_IfStatementAndTernary.Tasks;

import java.util.Scanner;

public class C_Ternarycalisma {

    public static void main(String[] args) {



        // Soru6) B A S İ C --> Kullanıcıdan dikdörtgenin uzunlugunu ve genişliğini alıp,
// girilen degerlere göre dikdörtgenin kare olup olmadıgını yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Uzun kenari giriniz: ");
        int uzunK = scan.nextInt();

        System.out.println("Kısa kenarı giriniz: ");
        int kısaK = scan.nextInt();

        String sonuc = uzunK == kısaK ? "Karedir." : "Kare değildir.";
        System.out.println("Girelen değerlere göre " + sonuc  );
        System.out.println();


// soru 20
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sicaklik Giriniz :");
        int heat = scan.nextInt();

        String sonucu = (heat >= 25) ? "Yüzme" : ((heat >= 15) ? "Piknik" : (heat >= 5) ? "Sinema" : "Kayak");
        System.out.println(sonuc);









    }


}
