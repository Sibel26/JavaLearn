package P23_AccessModifier.paket1;

public class Veriler {
    protected String name; // sadece kendi paketinden ulaşılabilir (default ta aynıdır)
    String nn; // sadece kendi paketinden erişilebilir
    public int yas;  // her yerden ulaşılabilir
    private int sinif; // sadece kendi kalsınından ulaşılabilir
    // yukarıdaki ifadelerin hepsi metohod lar içinde geçerlidir.
    /*
             1) "private" class member(method veya instance variable)'lar sadece icinde bulunduklari class'lardan erişilebilir.
                Diğer class'lardan "private" class member'lara erişilemez

             2) Diğer package'lerden   olusturulan object için class'i import edilmeli

             3) Diğer package'lerden default class memberlara erişilemez.
               "default"  "package private" sağlar

             4) public class member'lara herkes her yerden erişebilir.(farkli java projesi disinda).

             5) "protected" class member'lara ayni package'dan erişilebilir. Farkli package
              için : a)Child class erişebilir. 	b)Child class degil ise erişilemez.

             6) Class'lar için  sadece "public" ve "default" access modifier kullanilir.
              Class tanımlanırken "private" veya "protected" access modifier kullanilmaz.

     */

    public void selam(){
        System.out.println("hello");
        System.out.println(name);

    }

}
