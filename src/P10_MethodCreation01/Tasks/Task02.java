package P10_MethodCreation01.Tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        //task-> girilen ad ve soyadın ilk harfleri buyuk diğer harflerini küçük print eden
        // METHOD create ediniz
        Scanner input = new Scanner(System.in);
        System.out.print("AGAM adını   giresin : ");
        String  ad = input.nextLine();

        System.out.print("AGAM soyadını   giresin : ");
        String  soyad = input.nextLine();

        ilkharf(ad, soyad);


    }//main sonu

    private static void ilkharf(String ad, String soyad) {
        System.out.println(ad.substring(0, 1).toUpperCase() + ad.substring(1).toLowerCase() + " "+
                soyad.substring(0, 1).toUpperCase() + soyad.substring(1).toLowerCase());


    }


}
