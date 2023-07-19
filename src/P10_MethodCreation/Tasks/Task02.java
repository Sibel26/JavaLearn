package P10_MethodCreation.Tasks;

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
        System.out.println(ilkHarfBuyuk(ad)+" "+ ilkHarfBuyuk(soyad));

        System.out.println(ilkHarfBuyuk("ayse"));

    }//main sonu  // ilk harfi büyük yazan formül asagida
        public static String ilkHarfBuyuk (String a){ //a = ad

        String str = " ";
        str=a.substring(0,1).toUpperCase()+a.substring(1).toLowerCase();
        return str;
}


}
