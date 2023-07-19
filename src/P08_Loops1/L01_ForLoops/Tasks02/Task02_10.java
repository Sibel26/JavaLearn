package P08_Loops1.L01_ForLoops.Tasks02;

import java.util.Scanner;

public class Task02_10 {
    public static void main(String[] args) {
        // Verilen string içerisinde bazı rakamlar vardır, bu rakamlar için kaç adet 0, kaç adet 1,
        // ... kaç adet 9 vardır her birini ayrı ayrı hesaplayıp yazdırınız

        Scanner scan = new Scanner(System.in); //hüseyin b cozumu
        System.out.print("Bir String girin: ");
        String str = scan.nextLine();

        int sifirAdet = 0;
        int birAdet = 0;
        int ikiAdet = 0;
        int ucAdet = 0;
        int dortAdet = 0;
        int besAdet = 0;
        int altiAdet = 0;
        int yediAdet = 0;
        int sekizAdet = 0;
        int dokuzAdet = 0;

        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i))) {

                switch (str.charAt(i)) {
                    case '0':
                        sifirAdet++;
                        break;
                    case '1':
                        birAdet++;
                        break;
                    case '2':
                        ikiAdet++;
                        break;
                    case '3':
                        ucAdet++;
                        break;
                    case '4':
                        dortAdet++;
                        break;
                    case '5':
                        besAdet++;
                        break;
                    case '6':
                        altiAdet++;
                        break;
                    case '7':
                        yediAdet++;
                        break;
                    case '8':
                        sekizAdet++;
                        break;
                    case '9':
                        dokuzAdet++;
                        break;


                }


            }

        }
        System.out.println("Sıfır adedi ==> " + sifirAdet);
        System.out.println("Bir adedi ==> " + birAdet);
        System.out.println("İki adedi ==> " + ikiAdet);
        System.out.println("Üç adedi ==> " + ucAdet);
        System.out.println("Dört adedi ==> " + dortAdet);
        System.out.println("Beş adedi ==> " + besAdet);
        System.out.println("Altı adedi ==> " + altiAdet);
        System.out.println("Yedi adedi ==> " + yediAdet);
        System.out.println("Sekiz adedi ==> " + sekizAdet);
        System.out.println("Dokuz adedi ==> " + dokuzAdet);

    }
}







