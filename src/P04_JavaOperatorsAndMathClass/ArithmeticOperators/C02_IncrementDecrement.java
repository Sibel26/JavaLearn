package P04_JavaOperatorsAndMathClass.ArithmeticOperators;

public class C02_IncrementDecrement {
     /*
         Increment-> bir variable'in degerini toplama veya carpma işlemleri ile artırılmasıdır.
		 Decrement-> bir variable'in degerini cikarma veya bolme işlemleri ile azaltılmasıdır.
			 */
     public static void main(String[] args) {
          int a=10;
          a++; // a = a + 1;
          System.out.println("a="+a); // a=11;
          ++a; // a = a + 1;
          System.out.println("a="+a); // a=12
          System.out.println("a="+ a++ + a); // a=12 yazar ama a 13 olur
          System.out.println("a="+ a); // a=13;

          System.out.println("a="+ ++a + a); // a=1414;

          System.out.println(""+ a++ + ++a); //  a=1416
          System.out.println(""+ (a++ + ++a)); //  34 ( 16+18)
          System.out.println( a++ + ++a);    //  30  (18+20)
          System.out.println(a);
          System.out.println(Integer.sum(++a,a++)); // 21+21=42
          System.out.println(Integer.sum(a++,++a)); // 22+24=46
          System.out.println(a);

          int k = 5;

          int sonuc = ++k  +  k++  +  k++  +  --k  +  k--  +  k;

          System.out.println("sonuc = " + sonuc);
          System.out.println("k = " + k);

     }

}
