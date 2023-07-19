package P05_IfStatementAndTernary.Tasks;

import java.util.Scanner;

public class C08_Ternary222 {
    public static void main(String[] args) {
        // Task -> -99 ile +99 arasinda girilen bir tamsayinin
        //  1 veya 2 basamaklı olmasını kontrol
// eden code create ediniz.

            Scanner scanner = new Scanner(System.in);
            System.out.print("Sayıyı giriniz : ");
            int sayi = scanner.nextInt();



        String sonuc = (sayi >= -10 && sayi < 10) ? "Tek Basamak":"İki basamak" ;
        System.out.println("sonuc = "+ sonuc);

        //örnek





        // Task -> girilen bir tamsayinin 1,2 veya 3 basamaklı olmasını kontrol eden code create ediniz.

        }
    }





