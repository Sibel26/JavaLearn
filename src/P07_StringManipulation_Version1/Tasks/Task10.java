package P07_StringManipulation_Version1.Tasks;

        import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        /* TASK :
         * Girilen  isim sadece 3 harfli olmalidir ternary/if
         * kullanarak harflerin unique(farkli) olmasını control eden code create ediniz/ mesela sinfimizda hüseyin unique essiz banka hesap numaralari, 3harfin birbiri ile essiz olmasi,kontrol edecegiz
         */
        Scanner input = new Scanner(System.in);

        System.out.print("bir metin giriniz : ");
        String isim = input.nextLine();
        //if ile
        System.out.println("   ***   if statement   ***   ");
        if (isim.length() == 3) {
            if (isim.charAt(0) == isim.charAt(1) || isim.charAt(0) == isim.charAt(2) || isim.charAt(2) == isim.charAt(1)) {
                System.out.println(isim + " Stringi ayni harf icerir");
            } else {
                System.out.println(isim + " Stringi farkli harflerden olusur");
            }
        } else {
            System.out.println("lütfen üc harfli kelime girdiginizden emin olunuz...");
        }

    }
}