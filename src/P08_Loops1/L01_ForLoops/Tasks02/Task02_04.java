package P08_Loops1.L01_ForLoops.Tasks02;

public class Task02_04 {
    public static void main(String[] args) {
        // 1 ila 10 arasında rastgele üretilen 10 adet sayının toplamını bulunuz

        int toplam=0;
        for (int i = 0; i < 10; i++) {
            int rasgeleSayi=(int)(Math.random()*10+1);
            System.out.print(rasgeleSayi+" ");
            toplam=toplam+rasgeleSayi;
        }
        System.out.println();
        System.out.println("toplam= "+toplam);







    }
}
