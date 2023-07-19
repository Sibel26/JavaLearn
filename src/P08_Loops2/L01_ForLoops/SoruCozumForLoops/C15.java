package P08_Loops2.L01_ForLoops.SoruCozumForLoops;

public class C15 {
    public static void main(String[] args) {
        /* verilen n sayısına göre aşağıdaki şekli oluşturun
        *
        * *
        * * *
        * * * *
        * * * * *

        1. tur i = 0 , j=0 1<1 e kadar
        2. tur i = 1 iken j=0 dan <2
        3. tur i = 2 iken j=0 dan <3
        3. tur i = 3 iken j=0 dan <4
        3. tur i = 4 iken j=0 dan <5


        * */


        int n = 5;

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.printf("%s ","*");
            }
            System.out.print("\n");
        }

    }
}
