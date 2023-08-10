package P15_Varargs;

public class C02_Varargs {
    public static void main(String[] args) {
        int sayi1=12;
        int sayi2=322;
        int sayi3=16;
        int sayi4=155;
        toplama("2 sayının toplamı ",sayi1,sayi2);
        toplama("3 sayının toplamı ",sayi1,sayi2,sayi3);
        toplama("4 sayının toplamı ",sayi1,sayi2,sayi3,sayi4);

    }

    private static void toplama(String str, int...sayi) {
        int toplam=0;
        for (int deger:sayi ) {
            toplam +=deger;
        }
        System.out.println(str+toplam+" dir");
    }

}

