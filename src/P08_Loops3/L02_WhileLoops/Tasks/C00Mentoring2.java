package P08_Loops3.L02_WhileLoops.Tasks;

import java.util.Scanner;

public class C00Mentoring2 {
    public static void main(String[] args) {
        // Task 01 ) 1 den n a kadar çift sayıları yazdır
        //for ile
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir n sayısı giriniz: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {

            if (i % 2 == 0) {

                System.out.print(i + " ");
            }

        }
        System.out.println();




//while ile


       int i1 =1;
        while (i1 <= n) {
           if (i1%2==0) {
                System.out.print(i1+" ");
            }i1++;


        }System.out.println();


// do while ile

        int i2 =1;
        do {
            if(i2%2==0) {
                System.out.print(i2+" ");
            }i2++;
        }while (i2<=n);


        System.out.println();





    }



}
