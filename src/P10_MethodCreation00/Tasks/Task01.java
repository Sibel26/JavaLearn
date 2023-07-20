package P10_MethodCreation00.Tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        //task-> girilen iki sayının eşitliğini control eden METHOD create ediniz
        Scanner input = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz : ");
        int num1 = input.nextInt();

        System.out.print("2. sayıyı giriniz : ");
        int num2 = input.nextInt();


        System.out.println("iki sayinin taoplami = "+toplama(num1,num2));
        int sum=toplama(num1,num2);
        System.out.println("sum="+sum);

    }//main sonu
public static int toplama(int a,int b) {
       int toplam = a+b;
       return toplam;


}



}//class sonu
