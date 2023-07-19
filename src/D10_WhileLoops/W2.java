package D10_WhileLoops;

public class W2 {
    public static void main(String[] args) {
        // 3 den 20 ye kadar sayilarin toplamini yazan bir code creat ediniz

        int i = 3;
        int toplam = 0;
        while (i < 21) {
            System.out.println( i+" " );

            toplam = toplam + i;
            i++; // neden burada i++ oldu sonda

        }
        System.out.println(toplam);

// 2.cözüm halime h
        // i=3;
        //int toplam=0;
        //while (i<21){
        //    toplam+=i;
        //    i++;
        //}
        //System.out.println(toplam);
    }
}
