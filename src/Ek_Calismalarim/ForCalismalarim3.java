package Ek_Calismalarim;

public class ForCalismalarim3 {
    public static void main(String[] args) {

// Task 03 ) 1 den 100 e kadar olan tek sayıların toplamını yazdıran code crete ediniz

        int toplam = 0;


        for (int i = 0; i<101 ; i++) {
            if(i % 2 == 1) {
              toplam += i;
            }

        } System.out.println(toplam);


    }
}
