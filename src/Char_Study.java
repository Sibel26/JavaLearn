public class Char_Study {

    public static void main(String[] args) {

        // SORU 1)
        System.out.println("***** CHAR *****");
        char a = '1';
        int b = a;

        // char herhangi bir dönüşüme ugramazda direk char karakteri yazdırırlır
        System.out.println(a); // 1
        // char int bir variable a esitlenirse ascıı ye göre deger alır
        System.out.println(b); // 49
        System.out.println();

        // SORU 2)
        char c = 'A';
        // char herhangi bir dönüşüme ugramazda direk char karakteri yazdırırlır
        System.out.println(c); // A
        // char matematiksel işleme girerse ascıı deki degerini alır
        System.out.println(c+0);  // 65
        // char int a cast olursa ascıı deki degerini alır
        System.out.println((int)c); // 65
        // char matematiksel işleme girerse ascıı deki degerini alır
        System.out.println(c+2); // 67
        // c --> char olarak A degerine sahiptir. 256 ile matematiksel işlmeme girer ve 256+65 işlmei olur . BU sayısal
        // sonuc en son (char) a döndürülür. Ve cıktı olarak karakter verir
        System.out.println((char)(c+256)); // karakter
        System.out.println();








    }

}
