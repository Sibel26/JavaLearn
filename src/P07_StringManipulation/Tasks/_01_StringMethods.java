package P07_StringManipulation04.Tasks;

import java.util.Scanner;

public class _01_StringMethods {
    public static void main(String[] args) {
        // ekrandan bir cümle giriş yapın,
        // içerisinde bir  kelimenin olup olmadığını kotrol edin
        // ornek input : cumle="Merhaba nasılsın ali" , kelime="ali"
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cumleyi yazınız : ");
        String cumle = scanner.nextLine();
        System.out.print("Aranacak kelime : ");
        String kelime = scanner.nextLine();

        int index = cumle.indexOf(kelime);
        if (index==-1) System.out.println("aranan kelime cümle içinde bulunamadı");
        else System.out.println("aranan kelime cümle içinde mevcuttur");
        // * cozum 2.
        if(cumle.contains(kelime)) System.out.println("aranan kelime cümle içinde mevcuttur");
        else System.out.println("aranan kelime cümle içinde bulunamadı");


    }
}
