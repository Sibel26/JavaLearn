package P08_Loops3.L01_ForLoops.SoruCozumForLoops;

public class C06 {
    public static void main(String[] args) {
        // Rast gele ürettiğiniz (1 ila 100 arasında)
        // 10 adet int sayıdan
        // çift olanların toplamını bulunuz

        int toplam=0;
        for (int i=0; i<10; i++){
            int rastgeleSayi= (int) (Math.random()*100+1);
            System.out.print(rastgeleSayi+" ");
            if (rastgeleSayi%2==0){
                toplam=toplam+rastgeleSayi;
            }
        }
        System.out.println();
        System.out.println("toplam= "+toplam);

    }
}
