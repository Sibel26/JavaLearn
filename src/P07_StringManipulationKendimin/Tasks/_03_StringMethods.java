package P07_StringManipulationKendimin.Tasks;

import java.util.Scanner;

public class _03_StringMethods {
    public static void main(String[] args) {
        // ekrandan isim ve soy ismi tek boşluk ile okutunuz,
        // ve büyük harf kısaltma olarak yazınız
        // input "can taman"
        // output "C.T."

        Scanner scanner =new Scanner(System.in);
        System.out.print("Lütfen adinizi ve soyadinizi arasinda bir bosluk olacak sekilde giriniz  :");
        String str=scanner.nextLine().toUpperCase();
        int bos=str.indexOf(" ");
        char ad=str.toUpperCase().charAt(0);
        char soyad=str.charAt((bos+1));
        System.out.println("Adinizin ve soyadinizin ilk harfi   : "+ad+"."+soyad+".");



    }
}
