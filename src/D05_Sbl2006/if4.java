package D05_Sbl2006;

import java.util.Scanner;

public class if4 {


    public static void main(String[] args) {

        /*     str1 ve str2 isimli 2 tane String olusturulmustur.
        Eger str1, str2'ye esitse "String 1 is equal to String 2".yazdirini
        Eger str1, str2'ye esit degilse "' yazdiriniz.   */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the first text: ");
        String str1 = scan.nextLine();
        System.out.println("Please enter the second text: ");
        String str2 = scan.nextLine();

        if (str1.equals(str2)) {
            System.out.println("String 1 is equal to String 2");
        } else {
            System.out.println("String 1 is NOT equal to String 2");


        }


    }

}
