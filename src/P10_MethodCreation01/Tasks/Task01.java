package P10_MethodCreation01.Tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        //task-> girilen iki sayının eşitliğini control eden METHOD create ediniz
        Scanner input = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz : ");
        int num1 = input.nextInt();

        System.out.print("2. sayıyı giriniz : ");
        int num2 = input.nextInt();

        esitmi (num1, num2);


    }//main sonu

    private static void esitmi(int num1, int num2) {
        System.out.println(num1==num2);
    }


}//class sonu
