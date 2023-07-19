package P05_IfStatementAndTernary.Tasks;

import java.util.Scanner;

public class _19_school_grade {

    public static void main(String[] args) {

        /*  Task->
        Bir öğrencinin notunu belirleyen bir Java programı yazın.
    Program üç tür puan (sınav, ara sınav ve final puanı) okuyacak ve notu aşağıdaki kurallara göre belirleyecektir:

        Eğer ortalama not >=90% =>not=A
        Eğer ortalama not >= 70% ve<90% => not=B
        Eğer ortalama not >=50% ve <70% =>not=C
        Eğer ortalama not <50% =>note=F

        Aşağıdaki örnek çıktıya bakın:
        int Quiz_score: 80
        int mid_term_score: 68
        int Final_score: 90
        print (Your grade is B)
                  (Notunuz B'dir) */

        Scanner input = new Scanner(System.in);
        System.out.println("agam vize notu giresen : ");
        int vizeNot1 = input.nextInt();

        System.out.println("agam ara sınav notu giresen : ");
        int vizeNot2 = input.nextInt();

        System.out.println("agam final notu giresen : ");
        int finalNot = input.nextInt();

        //oratalama hesabi
        int ortalama = (int) Math.round((vizeNot1 + vizeNot2 + finalNot) / 3.0);


        if (ortalama >= 90) {
            System.out.println("A");
        }
        if (ortalama >= 70 && ortalama < 90) {
            System.out.println("B");
        }
        if (ortalama < 70 && ortalama >= 50) {
            System.out.println("C");
        }
        if (ortalama < 50) {
            System.out.println("F");
        }
        }
    }
    // ikinci cozum tel de yaz


