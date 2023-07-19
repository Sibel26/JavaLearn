package P08_Loops2.L01_ForLoops.Tasks;

public class Task09 {
    public static void main(String[] args) {
           /*
        task-> girilen boyutta aşağıdaki şekli  print eden code create ediniz
          Örnek Ekran çıktısı
      *
      * *
      * * *
      * * * *

         */

        int boyut=5;

        for (int i = 0; i <boyut ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("*  ");
            }
            System.out.println();

        }
        System.out.println("bitti");
    }
}
