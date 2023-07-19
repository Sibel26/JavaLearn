package P07_StringManipulation04.Tasks;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        /*
        Task-> Girilen string içindeki istenen index'deki karakteri print eden code create ediniz
         */


        Scanner sc = new Scanner(System.in);

        System.out.print("bir metin giriniz : ");
        String str = sc.next();


        int index=sc.nextInt();
        System.out.println(str.charAt(index));


//System.out.println(str.substring(index,index+1)); halime h























    }
}
