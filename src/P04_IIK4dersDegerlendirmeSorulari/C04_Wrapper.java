package P04_IIK4dersDegerlendirmeSorulari;

import java.util.Scanner;



public class C04_Wrapper {
    public static void main(String[] args) {
        // Klavyeden girilen biri int, diğeri double, iki sayıdan büyük olanını Wapper
        // class kullanarak ekrana yazdırınız
        Scanner scannern = new Scanner(System.in);
        System.out.print("bir sayı giriniz:");
        int sayi1 = scannern.nextInt();
        System.out.print("ikinci sayı`yi giriniz:");
        double sayi2 = scannern.nextInt();

        System.out.println(Double.max(sayi1,sayi2));


    }
}
