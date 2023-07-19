package P07_StringManipulation04;

import java.util.Scanner;

public class C04_Contains {
    public static void main(String[] args) {
             /*
        String iersinde istenen stringini varlığını kontrol eder boolean değer return eder..
         */

        String str = "başarı gayrete aşıktır :) javaCAN'lara selam olsun";

        System.out.println(str.contains("java"));//true
        System.out.println(str.contains("Java"));//false
        System.out.println(str.contains(" "));//true
        System.out.println(str.contains(""));//true

        String str1 = "başarı";

        System.out.println(str1.contains(str));//false
        System.out.println(str.contains(str1));//true
        System.out.println(str.contains(str));//true

        // Task-> girilen bir metinde istenen kelimenin varlığını kontrol eden code create ediniz.
        Scanner input=new Scanner(System.in);
        System.out.print("bir metin giriniz : ");
        String metin= input.nextLine();
        System.out.print("bir kelime giriniz : ");
        String  kelime=input.nextLine();


        System.out.println(metin.contains(kelime) ? "girilen metinde istenen kelime mevcut" : "girilen metinde istenen kelime mevcut değil");


    }


}
