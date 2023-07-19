package D05_Sbl2006;

import java.util.Scanner;

public class if3 {
    public static void main(String[] args) {

        // Ayse ve Ece kardestir ve yaslari veriliyor, kucuk kardes hangisidir,adini ve yasini yaziniz,
        //Eger ikiz iseler, "ikizdirler" yazdiriniz.

        Scanner sc = new Scanner(System.in);

        System.out.print("Ayse'nin yasini giriniz: ");
        int ayse = sc.nextInt();
        System.out.println("Ece'nin yasini giriniz: ");
        int ece = sc.nextInt();
        if (ayse < ece) {
            System.out.println("Kucuk olanin yasi= " + ayse);

        } else {
            System.out.println("Kucuk olanin yasi= " + ece);}
        if (ayse == ece) {
            System.out.println("Ikizdirler");
        }


// yanlis duzelt else asagida olacak










    }


}
