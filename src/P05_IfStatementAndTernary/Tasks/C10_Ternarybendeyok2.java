package P05_IfStatementAndTernary.Tasks;

import java.util.Scanner;

public class C10_Ternarybendeyok2 {
    public static void main(String[] args) {
        /*
  TASK :
  Girilen bir pozitif tamsayı  4 basamaklı ise  "4 Basamaklı"
  degilse çift olup olmadigini kontrol edip. Çift ise "4 basamaklı olmayan çift sayı"
  degilse "4 basamaklı olmayan tek sayı"  print eden code create ediniz.
   */


        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz :");
        int sayi = input.nextInt();

        //if ( sayi>= 1000 ve sayi< 10000) yaz "4 basamakli " VEYA (sayi+"").length == 4
        // else if ( cift) "4 basamaklı olmayan çift sayı"
        //  else yaz "4 basamaklı olmayan tek sayi"

        String sonuc= (sayi>=1000 && sayi<=9999)? "4 Basamaklı" :
                (sayi%2==0)? "4 basamaklı olmayan çift sayı" :
                        "4 basamaklı olmayan tek sayı";

        System.out.println(sonuc);
//Halime h sonucu
        String sonuc1=Integer.toString(sayi).length()==4?"4 basamakli":sayi%2==0?"4 basamakli olmayan cift sayi" : "4 basamaklı olmayan tek sayı";
        System.out.println(sonuc1);

    }
}
