package D03_ScannenClass;


import java.util.Scanner;

public class ScannerClass_01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.print("Bir sayi giriniz: ");
        int sayi1 = scan.nextInt();
        System.out.print("Bir sayi giriniz: ");
        int sayi2 = scan.nextInt();
        System.out.println("Büyük sayi "+Integer.max(sayi1,sayi2));
        System.out.println("Isminizi yaziniz : "); String isim=scan.next();
        isim=scan.nextLine();
        System.out.println("Isminiz : "+isim);

        System.out.println("Isminizi tekrar yaziniz : "); String isim2=scan.nextLine();
        System.out.println("Isminizi : "+isim2);























    }
















}
