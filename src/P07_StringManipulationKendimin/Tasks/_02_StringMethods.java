package P07_StringManipulationKendimin.Tasks;

import java.util.Scanner;

public class _02_StringMethods {
    public static void main(String[] args) {
        // ekrandan bir string grişi yapın, içersinde "a" olupup olmadığını
        // kotrol edin varsa yazdırın ve
        // bir den fazla a varsa kaçıncı a yazdığını gözlemleyin



        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir metin girin :");
        String str=scanner.nextLine();
        if (str.indexOf("a")!=-1 ) {
            System.out.println("Metin icinde a vardir ve a harfi  "+ str.indexOf("a") + " indeksindedir");
        }
        else {
            System.out.println("Metin icinde a vardir" );
        }






    }
}
