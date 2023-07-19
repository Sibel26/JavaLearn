package P08_Loops2.L01_ForLoops.Tasks02;

public class Task02_07 {
    public static void main(String[] args) {
        // 1 ila 100 arasında rastgele üretilen 10000 adet int sayıdan
        // % kaçı tek sayıdır
        // 10.000 int sayı üret (1 ila 100 arasında)
        // kaç tanesi tek sayı say.
        // teksayı%si = tekSayiAdedi*100/10.000
        int counter=0;
        for (int i = 0; i <10000 ; i++) {
            int sayi = (int) (Math.random()*100+1);
            if (sayi%2==1) counter++;
        }

        System.out.println("tek sayı % si : "+(counter*100.0/10000));

        // tek sayıların yüzdesi ve toplamı versin
         counter=0;
         int toplam=0;
        for (int i = 0; i <10000 ; i++) {
            int sayi = (int) (Math.random()*100+1);
            if (sayi%2==1) {
                counter++;
                toplam +=sayi; // toplam = toplam +sayi
            }
        }
        System.out.println("tek sayı % si : "+(counter*100.0/10000));
        System.out.println("tek sayıların toplamı="+toplam);
    }
}
