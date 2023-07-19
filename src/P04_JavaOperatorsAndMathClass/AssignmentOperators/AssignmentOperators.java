package P04_JavaOperatorsAndMathClass.AssignmentOperators;

public class AssignmentOperators {
    public static void main(String[] args) {
        int a;
        a= 10 ;
        a++; // a = a +1;
        a +=2; // a = a + 2   a?
        System.out.println("a = " + a);
        a *=3; // a? 39
        System.out.println("a = " + a);
        a -=10; // a? 29
        System.out.println("a = " + a);
        a /=3;  // a? 9
        System.out.println("a = " + a);

        int yas = 33;
        System.out.println(yas + 5);
        System.out.println("yas = " + yas); // yas?
        /*
         variable'ye eğer atama yapılmazsa yapılan işlemin sonucu  kalici olmaz.
         bir variable'in degerini kalici olarak artirmak veya azaltmak için mutlaka assignment yapılmalı.
         */

        System.out.println( yas += 11);     //yas?
        System.out.println("yas = " + yas);  // yas?



    }
}
