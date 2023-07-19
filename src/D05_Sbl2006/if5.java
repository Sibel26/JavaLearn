package D05_Sbl2006;

import java.util.Scanner;

public class if5 {
    public static void main(String[] args) {

        /*  Altta int number klavyeden girilerek oluşturulmuştur.
     Eğer, int number ikiye bölündüğünde geri kalanı 0'a eşit ise "number is a EVEN number" yazdırın.
     Eğer, int number ikiye bölündüğünde geri kalanı 0'a eşit değil ise "number is a ODD number" yazdırın.
*/
        //Kodu aşağıya yazınız.


        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        if (number % 2 == 0) {
            System.out.println("number is a EVEN number");
        } else {
            System.out.println("number is a ODD number");

        }






    }


}
