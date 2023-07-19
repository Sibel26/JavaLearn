package P09_BreakContinue;

public class C04_BreakContinue {
    public static void main(String[] args) {
        // rast gele 1 ile 100 arasında 20 adet sayı üretilmektedir
        // 10 a bölünen sadece bir sayı bulunuz
        for (int i = 0; i <10 ; i++) {
            for (int j = 0; j <20 ; j++) {
                int number = (int) (Math.random()*100+1);
                if (number%10 ==0) {
                    System.out.println();
                    System.out.println("number = " + number);
                    break;
                }
                System.out.print(number+" ");
            }
            System.out.println();
            System.out.println(i+". tur bitti");
        }

        System.out.println();
        System.out.println("bitti");
// break ve continue içinde bulunulan loop ile ilgilidir, bir dıştaki loop u ilgilendirmez
    }
}
