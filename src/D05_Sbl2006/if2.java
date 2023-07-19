package D05_Sbl2006;

import java.util.Scanner;

public class if2 {
    public static void main(String[] args) {

        //Ali ve Hasanin yaslari veriliyor, buyuk yasin adini ekrana yazdiriniz.
        Scanner sc = new Scanner(System.in);

        System.out.print("Ali'nin yasini giriniz: ");
        int ali = sc.nextInt();
        System.out.println("Hasanin yasini giriniz: ");
        int hasan = sc.nextInt();
        if (ali > hasan) {
            System.out.println("Buyuk olanin yasi= " + ali);

        } else {
            System.out.println("Ali olanin yasi= " + hasan);}


    }


}
