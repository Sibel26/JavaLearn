package Ek_Calismalarim;

public class AsalSayiIF {

    public static void main(String[] args) {

// Exercises 01 )  5 e 5  bir kare olusturalım. Her ifade ( * ) olsun

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
/*
A
B C
D E F
G H I J
K L M N O

şekli print eden code create ediniz.
sirali bir yazma var
*/
int sayi= 65;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) sayi+" ");
                sayi++;
            }
            System.out.println();
        }

/*
        A               //1. satıra 1 harf
        A B             //2. satıra 2 harf
        A B C           //3. satıra 3 harf
        A B C D
        A B C D E
        A B C D E F
        şekli print eden code create ediniz.  65=A'nın ascıı değeri

        */


       int n=6;
       int sayi01=65;
       for (int i=0; i<6;i++) {

           for (int j=0; j<=i; j++) {
               System.out.print((char)sayi01 +"  ");
               sayi01++;
           }
           System.out.println();//alt satira gecer
           sayi01=65;
        }








    }




}
