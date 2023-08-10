package P13_Arrays04;

import java.util.ArrayList;
import java.util.Arrays;

public class C01_ArrayList {
//   ArrayList<int> ageList1 = new ArrayList<>();//istenildiği kadar primitive data depolayan variable
//<>: generix diamond operator
        /*
     Array List genel Tanimi:

            ArrayList<Type> arrayListName  =new ArrayList<Type>();
                 List<Type> arrayListName = new ArrayList<>();

             1. Type : String, Integer, Double, Long, Byte, Short, Boolean, Object, .... seklinde Class olmalidir
                - ArrayList<int> hatali bir tanimlamadir. Type Wrapper Class gibi object türünden olmalidir


            2.  - Arrayler degistirilemez sabit bir .length;'de tanimlanir.
                - ArrayList'ler degistirilebilir size(); belirleme zorunlulugu olmadan tanimlanır.
            3.  Intellij sonda bos biralikan <> yerine <~> seklinde ifade yazabilir bu ifade tanimdaki tür ile ayni anlamindadir.

    List declarations(tanımlama) :
    Array den farki boyut esnekleğidir.Array'lerde length sabittir, degistirilemez. ArrayList'lerde (List) length esnektir.
     eleman ekledikce List size'ini artirir,  eleman sildikce List size'ini azaltir.


    key word: List<Wrapper Class> name=

    List'e assaign etme(atama) :
    List'ler data type olarak primitive'leri kabul etmez. Primitive'lerde data type'ini non-primitive yapmak icin wrapper class'lari kullanilir.
    List<wrapper Class> name = new List<>()      *****yanlışşşşşşş (<> :jenerik wrapper Class dan parametre alır.)
    List<wrapper Class> name = new ArrayList<>() *****doğru
    List<wrapper Class> name = new ArrayList<Wrapper Class>() *****doğru->best practice
    ArrayList<wrapper Class> name = new ArrayList<>()  *****doğru

    List'e ilk değer atama (initialize):....
    1.yol : asList();
    ArrayList<Integer> sayı= new ArrayList<>(Arrays.asList(1,2,3)) demek 1,2,3 elemanlarini array olarak al demektir.
    2.yol : Listof();
    ArrayList<String> ulkeler= new ArrayList<String>( List.of("Almanya", "Fransa", "Ingiltere", "Ispanya", "Italya") );

    ArrayList ler array'lerin aksine direkt olarak ekrana yazdirilabilirler-->  print için:  System.out.println(name);
    Array'ler Arrays.toString(arrayAdi); ile print edilir.


    Collections ==> Bir araya getirilmis parcalar anlamına gelir. ArrayList, Set, Vector, Queue ler java collections sınıfı nesneleridir.
*/

    public static void main(String[] args) {
        int[] arr = new int[10];  // 1

        // dizinin tanımı
        ArrayList<Integer> dizi = new ArrayList<>(); // 1

        // başlangıç değeri ile tanımlayalım ( 4 elmanlı bi r
        ArrayList<Integer> dizi2 = new ArrayList<>(Arrays.asList(5,4,2,6));

        // diziye eleman ekleme , diziyi 1 eleman uzatır ve orya sayıyı i koyar
        int sayi=5;
        dizi.add(sayi);
        dizi.add(sayi+4);
        dizi.add(sayi-2);
        System.out.println(dizi); // 5, 9, 3

        // dizi nin bir elemanını değiştirme, dizi[2] = 12;
        dizi.set(2,12); // 5,9,12

        // System.out.println(dizi[1]);
        System.out.println(dizi.get(1));

        int sum = dizi.get(1)+ dizi.get(2);
        dizi.set(0,sum); // 21 , 9 , 12
        System.out.println(dizi);








    }
}
