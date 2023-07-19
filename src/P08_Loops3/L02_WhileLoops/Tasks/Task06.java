package P08_Loops3.L02_WhileLoops.Tasks;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {
        /*
        1 ile 100    sayi arasındaki  pc'nin atadığı tamsayıyı kullanıcıya
        tahmin ettirip tahmin sayısını print eden  code create ediniz.
         */

        int number = (int) (Math.random()*100+1);
        Scanner scan = new Scanner(System.in);
        int counter=0;
        int yourGuess=50;
        while (yourGuess !=number && counter>0) {
            counter++;
            System.out.print(counter+". tahmininiz : ");
            yourGuess = scan.nextInt();
            if (yourGuess>number) System.out.println("Daha Küçük bir sayı giriniz");
            else if (yourGuess<number) System.out.println("Daha büyük bir sayı giriniz");
        }
        System.out.println("Tebrikler "+counter+" tahminde bildiniz");



    }

}

