package P05_IfStatementAndTernary.Tasks;

import java.util.Scanner;

public class _06_if_else_if_statement6 {

    public static void main(String[] args) {

        /*      Altta int number klavyeden girilerek oluşturulmuştur.
                Eğer int number 0 yazdırılırsa "Im neutral",
                Eğer int number 0'dan büyükse "I m positive",
                Eğer int number 0'dan küçükse "I am negative" yazdırılsın.   */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayı giriniz:"); // her zaman sout yazmayabilir bu durumlarda biz ekleriz
        int number = scan.nextInt();

        //Kodu aşağıya yazınız.

        if (number == 0) {
            System.out.println("Im neutral");
        } else if (number > 0) {
            System.out.println("I m positive");

        } else {
            System.out.println("I am negative");
        }
// Ternary cozumu

       String sonuc = (number == 0) ? "Im neutral": (number > 0)? "I m positive":"I am negative";
        System.out.println(sonuc);
    }
}
