package P04_JavaOperatorsAndMathClass.ArithmeticOperators;

import java.util.Scanner;

public class Task_RakamlarToplami {
    public static void main(String[] args) {
        // kullanıcıdan alınan 3 basamaklı bir sayını rakamları toplamını print eden code create ediniz
        Scanner scan = new Scanner(System.in);
        System.out.print("3 basamaklı sayıyı yazınız : ");
        // % kullanırsak kalan ı verir    ,    / kullanırsak sonucu verir
        int sayi=scan.nextInt(); // 743
        int birlerBasamagi  = sayi%10;
        int onlarbasamagi   = (sayi/10)%10;
        int yuzlerBasamagi  = sayi/100;
        System.out.println("rakamlar toplamı : "+yuzlerBasamagi+onlarbasamagi+birlerBasamagi);
        System.out.println("rakamlar toplamı : "+(yuzlerBasamagi+onlarbasamagi+birlerBasamagi));


    }
}
