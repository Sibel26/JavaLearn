package P07_StringManipulation_Version1.Tasks;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {

        /*
         Task->
         Girilen iki kelimeden ilki çift sayıda karakter içeriyorsa 2. kelimeyi 1. kelimenin ortasına print eden
         ilk kelime tek sayıda karakter içeriyorsa "kelime2 kelime1 eklenemez" print eden code create ediniz
         kelime1= Java
         kelime2= haluk
         Print ==> Ja+haluk+va
         */
        Scanner sc =new Scanner(System.in);
        System.out.print("1.kelimeyi giriniz : ");
        String  kelime1 = sc.nextLine();
        System.out.print("2.kelimeyi giriniz : ");
        String  kelime2 = sc.nextLine();
        if (kelime1.length() %2 == 0) {
            // kelime 2 yi bunun arasına yerleştir
            int orta = kelime1.length()/2;
            kelime1 = kelime1.substring(0,orta)+kelime2+kelime1.substring(orta);
            System.out.println(kelime1);
        } else {
            System.out.println("kelime2 kelime1 eklenemez");
        }

















    }
}
