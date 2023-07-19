package P06Ilk6dersDegerlendirmeSorulari;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        /* klavyeden sıra ile  1.sayı, işlem( +, -, *, / ) ve 2. sayı giriliyor ,
        işlemi yapıp ekrana yazdırınız (switch - case kullanılacak
        input
        3
        +
        5
        output 8

         */


        Scanner scanner = new Scanner(System.in);
        System.out.print("1. sayı ? :"); int sayi1= scanner.nextInt();
        System.out.println("yapılacak işlem : "); char islem = scanner.next().charAt(0);
        System.out.print("2. sayı ? :"); int sayi2= scanner.nextInt();
        System.out.println();
        double sounuc;
        switch (islem){
            case '+' :
                sounuc=sayi1+sayi2;
                break;
            case '-' :
                sounuc=sayi1-sayi2;
                break;


        }


    }
}











