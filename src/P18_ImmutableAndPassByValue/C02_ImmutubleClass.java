package P18_ImmutableAndPassByValue;

import java.util.Arrays;

public class C02_ImmutubleClass {
     /*
		  Boolean, Short, Integer, Long, Float, Double, Char ve String gibi tüm kapsayıcı sınıflar (Wrapper Class)
		  BigDecimal, BigInteger java’da immutable->değişmez sınıflara örnek olarak gösterilebilir.
          StringBuilder, StringBuffer, Arrays ve ArrayList de Mutable (değişebilir) class’lardır.
		 */

    // metota yolladığımız veri mutable ise ( Stringbulder,array v.s.) metotta değiştiğinde
    // metotu çağırdığımız yerde de değişir, alttaki örnekte olduğu gibi
     public static void main(String[] args) {
         int [] arr = new int[10];
         System.out.println(System.identityHashCode(arr));
         metot(arr);
         System.out.println(Arrays.toString(arr));
     }

    private static void metot(int[] arr2) {
        System.out.println(System.identityHashCode(arr2));
        for (int i = 0; i < arr2.length ; i++) {
            arr2[i] = i*i;
        }
        System.out.println(System.identityHashCode(arr2));

    }
}
