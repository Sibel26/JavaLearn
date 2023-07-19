package P07_StringManipulation04.Tasks;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {

        //Task->  Girilen  String'deki space haric kac tane character kullanildigini print eden code create ediniz.
        Scanner input = new Scanner(System.in);

        System.out.print("bir metin   giriniz : ");
        String metin = input.nextLine();// javacanlara selam olsun güzel insanlar :)

        System.out.println("metin.length() = " + metin.length());
       System.out.println(metin.replaceAll("\\s", "").length());

       String str="mer ha ba kar deş";

    }
}
