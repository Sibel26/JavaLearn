package D09_Loops;

public class Loops5For {
    public static void main(String[] args) {
        //Rastgele ürettiginiz (1 ile 100 arasinda) 10 adet int sayidan (cift sayi old.yada tek sayi olsaydi gene int)
        //cift olanlarin toplamini bulunuz

        int toplam=0;
        for (int i=0; i<10; i++){
            int rasgeleSayi= (int) (Math.random()*100+1);
            System.out.print(rasgeleSayi+" ");
            if (rasgeleSayi%2==0){ //2 ye bölünüyorsa, cifse
                toplam=toplam+rasgeleSayi;
            }
        }
        System.out.println();
        System.out.println("toplam= "+toplam);



        }























    }






