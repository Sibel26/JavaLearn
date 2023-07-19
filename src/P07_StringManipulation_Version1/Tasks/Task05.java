package P07_StringManipulation_Version1.Tasks;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
             /* Task->
        Girilen ad soyad bilgilerinin ilk harflerini buyuk harf print eden code create ediniz..
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("1 adınızı giriniz : ");
        String ilkAd = sc.nextLine();

        System.out.print("2 adınızı giriniz : ");
        String ikinciAd = sc.nextLine();

        System.out.print("soyadınızı giriniz : ");
        String soyad = sc.nextLine();

        ilkAd = ilkAd.substring(0,1).toUpperCase()+ilkAd.substring(1).toLowerCase();






    }
}
