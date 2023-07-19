package D09_Loops;

public class Loops6For {
    public static void main(String[] args) {
        //Note:
        // 2 ile carparsak cift sayi uretiriz
        // 2 ile carpip 1 ekler yada 1 cikarirsak tek sayi olur

        //Rastgele ürettiginiz (1 ile 100 arasinda)
        // 10 adet int sayidan (cift sayi old.yada tek sayi olsaydi gene int)
        //cift ve tek olanlarin toplamini ayri ayri bulunuz

        int toplamCift=0;
        int toplamTek=0;

        for (int i=0; i<10; i++){
            int rasgeleSayi= (int) (Math.random()*100+1);
            System.out.print(rasgeleSayi+" ");
            if (rasgeleSayi%2==0){
                toplamCift=toplamCift+rasgeleSayi;// sayi cift degilse nedir? tektir
            } else {

                toplamTek=toplamTek+rasgeleSayi;
            }
        }
        System.out.println();

        System.out.println("Cift sayilar toplam= "+toplamCift);
        System.out.println("Tek sayilar toplam= "+toplamTek);


    }
}
