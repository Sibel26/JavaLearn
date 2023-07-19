package P08_Loops1.L01_ForLoops.Tasks02;

public class Task02_05 {
    public static void main(String[] args) {
        // 1 ila 10 arasında rastgele üretilen n adet sayının  çift olanlarını ekrana yazınız

        int rasgeleSayi;
        int rasgeleCiftSayi;

        for (int i = 0; i < 10; i++) {
            rasgeleSayi=(int)(Math.random() * 10+1);

            if (rasgeleSayi%2==0){
                rasgeleCiftSayi=rasgeleSayi;
                System.out.println(i+1+". sayi cift= "+rasgeleCiftSayi);
            }
        }





    }
}
