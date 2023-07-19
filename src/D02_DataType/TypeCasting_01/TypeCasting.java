package D02_DataType.TypeCasting_01;

public class TypeCasting {
    public static void main(String[] args) {
        //tip dönüştürme, 128 sinirini gecmemesi lazim
        //tip dönusturme riskli bir istir

        int sayi1 = 100000;
        Integer sayi2 = sayi1;
        byte bb = (byte) sayi1;
        long ll = sayi1;
        sayi1 = (int) ll;
        System.out.println(bb);
// Soldakinin icine daima konur, cünkü soldakinin ici sürahi gibidir,long ll= sayi1 gibidir
        sayi1= 5;
        bb = (byte) sayi1;

        // örnek yap


     // 





    }














}
