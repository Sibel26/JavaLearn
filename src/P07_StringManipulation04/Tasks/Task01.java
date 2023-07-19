package P07_StringManipulation04.Tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        // Task->  Girilen  bir stringde boşluk karakterinin olup olmadığını kontrol eden code create ediniz
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir string giriniz = "); // Java ogren
        String text = scan.nextLine();

//1.yol
        int i = text.indexOf(' ');
        if (i == -1) {
            System.out.println("bosluk icermez");
        } else {
            System.out.println("bosluk icerir");
        }
//2.yol
       boolean sonuc = text.contains(" ");
        System.out.println(sonuc);//



        //3.yol ****
        if (text.contains("")) System.out.println("bosluk vardir");
        else System.out.println("bosluk yoktur");
        //4.yol





    }
}

