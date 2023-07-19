package P05_IfStatementAndTernary.Tasks;

import java.util.Scanner;

public class _07_if_else_if_statement7 {

    public static void main(String[] args) {

 /*  Altta int number klavyeden girilerek oluşturulmuştur.
     Eğer, int number ikiye bölündüğünde geri kalanı 0'a eşit ise "number is a EVEN number" yazdırın.
     Eğer, int number ikiye bölündüğünde geri kalanı 0'a eşit değil ise "number is a ODD number" yazdırın.
*/
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        //Kodu aşağıya yazınız.

        if (number%2 == 0) {
            System.out.println("number is a EVEN number");
        }else {
            System.out.println("number is a ODD number");
        }


        // çözüm 2
        if (number%2 == 1) {
            System.out.println("number is a ODD number");
        }else {
            System.out.println("number is a EVEN number");
        }

        // cozum 3, eşit değil
        if (number%2 != 0) {
            System.out.println("number is a ODD number");
        }else {
            System.out.println("number is a EVEN number");
        }
        //çözüm 4
        // bir sayıyı int olarak 2 ye bölüp sonra 2 ile çarğınca kendine eşitse çift sayıdır
        if (number/2*2 == number) {
            System.out.println("number is a EVEN number");
        }else {
            System.out.println("number is a ODD number");
        }
//Ternary cozumu
        String sonuc = (number%2 == 0) ? "number is a EVEN number" :  "number is a ODD number";
        System.out.println(sonuc);




    }
}
