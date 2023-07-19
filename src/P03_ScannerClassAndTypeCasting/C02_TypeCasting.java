package P03_ScannerClassAndTypeCasting;

public class C02_TypeCasting {
   /* byte < short < int < long < float < double
    Auto Widening Casting -> Kucuk data type'larini buyuk data typlarina Java  otomatik olarak yapar.

            */
    //Type Casting: Bir numeric data type'ini diger numeric data type'ina cevirmek demektir.
    //              byte < short < int < long < float < double
    //Note 1: Kucuk data type'ini buyuk data type'ine cevirmeye "Auto Widening" denir
    //Note 2: Buyuk data type'ini kucuk data type'ine cevirmeye "Explicit Narrowing" denir
    public static void main(String[] args) {
        int sayi1 = 100000;
        Integer sayi2 = sayi1;
        byte bb = (byte) sayi1;
        long ll = sayi1;
        sayi1 = (int) ll;
        System.out.println(bb);
        sayi1=5;
        bb  = (byte) sayi1;
        String str = String.valueOf(sayi1);
        System.out.println(str);
        str="23";
        sayi1 = Integer.parseInt(str);
        System.out.println(sayi1);
    }
}
