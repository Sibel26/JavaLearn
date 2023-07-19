package P08_Loops3.L02_WhileLoops.Tasks;

import java.util.Scanner;

public class C00Mentoring3 {

    public static void main(String[] args) {

// Task 02 ) 1 den n e kadar olan çift sayıların toplamını yazdırınız

//for ile
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir n sayısı giriniz: ");
        int n = scanner.nextInt();

        int toplam = 0;

        for (int i = 1; i< n; i++)     {
            if (i % 2 == 0) {
                toplam = toplam + i;
            }

        }
        System.out.println("ciftsayilarin toplami : "+toplam);


        System.out.println();

//While ile



        int sum=0;
        int i=0;
        while (i <=n){
            i++;
            if (i%2==0){
                sum+=i;
            }
        }
        System.out.println();
        System.out.println("toplam= "+sum);


//do While

        sum=0;
        i=0;
        do {
            i++;
            if (i%2==0){
                sum+=i;
            }
        }while (i < n);
        System.out.println();
        System.out.println("toplam= "+sum);





    }





}
