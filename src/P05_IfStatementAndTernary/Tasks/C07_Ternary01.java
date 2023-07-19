package P05_IfStatementAndTernary.Tasks;

import java.util.Scanner;

public class C07_Ternary01 {
    /*
      Ternary ile yapılan tum actionlar if-else blok ile de yapılabilır.
      Ternary blok code daha clean daha okunabilir ve anlaşılabilir olması için tercih edilir
      Ternary blok içinde complex code yerine daha basic ve doğrudan sonuç üreten code'lar bulunur
      Ternary bir geri dönüş tipine sahiptir.
       */
    public static void main(String[] args) {
        // sonuc = (şart) ?  true ise : false ise ;
        // condition(şart)  ?(if-ise) şart true olunca yapılacak action    :   (else-değilse) şart false olunca yapılacak action
        Scanner scanner = new Scanner(System.in);
        int sayi1 = scanner.nextInt();
        // sayı tek mi çift mi ? bulalım
//         if (sayi1%2==0) System.out.println("sayı çifttir");
//         else System.out.println("sayı tektir");
        String sonuc = sayi1 % 2 == 0 ? "sayı çifttir" : "sayı tektir";
        System.out.println(sonuc);


        // soru 2: sayi 1 sıfırdan büyükse ekrana 1 , değilse -1 yazdırın.
        int sonuc2;
        sonuc2 = sayi1 > 0 ? 1 : -1;
        if (sayi1 > 0) sonuc2 = 1;
        else sonuc2 = -1; // ustekinin tıpatıp aynısı
        System.out.println(sonuc2);


        // soru 3
        System.out.print("Bir sayi daha giriniz : ");
        int sayi2 = scanner.nextInt();
        // sayi1 ve sayi2 den küçük olanını ekrana yazdırın

        System.out.println("kucuk sayı = " + (sayi1 < sayi2 ? sayi1 : sayi2));


        // soru 4 : 3 sayıdan küçük olanı tek ternery içinde bulunuz
        System.out.print("Bir sayi daha giriniz : ");
        int sayi3 = scanner.nextInt();
        // soru4 cozum 1 :
        int sonuc3 = sayi1 < sayi2 ? (sayi1 < sayi3 ? sayi1 : sayi3) : (sayi2 < sayi3 ? sayi2 : sayi3);
        System.out.println("en kucuk = " + sonuc3);

        //  cozum 2 :
        //sonuc3 = sayi1 < sayi2? (sayi1 veya sayi3 enkucuktur) : (sayi2 veya sayi3 enkucuktur);
        sonuc3 = sayi1 < sayi2 ? (Math.min(sayi1, sayi3)) : (Math.min(sayi2, sayi3));
        System.out.println("en kucuk = " + sonuc3);

        //  cozum 3 :
        sonuc3 = Math.min(Math.min(sayi1, sayi3), sayi2);
        System.out.println("cozum3 : en kucuk = " + sonuc3);

        //  cozum 4 :
        sonuc3 = Math.min(sayi1 < sayi3 ? sayi1 : sayi3, sayi2);
        System.out.println("cozum4 : en kucuk = " + sonuc3);




    }
}

















