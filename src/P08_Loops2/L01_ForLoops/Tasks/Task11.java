package P08_Loops2.L01_ForLoops.Tasks;

public class Task11 {
    public static void main(String[] args) {

        /*
        A               //1. satıra 1 harf
        A B             //2. satıra 2 harf
        A B C           //3. satıra 3 harf
        A B C D
        A B C D E
        A B C D E F
        şekli print eden code create ediniz.  65=A'nın ascıı değeri

        */
        int  n= 6;
        int sayi;
        for (int i = 0; i <6 ; i++) {
            sayi=65;
            for (int j = 0; j <=i ; j++) {
                System.out.print((char) sayi+" ");
                sayi++;
            }
            System.out.println();
        }
        // cozum 2
        for (int i = 0; i <6 ; i++) {
            for (int j = 65; j <=65+i ; j++) {
                System.out.print((char) j+" ");
            }
            System.out.println();
        }



   }
}
