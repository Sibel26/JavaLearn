package P10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task04_2{//amale köyden ırgat çağıran şeher
    /*
        Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin yapıldıgı bir
         ATM app. code create ediniz
         */
    static int bakiye;
    static Scanner scanner;

    public static void main(String[] args) {

        bakiye = 1000;
        scanner = new Scanner(System.in);
        menu();
    }//main dışı

    private static void menu() {
        System.out.println("\n\n\n");
        System.out.println("   ***   ");
        System.out.println("  ***   ATM'ye hoş Geldiniz  ***  ");
        System.out.println("   ***   ");
        System.out.print("MÖNÜÜÜ :-)\nBakiye öğrenme -> 1\nPara yatırma -> 2\nPara Çeke -> 3\nÇıkış -> 4\nGiriniz : ");

        String secim = scanner.next().substring(0,1);
        switch (secim) {
            case "1" : bayiyeDisplay(); break;
            case "2" : depositMoney();  break;
            case "3" : withdrawMoney(); break;
            case "4" : return;
            default:
                System.out.println("hatalı seçim");break;
        }
        menu();
        System.out.println("metot bitti");
    }

    private static void withdrawMoney( ) { //
        System.out.print("Çekilecek para Miktarı ? : ");

        int cekilenMiktar = scanner.nextInt();
        if (cekilenMiktar>bakiye) {
            System.out.println("Bu kadar para mevcut değil ");
        }
        bakiye =  bakiye-cekilenMiktar;
    }

    private static void depositMoney() {
        System.out.print("Yatırılacak Miktar? : ");
        int yatanMiktar = scanner.nextInt();

       bakiye= bakiye+yatanMiktar;
    }

    private static void bayiyeDisplay( ) {
        System.out.println("Bakiye = "+ bakiye);
    }


}
