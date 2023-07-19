package sibel2_19;

import java.util.Scanner;

public class sisi {
    public static void main(String[] args) {
        int x=0;
        int sonuc= x++ + ++x + x;
        System.out.println("sonuc = " + sonuc);
        System.out.println("x = " + x);

        String str = 7*5+"gün";
        System.out.println("str = " + str);


        // 1. Ekrana, "Java" can'dır , gerisi "heyecandır" yazdırın
// 2. her satıra 1 kelime gelecek ve her satır bir öncekinden bir tap ileriden
// başlayacak şekilde yazdırın, "Java" can'dır , gerisi "heyecandır" yazdırın
// her soru için bir kez "System.out.println" kullanılacak
//  "Java"
//      can'dır ,
//          gerisi
//              "heyecandır"


        System.out.println(  "\" Java \"  can'dır , gerisi \" heyecandir = \"");


        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci sayiyi giriniz: ");
        int sayi1 = scanner.nextInt();
        System.out.println("Ikinci sayiyi giriniz");
        int sayi2 = scanner.nextInt();
        System.out.println("Sonuc = " + (sayi1 * sayi2));


        Scanner scan = new Scanner(System.in);
        System.out.print("Birinci sayiyi giriniz: ");
        int a = scan.nextInt();

        System.out.print("Birinci sayiyi giriniz: ");
        double b = scan.nextDouble();

        double c = a;
        System.out.println("Sonuc: " + Double.max(b,c));


        // verilen 3 double sayıdan büyük olanını, diğer ikisinin toplamından buyuk ise
// ekran true, aksi halde ekrana false yazdırın

        double d  = 10;
        double e  = 15;
        double g  = 26;

        double max = Math.max(d,e);
        double max1 = Math.max(max,g);
        double toplam =   (d + e + g - max1);

        boolean ekran = max1 > toplam;
        System.out.println(ekran);









    }
}
