package P03_ScannerClassAndTypeCasting;


import java.util.Scanner;

public class C01_ScannerClass {
    //Scanner bir Java Class'idir, bu Class'i kullanabilmek icin "import" etmek gerekir.
    //Scanner Class'i Java nin util kutuphanesindedir.

    // kullanıcıdan veri almak içinn şu adım takip edilir
    //1. adım-> Scanner class'dan obj create edilir.

    //  Scanner scan = new Scanner(System.in);// Scanner classından scan isminde değerini System içinden alan bir obj.

    //  // 2 adım->Kullanıcıdan istenen veri için bildirimde bulunulur->sout("...");
    //  System.out.print("adınızı giriniz :");

    //  // 3. adım-> kuulanıcının girdigi veri data type'ne göre bir variable atanır.
    //  String isim=scan.nextLine();// kullanıcıdan gelen String tipinde isim verisi scan obj'ni nextLine() methodu ile atandı

    //  System.out.println("isim = " + isim);
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scanLine = new Scanner(System.in);

        System.out.print("Bir sayı giriniz     : ");
        int sayi1 = scan.nextInt();
//        System.out.print("Bir sayı daha giriniz: ");
//        int sayi2 = scan.nextInt();
//        System.out.println("Büyük sayı  "+Integer.max(sayi1,sayi2)+" dır");

        System.out.print("Isminizi yazınız : "); String isim=scanLine.nextLine();

        System.out.println("İsminiz : "+isim);



        System.out.print("Isminizi tekrar yazınız : "); isim=scanLine.nextLine();
        System.out.println("İsminiz : "+isim);

    }
}
