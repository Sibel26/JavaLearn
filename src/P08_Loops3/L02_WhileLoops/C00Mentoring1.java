package P08_Loops3.L02_WhileLoops;

public class C00Mentoring1 {
    public static void main(String[] args) {

        // Task 01 ) 1 den 10 a kadar çift sayıları yazdır


        for (int i = 2; i <= 10; i+=2) {
            System.out.print(i+" ");
        }
        System.out.println();


        int i = 2;//While da  Baslangic sartini yaz
        //bitis sartini icine yaz,sonrada body sini yaz {body}
        while (i <= 10) {
            i++;
            System.out.print(i+" ");
            i++;
        }
        System.out.println();


        i=2;
        do {
            System.out.print(i+" ");
            i+=2;

        }while (i <= 10);



        // ikinci yol
        //// for ile çözelim
        //
        //        for (int i = 1; i<= 10; i++) {
        //            if ( i % 2 == 0 ) {
        //                System.out.print(i+" ");
        //            }
        //        }
        //        System.out.println();
        //        System.out.println("-----------------------");
        //
        //        // while ile çözelim
        //
        //        int index = 1;
        //        while (index <= 10) {
        //            if (index % 2 == 0) {
        //                System.out.print(index+ " ");
        //
        //            }
        //            index++;
        //        }
        //        System.out.println();
        //        System.out.println("-----------------------");
        //
        //        // Do while ile çözelim
        //
        //        int index2 = 0;
        //        do {
        //            index2++;
        //            if (index2 % 2 == 0) {
        //                System.out.print(index2+ " ");
        //            }
        //
        //        }while (index2 <= 10);


    }


}
