package P05_IfStatementAndTernary.Tasks;

import java.util.Scanner; //task 15

public class örnek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ehliyetiniz varsa giriniz : E||H");
        String ehliyet = scan.nextLine();
        int yil = scan.nextInt();
        System.out.println("Tecrübeniz kac sene?");
        int tecrube = scan.nextInt();
        System.out.print("Aldiginiz mesafeyi giriniz ");
        int km = scan.nextInt();
        if (ehliyet.equals("E")) {
            if (yil >= 7 && km >=100000 ) {
                System.out.println("Kontak anahtarinizi aliniz");
            }else if (yil >= 7 && km <100000) {
                System.out.println("Mesafeniz yeterli degil");
            }else if (yil < 7 && km >=100000) {
                System.out.println("Yiliniz yeterli degil");
            }else {
                System.out.println("Hem yiliniz hem de mesafeniz yeterli değil");
            }
        }else if (ehliyet.equals("E") ) {
            System.out.println("Hem yiliniz hem de mesafeniz yeterli değil");
        }else {
            System.out.println("Tekrar deneyiniz");
        }




    }
}
