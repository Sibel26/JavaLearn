package P21_StaticKeyWord;

public class C01_StaticKeyWord {
    /*
       => Class'in icinde methodlarin disinda olusturulan variable'lara "instance variable" denir.
       => Class'in icinde methodlarin disinda olusturulan static variable'lara "Class variable" denir.
       => Instance variable'lar gibi Class variable(Static variable)'lar initial edilmezse(ilk değere ataması)
       default value ataması yapılır
       => Static variable'lar call etmek  icin object olusturmaya gerek yoktur.
       => Bulunduğu  class icinden static yapılara  ulasilabilir.
           Farklı class'lardan ClassName.staticYapı class name ile call edilir.
            farklı class'da obj name ile değl class name ile call edilir.
       => Instance variable(Object Variable)'lar call etmek icin object create edilmesi zorunludur.Object olusturmadan
          instance variable'a ulasilamaz.
       => Static variable'lara object ile call edilebilir ama tavsiye edilmez.
       => Eger static variable'lara object ile call edilirse Java  sari alt cizgi ikaz eder->.BAD PRACTICE
       =>  static keyword hafıza opt. için kullanılır ve memory'de 1 kez oluşturulur

            bir obj static variable değeri değişirse tüm obj variable değeri değişir
            static obj den bağımsızdır class'a bağımlı Class'ın malıdır.

            Trick-> bir variable, methoda doğrudan calss name ile obj olmadan call etmek için static olmalıdır..
   */
    int x1;
     static int x2;
    public static void main(String[] args) {
        C01_StaticKeyWord cc1 = new C01_StaticKeyWord();
        C01_StaticKeyWord cc2 = new C01_StaticKeyWord();
        C01_StaticKeyWord cc3 = new C01_StaticKeyWord();
        int sayi = 0;
        cc1.x1 = 11;
        cc1.x2 = 21;
        cc2.x1 = 255;
        cc2.x2 = 555;
        x2=200;
        C01_StaticKeyWord.x2 = 22;

        System.out.println(sayi);
        System.out.println(cc1.x1);
        System.out.println(cc1.x2);
        System.out.println("----- ");

        System.out.println(cc3.x1);
        System.out.println(cc3.x2);

        System.out.println("-----");



    }
    public static void metotStatic(){
        System.out.println("Static metot");

    }
    public void metotNonStatic(){
        System.out.println("Non static metot");

    }

}
