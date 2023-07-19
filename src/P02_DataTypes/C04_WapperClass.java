package P02_DataTypes;

public class C04_WapperClass {
    public static void main(String[] args) {
        /*
            Note: Java primitive lere method'lar ekleyerek yeni bir
                  yapi olusturdu, bu yapiya "Wrapper Class"
                  Primitive         Wrapper
                     byte     ==>    Byte
                     short    ==>    Short
                     ** int   ==>    Integer
                     long     ==>    Long
                     float    ==>    Float
                     double   ==>    Double
                     boolean  ==>    Boolean
                     ** char  ==>    Character
         */
        // non-primitive data turleri data depolamak yaninda kullanışlı birçok method'a sahiptir
        // ancak primitive data turlerinin boyle bir ozelligi yoktur
        // primitive data turleri sadece degerleri saklarlar (container) ve hwerhangi bir özellik(method) vs bulundurmaz.
        //Ancak primitive data turleri icin de bazi işlemler için (String'den tamsayı çekme) method'lar ihtiyaç
        // olduğunda Java her bir primitive data turunu, non-primitive  Wrapper Class  oluşturarak ilgili methodlarla
        // ara çözüm imkanı sunmuştur.

        String str = "Hasan";
//        System.out.println(str.toLowerCase());
 //       System.out.println(str.toUpperCase());
 //       System.out.println(str.length());
        int s1 = 10;
        Integer s2 = 10;
        int s10 = s2;
        Integer s20 = s1;
        s10 = Integer.MIN_VALUE;
        s20 = Integer.MIN_VALUE;
//        System.out.println(" in sayı üst limiti = "+Integer.MAX_VALUE);
//        System.out.println(" in sayı alt limiti = "+Integer.MIN_VALUE);
        int sayi1 = 22;
        int sayi2  = 33;
        int sayi3  = 44;
        int kucuk = Integer.min(sayi1,sayi2);
   //     System.out.println("kucuk = " + kucuk);

        int toplam;

        toplam = sayi1+sayi2;
  //      System.out.println("toplam = " + toplam);

        toplam = Integer.sum(sayi1,sayi2);
        toplam = Integer.sum(sayi3,toplam);
     //   System.out.println("toplam = " + toplam);

        char ch= 'A';
        System.out.println(Character.isDigit(ch));
        System.out.println(Character.isAlphabetic(ch));
        System.out.println(Character.isLowerCase(ch));





    }
}
