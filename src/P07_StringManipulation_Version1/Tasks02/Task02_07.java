package P07_StringManipulation_Version1.Tasks02;

import java.util.Scanner;

public class Task02_07 {
    public static void main(String[] args) {
        // iki string veriliyor, birinci stringin 3. karekterini alın
        // bu karekter , ikinci stringde varsa oradan silin
        // input :  str1 = selamlar
        //          str2 = merhabalar
        // output   str2=  merhblr
        String str1= "Alicim ata bak"; //Alinin i si
        String str2= "Velicim gel";

        String ucuncukarakter= str1.substring(2,3);
        if(str2.contains(ucuncukarakter)){
            System.out.println(str2=str2.replace(ucuncukarakter, ""));// "" hiclik oluyor// replace degisim yapiyor
        }else{
            System.out.println("bu karakter bulunmamaktadir");
        }




        //Scanner scanner = new Scanner;
       // System.out.println("Enter TWO String : ");
        //String word01 = scanner.nextLine();
        //System.out.println(word01.replaceAll(  "\\D",   "*"));





    }
}
