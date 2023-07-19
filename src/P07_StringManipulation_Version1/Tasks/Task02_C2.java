package P07_StringManipulation_Version1.Tasks;

import java.util.Scanner;

public class Task02_C2 {
    public static void main(String[] args) {
         /*  Task->
		 	Girilen passwordun aşagıdaki şartları sağlamasını kontrol eden coden create ediniz
		 	 a)Ilk karakteri buyuk harf olmalı
		 	 b)Son karakteri sayi olamlı
		 	 c)en az 6 karakter uzunlugunda olmalı
            // ad5hy7
		 */
        Scanner sc = new Scanner(System.in);
        System.out.println("password girişi yapınız : ");
        String password = sc.nextLine();
        boolean uygunMu = true;
        char ilkChar = password.charAt(0);
        char sonChar = password.charAt(password.length()-1);
        password = "a12345a789";
        // alttaki ifade a nın , pasword stringi içerisinde en son "a" nın indexsini verir
        // bu soruda kullanılmaz.
        // int sonIndex = password.lastIndexOf('a');

        // bir stringinin son carekterinin indexini, uzunluk-1 olarak buluruz
        int sonIndex = password.length()-1;

        // a)Ilk karakteri buyuk harf olmalı
        if (Character.isUpperCase(ilkChar)) {}
        else uygunMu=false;   // if (!Character.isUpperCase(ilkChar)) uygunMu=false;

       //  b)Son karakteri sayi olamlı
        if (!Character.isDigit(sonChar)) uygunMu=false;

        // c
        if (password.length()<6) uygunMu=false;

        if (uygunMu) System.out.println("password uygundur");
        else System.out.println("pasword uygun değildir");







    }
}
