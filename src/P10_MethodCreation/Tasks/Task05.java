package P10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task05 {
    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile

    public static void main(String[] args) {
        // task-> girilen iki sayıyı seçilen dört işleme göre hesaplayıp print eden METHOD create ediniz

        dortIslem();

        System.out.println("AGAM code cincix DEWAMKEEE :) ");

    }//main sonu

    private static void dortIslem() {
        System.out.print("1. sayıyı giriniz : ");
        double sayi1 = input.nextDouble();
        System.out.print("2. sayıyı giriniz : ");
        double sayi2 = input.nextDouble();

        System.out.print("islem seçiminizi giriniz : ");

        char islem = input.next().charAt(0);



    }


}
