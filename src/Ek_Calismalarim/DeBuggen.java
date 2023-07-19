package Ek_Calismalarim;

import java.util.Scanner;

public class DeBuggen {
    public static void main(String[] args) {
        // Task 1 : 1 den n kadar sayilarin toplamini bulunuz n dahil
        //Debuggin deneyelim

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir n degeri giriniz: ");
        int sayac = scanner.nextInt();

        int toplam = 0;

        for (int i = 1; i < sayac; i++) {
            toplam +=i;
            System.out.println("i degeri == "+1);
        }
        System.out.println(toplam);











    }



}
