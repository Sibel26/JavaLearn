package D09_Loops;

import java.util.Scanner;

public class Loops9For {

    public static void main(String[] args) {

        String str = "Selamlar";

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir string giriniz: ");
        String str1 = scan.nextLine();

        for (int i = str1.length()-1; i >= 0; i--) {

            System.out.print(str1.charAt(i));



        }

    }





}
