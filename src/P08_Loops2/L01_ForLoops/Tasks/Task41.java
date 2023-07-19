package P08_Loops2.L01_ForLoops.Tasks;

public class Task41 {
    public static void main(String[] args) {

        //soru1();
        soru2();
    }

    private static void soru1() {
                 /*
        * task-> girilen boyutta aşağıdaki şekli  print eden code create ediniz
          Örnek Ekran çıktısı
            *  -- bosluk sayısı 6
          * *  -- bosluk sayısı 4
        * * *  -- bosluk sayısı 2
      * * * *  -- bosluk sayısı 0
      n=4 ?
              *  -- bosluk sayısı 8
            * *  -- bosluk sayısı 6
          * * *  -- bosluk sayısı 4
        * * * *  -- bosluk sayısı 2
      * * * * *  -- bosluk sayısı 0
      n = 5?
      bosluk sayısı = (n-1-i)*2
         */
        int n=10;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <(n-1-i)*2 ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    private static void soru2() {
                 /*
        * task-> girilen boyutta aşağıdaki şekli  print eden code create ediniz
          Örnek Ekran çıktısı
         *  -- bosluk sayısı 3
        **  -- bosluk sayısı 2
       ***  -- bosluk sayısı 1
      ****  -- bosluk sayısı 0
      n=4 ?
          *  -- bosluk sayısı 4
         **  -- bosluk sayısı 3
        ***  -- bosluk sayısı 2
       ****  -- bosluk sayısı 1
      *****  -- bosluk sayısı 0
      n = 5?
      bosluk sayısı = (n-1-i)*2
         */
        int n=10;
        for (int i = 1; i <=n ; i++) {
            for (int j = 0; j <(n-i) ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <i ; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
