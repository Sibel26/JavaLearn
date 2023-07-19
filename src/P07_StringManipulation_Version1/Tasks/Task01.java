package P07_StringManipulation_Version1.Tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        // Task->  Girilen  bir stringde boşluk karakterinin olup olmadığını kontrol eden code create ediniz
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir string giriniz = "); // Java ogren
        String text = scan.nextLine();
        // * cozum 1
        if (text.contains(" ")) System.out.println("boşluk vardır");
        else System.out.println("bosluk yoktur");
        // * cozum 1 b
        boolean c1=text.contains(" ");
        if (c1) System.out.println("boşluk vardır");
        else System.out.println("bosluk yoktur");


        // cozum 2
        int index = text.indexOf(' ');
        if (index != -1) System.out.println("boşluk vardır");
        else System.out.println("bosluk yoktur");

        // cozum 3
        int i1 = text.replace(" ", "").length();
        int i2 = text.length();
        if (i1 != i2) System.out.println("boşluk vardır");
        else System.out.println("bosluk yoktor");
        // ornek "ali can".length = 7
        //  "alican".length = 6


        // cozum 3a
        if (text.replace(" ", "").length() != text.length()) System.out.println("boşluk vardır");
        else System.out.println("bosluk yoktor");

        // cozum 3b
        i1 = text.replace(" ", "").length();
        i2 = text.length();
        boolean bb =( i1 != i2 );
        if (bb) System.out.println("boşluk vardır");
        else System.out.println("bosluk yoktor");


    }
}

