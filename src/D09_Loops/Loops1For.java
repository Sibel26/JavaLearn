package D09_Loops;

import java.util.Scanner;

public class Loops1For {

    public static void main(String[] args) {
        // Bir den N e kadar sayilari ekrana yazdiran program yaziniz(N dahil)
        // input : 6
        // output : 1,2,3,4,5,6


        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n = scan.nextInt();

        for (int i = 1; i < n; i++) {
            System.out.print(i + ", ");

        }
        System.out.println(n);







    }


}
