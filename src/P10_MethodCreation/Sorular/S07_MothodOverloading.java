package P10_MethodCreation.Sorular;

public class S07_MothodOverloading {
    // method overloding
    public static void main(String[] args) {
        String str = "selamlar";
        int sayi1=10;
        int sayi2=20;
        double dd=30;
        yaz(str);
        yaz(sayi1);
        yaz(sayi1,sayi2);
        yaz(sayi1,dd);


    }

    private static void yaz(String str) {
        System.out.println(str);
    }
    private static void yaz(int sayi1) {
        System.out.println("sayi = "+sayi1);
    }
    private static void yaz(int sayi1,int sayi2) {
        System.out.println("sayi = "+(sayi1+sayi2));
    }
    private static void yaz(int sayi1,double sayi2) {
        System.out.println("sayi = "+(sayi1+sayi2));
    }
    private static void yaz(double sayi1,int sayi2) {
        System.out.println("sayi = "+(sayi1+sayi2));
    }


}
