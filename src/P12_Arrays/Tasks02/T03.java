package P12_Arrays.Tasks02;

import java.util.Arrays;

public class T03 {
    public static void main(String[] args) {
        // Girilen bir int değerlerini rakamlara göre sıralayan kod create ediniz
        int num = 81763134;
        // input : 81763134;
        // output: 11334678
        // stringe cevir
        // stringi,  string dizisine çevir
        // sırala
        // diziyi str ye çevir
        // str yi int e çevir


        String str = String.valueOf(num);
        System.out.println(str);
        String[] strArr = str.split("");
        System.out.println(Arrays.toString(strArr));
        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));
        str = "";
        for (int i = 0; i <strArr.length ; i++) {
            str=str+strArr[i];
        }
        System.out.println(str);
        num = Integer.parseInt(str);  // tip dönüşümü
        num = Integer.valueOf(str); // ustteki ile aynı işi yapar


        System.out.println(num);


    }
}
