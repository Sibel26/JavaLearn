package P08_Loops1.L01_ForLoops.Tasks02;

public class Task02_07 {
    public static void main(String[] args) {
        // 1 ila 100 arasında rastgele üretilen 10000 adet int sayıdan
        // % kaçı tek sayıdır

        int sayi=0;
        int tekSayi=0;

        for (int i = 0; i < 10000; i++) {
            int rasgeleSayi  = rasgeleSayi=(int)(Math.random() * 100+1);
            sayi++;
            //System.out.println(rasgeleSayi+" ");

            if (rasgeleSayi%2!=0){
                int rasgeleTekSayi = rasgeleSayi;
                tekSayi++;
            }
        }
        double yuzde=  (1.0*tekSayi/sayi)*100;
        System.out.println("%"+yuzde+" tek sayidir.");
    }








    }

