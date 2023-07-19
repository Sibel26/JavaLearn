package P05_IfStatementAndTernary.Tasks;


import java.util.Scanner;

public class _03_if_statement3 {

    public static void main(String[] args) {

    /*    str1 ve str2 isimli 2 tane String oluşturulmuştur.
          Eğer str1, str2'ye eşit ise "String 1 is equal to String 2" yazdırınız.
          Eğer str1, str2'ye eşit değil ise "String 1 is NOT equal to String 2" yazdırınız. */

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the first text : ");
        String str1 = scan.nextLine();
        System.out.print("Please enter the second text: ");
        String str2 = scan.nextLine();

        //Kodu aşağıya yazınız.
        //   hasan , Hasan
        if (str1.equals(str2)) {
            System.out.println("String 1 is equal to String 2");
        }else {
            System.out.println("String 1 is NOT equal to String 2");
        }

        // eşit değilse ile çözelim
        if (!str1.equals(str2)) {
            System.out.println("String 1 is NOT equal to String 2");
        }else {
            System.out.println("String 1 is equal to String 2");
        }


// ternary cozumu
        String sonuc = (str1.equals(str2)) ? "String 1 is equal to String 2" : "String 1 is NOT equal to String 2";
        System.out.println(sonuc);


    }
}
