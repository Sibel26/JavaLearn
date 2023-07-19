package P08_Loops3.L02_WhileLoops.Tasks;

import java.util.Scanner;

public class C004Mentoring4 {
    public static void main(String[] args) {
// Task 04 ) Negatif bir değer girilene kadar kullanıcıdan alınan girişlerin toplamını yazdırın
        
//while ile
        Scanner scanner = new Scanner(System.in);

        System.out.println("sayi giriniz: ");
        int sayi = scanner.nextInt();
        int toplam = 0;
        while (sayi >= 0) {

            toplam += sayi;
            sayi = scanner.nextInt();
        }
        System.out.println("toplam= " + toplam);




    }


}
