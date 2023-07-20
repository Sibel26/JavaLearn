package P10_MethodCreation;

import java.util.Scanner;

public class C01_Methods {
    public static void main(String[] args) {
       // 2 sayıyı klavyeden okutup, büyük olanını ekrana yazdırınız
        int num1 = intOku();


        int num2 = intOku();
        System.out.println(Math.max(num1,num2));
    }
    public static int intOku(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int number = scanner.nextInt();
        return number;
    }




}

