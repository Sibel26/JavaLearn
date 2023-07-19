package P09_BreakContinue;

import java.util.Scanner;

public class C06_PinControl {
    public static void main(String[] args) {
        // Task -> String data type bir pin datasının 3 giriş hakkında kontrol eden code create ediniz.
        Scanner input = new Scanner(System.in);
        String password= "asd1234";
        System.out.println("Lütfen sifrenizi giriniz..");
        for (int i = 0; i < 10; i++) {


            String sifre= input.nextLine();
            if (sifre.equals(password)) {

            }



        }


    }
}
