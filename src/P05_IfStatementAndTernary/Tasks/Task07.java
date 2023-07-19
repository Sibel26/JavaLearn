package P05_IfStatementAndTernary.Tasks;

import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {
		/* Task->
		 Kullanıcıdan bir harf girmesini isteyin.
Girdiği küçük harf ise harfin “a” olup olmadığını kontrol edin. Harf “a” ise ekrana “Ilk küçük harf” yazdırın.
“a” değil ise ekrana “Ilk küçük harf değil” yazdırın.
Girdiği büyük harf ise harfin “Z” olup olmadığını kontrol edin. Harf “Z” ise ekrana “Son büyük harf” yazdırın.
“Z” değil ise ekrana “Son büyük harf değil” yazdırın.
		 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Harf girin");
        char harf = scan.next().charAt(0);



        // 'A' = 65,    'Z'=90
        // 'a' = 97     'z'=122


        if (!Character.isAlphabetic(harf)) {
            System.out.println("Harf değil Lütfen bir sonraki sefere harf girin");
        }
        else if  (Character.isLowerCase(harf) && (harf == 'a')) {
            System.out.println("Ilk küçük harf");
        } else if (Character.isLowerCase(harf) && (harf != 'a')) {
            System.out.println("Ilk küçük harf degil");
        } else if (Character.isUpperCase(harf) && (harf != 'Z')) {
            System.out.println("Son büyük harf değil");
        } else if (Character.isUpperCase(harf) && (harf == 'Z')) {
            System.out.println("Son büyük harf ");
        }

//2.cozum
        if (!Character.isAlphabetic(harf)) {
            System.out.println("Harf değil Lütfen bir sonraki sefere harf girin");
        } else {
            if (Character.isLowerCase(harf)) {
                if (harf == 'a') {
                    System.out.println("Ilk küçük harf");
                } else {
                    System.out.println("Ilk küçük harf değil");
                }
            } else {
                if (harf == 'Z') {
                    System.out.println("Son büyük harf ");
                } else {
                    System.out.println("Son büyük harf değil");
                }
            }
        }
    }
}
