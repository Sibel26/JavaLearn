package P15_Varargs;

public class C01_Varags {
    /* Varargs
         1 -  Bir metot ta sadece 1 varargs olur
         2 - Varargs dışında parametreler varsa , varags en sonda olmalıdır
         3 - Varargs tüm verilerinin veritipi aynıdır
     */
    public static void main(String[] args) {
        int sayi1=12;
        int sayi2=322;
        int sayi3=16;
        int sayi4=155;
        int sum = toplama(sayi1,sayi2);
        int sum2 = toplama(sayi1,sayi2,sayi3);
        int sum3 = toplama(sayi1,sayi2,sayi3,sayi4);

    }
/*
    private static int toplama(int sayi1, int sayi2) {
        return sayi1+sayi2;
    }

    private static int toplama(int sayi1, int sayi2, int sayi3) {
        return sayi1+sayi2+sayi3;
    }

    private static int toplama(int sayi1, int sayi2, int sayi3, int sayi4) {
        return sayi1+sayi2+sayi3+sayi4;
    }
  */
private static int toplama(int...sayi) {
    int toplam=0;
    for (int deger:sayi ) {
        toplam +=deger;
    }
    return toplam;
}

}
