package P22_Scope;

public class C02_StaticVariable {
    /*  instance variable'lar obje'ye bagimlidir ve her obje farkli degerler alabilir
       ogrenci notlari veya ogretmen branslari gibi
       bir objeye ait bir variable'in son degerini bulmak icin sadece o objeyi dikkate alınır

      Static variabler ise class variable olarak tanimlanir
      ve değeri tum class uyeleri icin sabittir. Okul ismi, okul mudurunun adi gibi
      eger static variable'in degeri degistirilirse herkes icin degisir.-> güneş misali

    */
    static String firmaIsim = "Clarusway";//initial edilmiş static variable->günes
    static int firmaId;//initial edilmemiş static variable->günes
    static boolean firmaIt;//initial edilmemiş static variable->günes

}
