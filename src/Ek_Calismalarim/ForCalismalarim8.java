package Ek_Calismalarim;

public class ForCalismalarim8 {
    public static void main(String[] args) {
        // Task 08 )şeklini olusturan bir code create ediniz //kendim yaptim ,yeniden coz 11.07.2023
        //            1 0 0 0 0
        //            0 1 0 0 0
        //            0 0 1 0 0
        //            0 0 0 1 0
        //            0 0 0 0 1

     int n= 5;
      for (int i =0 ;i<n ;i++) { //neden i ve j ayiriyoruz
          for (int j =0 ; j<n ; j++) {
              if (i == j) System.out.print("1  ");
              else System.out.print("0  ");

          }



          System.out.println();
      }

    }
}
