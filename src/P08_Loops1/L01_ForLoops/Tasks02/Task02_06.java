package P08_Loops1.L01_ForLoops.Tasks02;

public class Task02_06 {
    public static void main(String[] args) {
        // 1 ila 10 arasında rastgele üretilen n adet int sayıdan
        // tek olanların toplamını ekrana yazdıran program yazınız
        int rasgeleSayi;
        int toplamTekSayi = 0;

        for (int i = 0; i < 10; i++) {
            rasgeleSayi=(int)(Math.random() * 10+1);
            System.out.print(rasgeleSayi+" ");

            if (rasgeleSayi%2!=0){
                toplamTekSayi=toplamTekSayi+rasgeleSayi;
            }
        }
        System.out.println();
        System.out.println("Tek sayilar toplami= "+toplamTekSayi);







    }
}
