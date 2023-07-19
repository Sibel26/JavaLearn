package P05_IfStatementAndTernary.Tasks.j07_TernaryKonusu;

import java.util.Scanner;

public class C01_Example {
    public static void main(String[] args) {


    /*Task->
		 Kullanicidan bir character alin.
		 Bu character buyuk harf ise "Buyuk Harf"
		 Bu character kucuk harf ise "Kucuk Harf"
		 Bu character harf degil ise "Harf Degil"  print eden code create ediniz.
		*/


        Scanner scan = new Scanner(System.in);

        System.out.print("Bir character giriniz: ");
        char ch = scan.next().charAt(0);

        String result = (ch >= 'A' && ch <= 'Z') ? "Büyük harf" : ((ch >= 'a' && ch <= 'z') ? "Kücük harf" : "Harf Değil");
        System.out.println(result);


    }

}
