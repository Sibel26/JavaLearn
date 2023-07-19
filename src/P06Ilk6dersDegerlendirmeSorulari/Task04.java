package P06Ilk6dersDegerlendirmeSorulari;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        // Klavyeden girilen 4 sayının en büyüğünü
        //
        // Task 04.1 : if kullanarak bulunuz (ternary, wrapper,Math kullanılmayacak)
        // Task 04.2 : ternary kullanarak bulunuz (if, wrapper,Math kullanılmayacak)
        // Task 04.3 : Matt class kullanarak bulunuz (if, ternary, wrapper,kullanılmayacak)
        // Task 04.4 : Wrapper class kullanarak bulunuz (if, ternary, math,kullanılmayacak)
        // Task 04.5 : Math class içinde ternary kullanarak bulunuz (if,wrapper,kullanılmayacak)
        // Task 04.6 : Ternary içinde Math class kullanarak bulunuz (if,wrapper,kullanılmayacak)


       // int a=10;
       // int b=20;
       // int c=22;
        //int d=15;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 4 sayi giriniz: ");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();
        int sayi3 = scanner.nextInt();
        int sayi4 = scanner.nextInt();

        // Task 04.1 : if kullanarak bulunuz (ternary, wrapper,Math kullanılmayacak)
        if (sayi1 >= sayi2 && sayi1 >= sayi3 && sayi1 >= sayi4) {
            System.out.println("En büyük sayi: " + sayi1);

        } else if (sayi2 >= sayi1 && sayi2 >= sayi3 && sayi2 >= sayi4) {
            System.out.println("En büyük sayi: " + sayi2);

        } else if (sayi3 >= sayi4) {
            System.out.println("En büyük sayi: " + sayi3);

        } else {
            System.out.println("En büyük sayi: " + sayi4);
        }


      //  int eB = s1; (hüseyin beyin cözümü / cözüm 2)

        //if (s2 > eB) {
         //   eB = s2;
       // }
       // if (s3 > eB) {
          //  eB = s3;
      //  }
       // if (s4 > eB) {
         //   eB = s4;
        //}

      //  System.out.println("En büyük sayı " + eB);
      //  System.out.println();


     //   int a=10; (cozum 3 özcan beyin )
      //  int b=20;
       // int c=22;
      //  int d=15;
       // int enb=a;
//  enb=a
       // if (b>enb) {
        //    System.out.println("enb= "+b);
       // }if else (c>enb){
         //   System.out.println("enb= "+c);
        //}if else







    }
}
