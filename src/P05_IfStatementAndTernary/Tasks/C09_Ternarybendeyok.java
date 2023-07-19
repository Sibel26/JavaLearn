package P05_IfStatementAndTernary.Tasks;

import java.util.Scanner;

public class C09_Ternarybendeyok {
    public static void main(String[] args) {

// Task-> girilen bir tamsayının ciftse yarısını , tek ise iki katını print eden code
// yazınız (ternary ile yapılacak)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayıyı giriniz : ");

        int sayi = scanner.nextInt();

        int sonuc2 = (sayi % 2 == 0) ? (sayi / 2) : (sayi * 2);

        //2.yol
        System.out.println(sonuc2);
        int sonuc = sayi % 2 == 0? (sayi / 2) : (sayi*2);
                System.out.println("sonuc = "+sonuc);

                // Task : girilen bir tamsayının ciftse yarısını, tek ise "tek sayi bölunmez yazdiriniz
        String sonuc3   = sayi%2==0 ? "Sonuc= "+(sayi/2) : "tek sayı bölünmez ";
        Object sonuc4   = (sayi % 2 == 0) ? (sayi / 2) :"tek sayı bölünmez ";











    }






}
