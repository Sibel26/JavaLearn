package P04_JavaOperatorsAndMathClass.LogicalOperators;

public class C01_MantiksalOperatorler {
    /*
 -------- && - and - (ve)---------
      True   &&    True    -->  True
      True   &&    False   -->  False
      False  &&    True    -->  False
      False  &&    False   -->  False

     -------- ||- or - (veya)---------
      True   ||    True    -->  True
      True   ||    False   -->  True
      False  ||    True    -->  True
      False  ||    False   -->  False
 */
    public static void main(String[] args) {
        boolean b1=true;
        boolean b2=false;
        int a=3;
        int c=7;

//        System.out.println(b1&(a<c)); // true
//
//        System.out.println(b1&&(a>c)); // true ve false = false
//
//        System.out.println(b1&(a==c)); // false
//
//        //or->veya
//        System.out.println(b1||(a<c)); // true
//
//        System.out.println(b1||(a>c)); // true
//
//        System.out.println(b1||(a==c));// true
//
//        //not->!
//
//        System.out.println(!(b1||(a>c))); // false
//        System.out.println( !b1 ); // false
//        System.out.println( !b2 );  //true

        int x= 5, y=10,z=15;
        System.out.println((x==5) && (z==15)); // true
        System.out.println((x==5) || (z==15)); // true
        System.out.println((x==5) && !(y==15));// true
        System.out.println(!(x==5) || (y==15));// false
        System.out.println(((x==5) && (z==10)) && ((x==5) || (y==15)) );//false
                        // (true ve false) ve (true veya false)
                        // (false) ve (true) = false
        System.out.println((x==5) && (z==10) && (x==5) || (y==15) ); // false
                        // true ve false ve true veya false
        System.out.println((x==5) && (z==10) && (x==5) || (z==15) ); // true (tercih etmiyoruz)
                        // true ve false ve true veya true
        System.out.println(((x==5) && (z==10)) || ((x==5) || (y==15)) ); // true
        System.out.println(((x==5) && (z==10)) || ((x==15) || (y==15)) );// false

    }
}
