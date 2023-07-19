package P07_StringManipulationKendimin.Tasks;

import java.util.Scanner;

public class _01_StringMethods {
    public static void main(String[] args) {
        // ekrandan bir cümle giriş yapın,
        // içerisinde bir  kelimenin olup olmadığını kotrol edin
        // ornek input : cumle="Merhaba nasılsın ali" , kelime="ali"



        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir cümle girin icinde ali var mi kontrol edeyyim  :");
        String sentence = scanner.nextLine();
        if (sentence.indexOf("ali") != -1) {
            System.out.println("cümlenin icinde ali kelimesi var");
        } else {
            System.out.println("cümlenin icinde ali kelimesi yok");
        }


// index -1 se icinde aranan index yoktur




    }
}
