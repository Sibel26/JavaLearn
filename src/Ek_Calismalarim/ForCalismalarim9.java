package Ek_Calismalarim;

public class ForCalismalarim9 {
    public static void main(String[] args) {
        // Task 09 ) örnek code cıktısnı yazdıran bir code create ediniz
        // soldan saga baslar hep
        //            *
        //            * *
        //            * * *
        //            * * * *

        int n = 4;
        for (int i = 0; i < n; i++) {   // kac sutün olacak
            for (int j = 0; j <= i; j++) {   // kac satir
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
