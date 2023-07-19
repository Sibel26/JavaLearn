package P08_Loops2.L01_ForLoops.Tasks;

public class Task13 {

    public static void main(String[] args) {
         /*
        A
        B B
        C C C
        D D D D
        E E E E E
        F F F F F F
        şekli print eden code create ediniz..

        */
        int  n= 6;
        int sayi=64;
        for (int i = 0; i <6 ; i++) {
            sayi++;
            for (int j = 0; j <=i ; j++) {
                System.out.print((char) sayi+" ");
            }
            System.out.println();
        }
        // cozum 2
        for (int i = 0; i <6 ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print((char) (65+i) +" ");
            }
            System.out.println();
        }


    }
}
