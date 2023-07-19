package P04_IIK4dersDegerlendirmeSorulari;

public class C01_Prints {
    public static void main(String[] args) {

        int sayi=11;
        System.out.println("sonuc = "+sayi+sayi);               // SOru 1 :
        System.out.println(sayi*sayi);                          // SOru 2 :
        System.out.println(true && false|| true);               // SOru 3 :
        System.out.println(!true||false);                       // SOru 4 :
        System.out.println((sayi==11) && (sayi>11) || sayi<11); // SOru 5 :
        System.out.println((true) && (false) || false); // SOru 5 :



        sayi = 11 ;
        char ch='A'; // 'A' nın ASII karşılığı 65 dir)
        System.out.println(ch);                                 // Soru 6 :
        System.out.println(ch+1);                               // Soru 7 :
        // char matematiksel işleme girerse sayısal karşılığa döner
        System.out.println(" 8 . soru");
        System.out.println((char) (ch+2));                      // Soru 8 :

        double dd = sayi;
        System.out.println("dd = " + dd);                       // Soru 9 :

        byte bb = (byte) sayi;
        System.out.println("bb = " + bb);                       // Soru 10 :

        /*
        Aşağıdaki işlemin sonucunda ekran ne yazar */
        int x=0;

        int sonuc = x++ + ++x + x;

        System.out.println("sonuc = " + sonuc);                 // Soru 11 :
        System.out.println("x = " + x);                         // Soru 12 :
        System.out.println("--- 13. soru ---");
        String str = 7*5+" gün";                                // Soru 13 :
        System.out.println("str = " + str);                 //35 gun
        str = " gün"+7*5;
        System.out.println("str = " + str);                 // gun35
        str = " gün"+7+5;                                   // gun75
        //str = " gün"+7-5;
        str = " gün"+7+(-5);                            // gun7-5
        System.out.println(str);
        str = 7+5+" gun";                                   // 12 gun

        System.out.println(11.0+2); // 13.0

        System.out.println("str = " + str);

        int ss=10; ss += 5; ss--; ss /= 7; ss *= 2; ss -= 4;    // Soru 14 :
        System.out.println("ss = " + ss);






        // örnekler
        System.out.println("ornekler");
        System.out.println((char) 99);  // c
        x=0;

        sonuc = x + ++x + ++x + ++x + x++;

        System.out.println("sonuc = " + sonuc);                 // Soru 11 :
        System.out.println("x = " + x);

        // exercise ihtiyacı
        // char 6-7-8
        // arttırma  11-12
        // string birleştirme 13
    }
}
