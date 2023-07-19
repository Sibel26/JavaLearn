package P05_IfStatementAndTernary.Tasks;

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {
		/*
		Task->
		 Kullanıcıdan bir yıl alın eğer yıl 1000’e bulunuyorsa ekrana “Milenyum"
		Eğer yıl 100’e bulunuyorsa ekrana “Yüzyıl"
		Eğer yıl 10’a bulunuyorsa ekrana “Onyıl" print eden code create ediniz.
		 */

        Scanner input = new Scanner(System.in);
        System.out.print("agam yıl giresen : ");
        int yil = input.nextInt();
        

//        if (yil >= 1000) System.out.println("Milenyum");
//        if (yil >= 100 && yil < 1000) System.out.println("Yüzyıl");
//        if (yil >= 10 && yil < 100 ) System.out.println("Onyıl");

        if (yil < 10) {
            System.out.println("Tekrar deneyiniz.");

        }else {
            if (yil >= 10 && yil < 100) {
                System.out.println("On yıl");
            }else {
                if (yil >= 100 && yil < 1000) {
                    System.out.println("Yüzyıl");

                }else {
                    System.out.println("Milenyum");
                }
}



        }











    }
}

	

