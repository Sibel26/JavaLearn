package P07_StringManipulation_Version1.SorularCozumler;

import java.util.Scanner;

public class S01 {
    public static void main(String[] args) {
        // Ekrandan girilen bir stringin 3. karekterini büyük harf olarak yazdırın
        Scanner scanner = new Scanner(System.in);
        System.out.print("Metni yazınız  :");
        String str = scanner.next();
        // metin = selamlar
        System.out.println(str.toUpperCase().charAt(3));



    }
}
