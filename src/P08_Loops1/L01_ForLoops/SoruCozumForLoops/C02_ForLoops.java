package P08_Loops1.L01_ForLoops.SoruCozumForLoops;

import java.util.Scanner;

public class C02_ForLoops {
    public static void main(String[] args) {
        // Bir den N e kadar sayıları ekrana yazdıran program yazınız (N dahil)
        // input : 6
        // output: 1, 2, 3, 4, 5, 6
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayıyı giriniz : ");
        int n = scanner.nextInt();
        for (int i = 1; i <n ; i++) {
            System.out.print(i+", ");
        }
        System.out.print(n);
    }
}
