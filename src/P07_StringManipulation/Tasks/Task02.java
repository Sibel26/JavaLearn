package P07_StringManipulation04.Tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*  Task->
		 	Girilen passwordun aşagıdaki şartları sağlamasını kontrol eden coden create ediniz
		 	 a)Ilk karakteri buyuk harf olmalı
		 	 b)Son karakteri sayi olamlı dijit isDigit olmali yani
		 	 c)en az 6 karakter uzunlugunda olmalı

		 */
        Scanner sc = new Scanner(System.in);
        System.out.println("password girişi yapınız : ");
        String password = sc.nextLine();

        boolean uygunMu = true;
        if(password.length()<6) uygunMu = false;

        char ch = password.charAt(password.length()-1);
        //yarim kaldi tamamla













    }
}
