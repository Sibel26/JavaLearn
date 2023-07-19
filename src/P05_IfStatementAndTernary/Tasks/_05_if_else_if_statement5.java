package P05_IfStatementAndTernary.Tasks;

import java.util.Scanner;

public class _05_if_else_if_statement5 {

    public static void main(String[] args) {

    /*  90.25 ve 90.25 değerinde iki double oluşturun.
        Eğer ilk double, ikinci double'dan büyükse  "Hello World" yazdırın.
        Eğer ilk double, ikinci double'dan küçükse "Not Hello World" yazdırın.
        Aksi halde (else) "I love java" yazdırın. */

        Scanner scan = new Scanner(System.in);
        System.out.print("Birinci sayı ? :");
        double number1 = scan.nextDouble();
        System.out.print("İkinci  sayı ? :");
        double number2 = scan.nextDouble();
        if (number1 > number2) {
            System.out.println("Hello World");

            } else if (number1 < number2) {
            System.out.println("Not Hello World");
            }  {
            System.out.println("I love java");


        }

// Ternary
        String sonuc = (number1 >number2) ? "Hello World" : (number1<number2)? "Not Hello World": " I love Java";
        System.out.println(sonuc);

    }
}
