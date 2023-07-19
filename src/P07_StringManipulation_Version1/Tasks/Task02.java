package P07_StringManipulation_Version1.Tasks;

import java.util.Scanner;

public class Task02 {
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
        if (password.length()<6) uygunMu = false;
        char ch =password.charAt(password.length()-1);
        if (!Character.isDigit(ch)) uygunMu=false;
        // isDigit sorusu char ın rakam olup olmadığını kontrol ediyor

        ch = password.charAt(0);
        if(!Character.isUpperCase(ch)) uygunMu=false;
        //veya  ilk a olsun ,  A.equals("a") false
        //      ilk A olsun ,  A.equals("A") true

        String ilkHarf =password.substring(0,1);
        if (!ilkHarf.toUpperCase().equals(ilkHarf) ) System.out.println("password uygundur");
        else System.out.println("pasword uygun değildir");


        if (uygunMu) System.out.println("password uygundur");
        else System.out.println("pasword uygun değildir");





    }
}
