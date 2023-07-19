package P09_BreakContinue;

public class C02_BreakContinue {
    public static void main(String[] args) {
        // rast gele 1 ile 100 arasında 20 adet sayı üretilmektedir
        // 10 a bölünemeyenleri print ediniz
        for (int i = 0; i <20 ; i++) {
            int number = (int) (Math.random()*100+1);
            if (number%2 == 0) {
                continue;
            }
            System.out.print(number+" ");
        }
    }
}
