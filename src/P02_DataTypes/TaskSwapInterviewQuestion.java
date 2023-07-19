package P02_DataTypes;

public class TaskSwapInterviewQuestion {
     /*
        TASK :
        Verilen int sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP)
        code create edip print ediniz.
        a) 3. bir variable kulanarak
        b) 3. bir variable kullanmadan

	     input	: sayi1=20 ve sayi2=34;
		 output  :  sayi1=34 ve sayi2=20

         */


    public static void main(String[] args) {

        int sayi1 = 20;
        int sayi2 = 34;
        int sayi3 = sayi1 ;
        sayi1 = sayi2;
        sayi2 = sayi3;
        System.out.println("yeni sayi bir degeri " + sayi1+" ve sayi2 " + sayi2);




    }












}
