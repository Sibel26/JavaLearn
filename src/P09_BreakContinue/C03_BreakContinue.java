package P09_BreakContinue;

public class C03_BreakContinue {
    public static void main(String[] args) {
        // rast gele 1 ile 100 arasında 20 adet sayı üretilmektedir
        // 10 a bölünen sadece bir sayı bulunuz
        for (int i = 0; i <20 ; i++) {
            int number = (int) (Math.random()*100+1);
            if (number%10 ==0) {
                System.out.println();
                System.out.println("number = " + number);
                break; // for dan çık yani 16.satıra git
            }
            System.out.print(number+" ");
        }
        System.out.println(); // 16.satır
        System.out.println("bitti");

    }
}
