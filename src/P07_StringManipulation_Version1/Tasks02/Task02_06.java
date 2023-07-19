package P07_StringManipulation_Version1.Tasks02;

import java.util.Scanner;

public class Task02_06 {
    public static void main(String[] args) {
        /*
        Task-> Girilen string içindeki istenen index'deki karakterin
         yerine '*' koyup print ediniz
         */


        Scanner sc = new Scanner(System.in);

        System.out.print("bir metin giriniz : ");
        String str = sc.next();

        System.out.println("istenen karakterin index'ini giriniz : ");
        int index=sc.nextInt();

        String str2;
        String str3;
        str2= str.substring(0,index);
        str3= str.substring(index+1,str.length());

        System.out.println(str2+"*"+str3);

        System.out.println(str2.concat("*").concat(str3));






    }
}
