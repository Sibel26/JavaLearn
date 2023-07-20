package P10_MethodCreation;

public class C02_Methods {
    public static void main(String[] args) {
        // 10 adet sayı üretiniz ve çift sayıların toplamını ekran yazdrıınız
        // bunu bir metot içerisinde yapınız adı topla olsun

        topla();
        int sum = topla2();
        System.out.println("Tolam 2 = " + sum);
    }

    public static void topla(){
        int toplam=0;
        for (int i = 0; i <10 ; i++) {
            int number = (int) (Math.random()*100+1);
            toplam +=number;
        }
        System.out.println("Toplam = "+toplam);
    }

    public static int topla2(){
        int toplam=0;
        for (int i = 0; i <10 ; i++) {
            int number = (int) (Math.random()*100+1);
            toplam +=number;
        }
        return toplam;
    }

}
