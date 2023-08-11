package P22_Scope;

public class C01_InstanceVariable {
    /*												INSTANCE VARIABLE

     1) Main method'un ve/veya urettiginiz diger methodlarin disinda  disinda(ustunde veya altinda), class'in icinde
         olusturulan variable'lara non-Static Class level "instance variable" denir.
     2) Instance variable'lar object olusturulurken olusturulur ve her obje'ye bu variable'lar monte edilir.
     3) Instance variable'lara deger atamasi yapsaniz da olur, yapmasaniz da olur.
         Asagida goruldugu gibi "yas" variable'ina deger atamasi yapıldı ama "tecrube" variable'ina yapılmadı
         Note : Bir variable'a deger atamasi yapma "Initialize" olarak adlandirilir.
             "yas" variable'i initialize edildi, digerleri initialize edilmedi.
     4) Initialize edilmeyen "instance variable" lar ve "Class variable" lar icin Java "default value" atamasi yapar.
                 byte, short, int, long icin default value 0'dir.
                 float, double --> default value 0.0'dir.
                 char --> default value ' ''dir.
                 boolean --> default value false'dur.
                 String --> default value "null" dir.

 */
    static String kurs = "clarusway";//initial edilmiş static güneş variable
    static String prLanguage;//initial edilmemiş static güneş variable
    //fields..-> inst. variable

    int yas = 48;//initialize variable
    int tecrube;//default value:0
    String name; //default value: "null"
    boolean developerMi;//default value: false
    double boy; //default value: 0.0
    char unvan; //default value: ' 'dir.

    public static void main(String[] args) {
        C01_InstanceVariable obj = new C01_InstanceVariable();
        System.out.println(obj.yas);
        System.out.println(obj.developerMi);

        // static String ss="jfd"; static metot ta veya statik block ta statik variable tanımlanamaz
        int a = 17;//initial edilmiş local variable
        int b;//intial edilmemiş localvariable
        System.out.println(prLanguage);
        obj.selam("Hasan");
        obj.selam2();
    }

    public void selam(String name){
        System.out.println("Hello "+name);
    }
    public void selam2(){
        System.out.println("Hello "+name);
    }
/*
Ahir Kelam (Son Söz): Bir statik metot içerisinde , statik metot ve variable ler doğudan çağrılabilir(kullanılabilir).
(eğer bu static olan  metot veya variable farklı bir classta ise , (bulunduğu class).(metot veya variable)
Bir statik metot içerisinde, non-statik  metot ve variable obje oluşturularak kullanılabilir.

 */
}
