package P12_Arrays;

import java.util.Arrays;

public class C02_ArraysSplit {
    public static void main(String[] args) {
        String str = "Hello";
        String str2 = "Hello Mr Mehmet. How are you?";
        String[] strArr=str.split("");
        String[] strArr2=str2.split(" ");

        System.out.println(Arrays.toString(strArr));
        System.out.println(strArr[3]);

        System.out.println(strArr2.length);
        System.out.println(strArr2[2]);
        String str3 = Arrays.toString(strArr2);
        System.out.println(str3);


    }
}
