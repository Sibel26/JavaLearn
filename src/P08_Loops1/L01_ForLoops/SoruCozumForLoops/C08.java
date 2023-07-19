package P08_Loops1.L01_ForLoops.SoruCozumForLoops;

public class C08 {
    // rastgele üretilen(1 ila 100 arasında) 10 adet sayıdan
    // en büyüğünü bulan bir code create ediniz
    public static void main(String[] args) {
        int enBuyuk=0;
        for (int i = 0; i <10 ; i++) {
            int rastgeleSayi = (int) (Math.random()*100+1);
            if (rastgeleSayi>enBuyuk) enBuyuk = rastgeleSayi;
            System.out.print(rastgeleSayi+ " ");
        }
        System.out.println();
        System.out.println("enBuyuk = " + enBuyuk);
    }
}
