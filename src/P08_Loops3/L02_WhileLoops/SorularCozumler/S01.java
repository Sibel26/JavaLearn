package P08_Loops3.L02_WhileLoops.SorularCozumler;

public class S01 {
    public static void main(String[] args) {
        // 3 den 20 ye kadar sayıların toplamını bulan program (3 ve 20 dahil)
        int i = 3;
        int toplam = 0;
        while (i < 21) {
            System.out.println( i+" " );
            i++;

            toplam = toplam + i;
        }
        System.out.println(toplam);

    }
}
