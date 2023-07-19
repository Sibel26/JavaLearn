package P07_StringManipulation04.Tasks;

import java.util.Scanner;

public class _02_StringMethods {
    public static void main(String[] args) {
        // ekrandan bir string grişi yapın, içersinde "a" olupup olmadığını
        // kotrol edin varsa yazdırın ve
        // bir den fazla a varsa kaçıncı a yazdığını gözlemleyin
        Scanner scanner = new Scanner(System.in);
        System.out.print("Stringi yazınız : ");
        String str = scanner.nextLine();

        int index = str.indexOf('a');
        if (index==-1) System.out.println(" 'a' harfi string içinde bulunamadı");
        else System.out.println("'a' harfi string içinde mevcuttur");

        System.out.println("index = "+index);







    }
}
