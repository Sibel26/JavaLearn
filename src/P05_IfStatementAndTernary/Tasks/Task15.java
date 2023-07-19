package P05_IfStatementAndTernary.Tasks;

import java.util.Scanner;

public class Task15 {

    public static void main(String[] args) {
        /*
          TASK -> Kullanıcının ehliyetinin varlığını kontrol ediniz.
          Ehliyeti varsa yıl tecrübesi 7 yıl ve üstü ise aldıgı mesafe 100000 km ve üzeri ise kontak anahtarını veriniz
          aksi durumda tecrübe yılı ve mesafe eksiklerini print eden code create ediniz
          tecrube yili
          ehliyeti var mi
          km kullanim
         */
        Scanner input = new Scanner(System.in);

        System.out.print("Ehliyetiniz varsa giriniz : " + "evet/hayir");
        String ehliyet = input.next();
        int yil = input.nextInt();
        int km = input.nextInt();

        if (ehliyet.equals("evet")) {
            if (yil >= 7 && km >= 100000) {
                System.out.println("Kontak anahtarinizi aliniz");
            } else if (yil >= 7 && km < 100000) {
                System.out.println("Mesafeniz yeterli degil");
            } else if (yil < 7 && km >= 100000) {
                System.out.println("Yiliniz yeterli degil");
            } else {
                System.out.println("Hem yiliniz hem de mesafeniz yeterli değil");

            }
        } else {
            System.out.println("Ehliyetiniz yoktur");


        }
    }
}




















