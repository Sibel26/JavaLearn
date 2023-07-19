package P05_IfStatementAndTernary.Tasks;

import java.util.Scanner;

public class _04_if_else_if_statement4 {

    public static void main(String[] args) {

     /* double1 ve double2 isimli iki tane double oluşturulmuştur.
        Eğer double1, double2'dan büyük ise "double 1 is greater than double 2" yazdırınız.
        Eğer double1, double2'dan küçük ise "double 1 is smaller than double 2" yazdırınız. */

        Scanner scan = new Scanner(System.in);
        System.out.print("Birinci sayı ? :");
        double number1 = scan.nextDouble();
        System.out.print("İkinci  sayı ? :");
        double number2 = scan.nextDouble();

        //Kodu aşağıya yazınız.

        if (number1 > number2) {
            System.out.println("double 1 is greater than double 2");
        } else if (number1 < number2) {
            System.out.println("double 1 is smaller than double 2");
        }
// ternary cozumu
        String sonuc = (number1 > number2) ? "double 1 is greater than double 2" : "double 1 is smaller than double 2";
        System.out.println(sonuc);

        // esitlik durumundaki cozum
        String sonuc2 = (number1 > number2) ? "double 1 is greater than double 2" : (number1 == number2) ? "esittir" : "kucuktur";
        System.out.println(sonuc2);
        //esit degildir old icin kucuktur yazdik


    }
}
