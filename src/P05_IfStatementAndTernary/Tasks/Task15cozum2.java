package P05_IfStatementAndTernary.Tasks;

import java.util.Scanner;

public class Task15cozum2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ehliyetiniz var mi?(E/H)");
        char ehliyet = scanner.next().toUpperCase().charAt(0);
        if (ehliyet == 'E') {
            System.out.println("Sürücü ehliyetiniz kac yillik : ");
            int tecrubeYil = scanner.nextInt();
            System.out.println("Kac km kullandiniz? : ");
            int tecrubeKM = scanner.nextInt();
            if (tecrubeYil >= 7) {
                if (tecrubeKM >= 100000) {
                    System.out.println("Tebrikler ise alindiniz");
                } else {
                    System.out.println();
                    System.out.println("Tecrubeniz yetersiz eksik yil = " + (7 - tecrubeYil));
                    if (tecrubeKM < 100000) {
                        System.out.println("Eksik km =" + (100000 - tecrubeKM));
                    }
                }
            }

        } else {
            if (ehliyet == 'H') {
                System.out.println("Bu is icin ehliyet sarttir");
            } else {
                System.out.println("Hatali giris");

            }

        }

    }
}
