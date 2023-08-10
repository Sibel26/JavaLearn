package Level_2;

public class T02 {
    public static void main(String[] args) {
        // 4 adet rastgele sayı üretin veya okutun , Ternary yardımı ile yardımı ile en küçüğünü bulun,
        // sayıları üretiikten veya okuttuktan sanra
        // çözüm sadece 1 satırta bitsin ( yani tek ";" kullanılacak

        int sayi1= (int) (Math.random()*100);
        int sayi2= (int) (Math.random()*100);
        int sayi3= (int) (Math.random()*100);
        int sayi4= (int) (Math.random()*100);
        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);
        System.out.println("sayi3 = " + sayi3);
        System.out.println("sayi4 = " + sayi4);

// sayi 1 sayi 2 den kucukse durumu
        int enKucuk = sayi1<sayi2 ?
                (sayi1<sayi3 ? (sayi1<sayi4 ? sayi1 :sayi4) : (sayi3<sayi4 ? sayi3:sayi4))
                :(sayi2<sayi3 ? (sayi2<sayi4 ? sayi2 : sayi4) : (sayi3<sayi4 ? sayi3:sayi4));
        System.out.println("enKucuk = " + enKucuk);












    }

}
