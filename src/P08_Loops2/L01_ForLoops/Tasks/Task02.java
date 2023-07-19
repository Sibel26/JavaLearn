package P08_Loops2.L01_ForLoops.Tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /* task-> interview question
        girilen ifadenin polindrome olmasını kontrol eden code create ediniz...
        plindrome:her iki yönde okundugunda eşit olan ifadeler :ece, ada etc.
        örnek "1 ala 1"
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("bir metin  giriniz : ");
        String str = sc.nextLine();
        // Stringi ters çevir
        // 3.aşama , eşit mi? kontrol et
        String yStr="";
        for (int i = 0; i <str.length() ; i++) {
            char harf = str.charAt(i);
            yStr=harf+yStr;
        }
        System.out.println(yStr);
        if (str.equalsIgnoreCase(yStr)) System.out.println("polidrome dur");
        else System.out.println("polidrome değildir");

        //cozum 2
        yStr="";
        for (int i = str.length()-1; i >=0 ; i--) {
            char harf = str.charAt(i);
            yStr=yStr+harf;
        }
        System.out.println(yStr);
        //cozum 3
        yStr="";
        for (int i = str.length()-1; i >=0 ; i--) {
            String harf = str.substring(i,i+1);
            yStr=yStr+harf;
        }
        System.out.println(yStr);
    }


}
