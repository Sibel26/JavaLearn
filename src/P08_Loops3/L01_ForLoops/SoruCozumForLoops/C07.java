package P08_Loops3.L01_ForLoops.SoruCozumForLoops;

public class C07 {
    public static void main(String[] args) {
        // Rast gele ürettiğiniz (1 ila 100 arasında)
        // 10 adet int sayıdan
        // çift ve tek olanların toplamını ayrı ayrı bulunuz
        // ek olarak sağlama yapmak için tümToplamı da bulalım
        int toplamCift=0;
        int toplamTek=0;
        int toplamTum=0;
        for (int i=0; i<10; i++){
            int rastgeleSayi= (int) (Math.random()*100+1);
            System.out.print(rastgeleSayi+" ");
            toplamTum = toplamTum + rastgeleSayi;
            if (rastgeleSayi%2==0){
                toplamCift=toplamCift+rastgeleSayi;
            } else {
                toplamTek=toplamTek + rastgeleSayi;
            }

        }
        System.out.println();
        System.out.println("toplamCift = "+toplamCift);
        System.out.println("toplamTek  = " + toplamTek);
        System.out.println("toplamTum = " + toplamTum);

    }
}
