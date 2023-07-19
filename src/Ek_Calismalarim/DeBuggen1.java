package Ek_Calismalarim;

import java.util.Scanner;

public class DeBuggen1 {
    public static void main(String[] args) {

        // TASK_02 : Kullanicidan 100’den kucuk bir tamsayi isteyin.
// 1’den baslayarak girilen sayiya kadar 3’un kati olan sayilari yazdirin.
        //Debugging Deneyelim

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 100den kucuk bir tamsayi giriniz");
        int sayi = scanner.nextInt();


        for (int i = 1; i<=sayi ; i++) {

           if (i%3==0){
               System.out.println(i);
           }
        }



        }





    }







