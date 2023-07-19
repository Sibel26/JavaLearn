package P07_StringManipulation_Version1.Tasks;


import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
      /* TASK :
       Kullanıcıdan tek seferde alınan ad soyadı ifadeyi
      ad ve soyadı ayrı ayrı print eden code create ediniz    //bosluk önemli
       */

        Scanner input= new Scanner(System.in);
        System.out.print("bir ad-soyad  giriniz : ");
        String adSoyad = input.nextLine();

      String ad = adSoyad.substring(0, adSoyad.indexOf(" "));
        System.out.println(ad);
        String soyad = adSoyad.substring(adSoyad.indexOf (" ") + 1);
        System.out.println(soyad);






    }
}
