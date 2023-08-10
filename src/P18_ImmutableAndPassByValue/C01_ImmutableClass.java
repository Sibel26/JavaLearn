package P18_ImmutableAndPassByValue;

public class C01_ImmutableClass {
    // System.identityHashCode(st1)
    public static void main(String[] args) {
        int s1 =11;

        int s2 =5;
        System.out.println("s2 = "+System.identityHashCode(s2));
        s2=s2*5-14;
        System.out.println("s1 = "+System.identityHashCode(s1));
        System.out.println("s2 = "+System.identityHashCode(s2));

        String str1 ="hasan";
        String str2 ="san";
        System.out.println(str1+" "+System.identityHashCode(str1));
        System.out.println(str2+" "+System.identityHashCode(str2));
        str2="ha"+str2;
        System.out.println(str2+" "+System.identityHashCode(str2));
        String str3="hasan";
        String str4=str1;
        System.out.println(str3+" str3 "+System.identityHashCode(str3));
        System.out.println(str4+" str4 "+System.identityHashCode(str4));




    }

    private static void metot(StringBuilder str) {

    }


}




