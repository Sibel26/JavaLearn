package P05_IfStatementAndTernary.Tasks;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        /*
          TASK -> girilen iki sayiyi seçilen dört işlemden birine uygulayıp sonucu print eden code crate ediniz

         */
        Scanner input = new Scanner(System.in);
        System.out.println("agam 1. sayı  giresen : ");
        int sayi1 = input.nextInt();
        System.out.println("agam 2. sayı  giresen : ");
        int sayi2 = input.nextInt();



        System.out.println("Lütfen bir islem seciniz:\nToplam: T\nFark: F\nBölme: B\nCarpma: C  ");
        char islem = input.next().charAt(0);

        if(islem =='T'){
            System.out.println("Toplam= "+(sayi1+sayi2));
        }

        else if(islem =='F'){
            System.out.println("Fark= "+(sayi1-sayi2));
        }

        else if(islem =='B'){
            System.out.println("Bölme= "+((sayi1*1.0)/sayi2));
        }

      else if(islem =='C'){
            System.out.println("Carpma= "+(sayi1*sayi2));
        }
        else{
            System.out.println("Hatali giris yaptiniz");
        }



    }
}
