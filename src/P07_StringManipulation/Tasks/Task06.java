package P07_StringManipulation04.Tasks;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {

        /*
        Girilen String'in son karakterini silen code create ediniz...
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("bir metin giriniz : ");
        String str = sc.nextLine();


        str=str.substring( 0,str.length()-1);
        System.out.println(str);

//hüseyin b
        //Scanner sc = new Scanner(System.in);
        //
        //        System.out.print("bir metin giriniz : ");
        //        String str = sc.nextLine();
        //
        //
        //        System.out.println(str.substring(0, str.length()-1));
        //


    }
}
