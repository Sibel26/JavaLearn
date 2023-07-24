package P10_MethodCreation01.Tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        //task-> girilen Saati saniyeye mil'i km'ye kg'yi gr'a çeviren METHOD create ediniz.


        Scanner input = new Scanner(System.in);
        System.out.print("dönüştüreceğiniz birimi giriniz : ");
        String birim = input.nextLine().toLowerCase();//saat mil kg cinsi

        System.out.print("dönüştüreceginiz birimin mikatrını giriniz : ");
        double miktar = input.nextDouble();//saat mil km miktarı
        donustur(birim, miktar);

    }//main sonu

    public static void donustur(String birim, double miktar) {
        birim = birim.toLowerCase();
        switch (birim) {
            case "saat" :
                System.out.println(miktar+" saat = " + (miktar*3600)+" saniyedir");
                break;
            case "mil":
                System.out.println(miktar+" mil = "+ (miktar*1.609)+" kmdir");
                break;
            case "kg":
                System.out.println(miktar+" KG = "+ (miktar*1000)+" gramdır");
        }
    }

    public void donustur2(String birim, double miktar) {
        birim = birim.toLowerCase();
        switch (birim) {
            case "saat" :
                System.out.println(miktar+" saat = " + (miktar*3600)+" saniyedir");
                break;
            case "mil":
                System.out.println(miktar+" mil = "+ (miktar*1.609)+" kmdir");
                break;
            case "kg":
                System.out.println(miktar+" KG = "+ (miktar*1000)+" gramdır");
        }
    }


}
