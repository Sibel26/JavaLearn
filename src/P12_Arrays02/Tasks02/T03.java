package P12_Arrays02.Tasks02;

import java.util.Arrays;

public class T03 {
    public static void main(String[] args) {
        // Girilen bir int değerlerini rakamlara göre sıralayan kod create ediniz
        int num = 81763134;
        // input : 81763134;
        // output: 11334678
        // stringe cevir
        // sirala
        // diziyi str e cevir
        // str yi int e cevir


        String str = String.valueOf(num);
        System.out.println(str);
        String[] strArr = str.split("");
        System.out.println(Arrays.toString(strArr));
        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));
        str=""; //str bos
        for (int i = 0; i < strArr.length; i++) { //sirayla eleman ekledi diziyi string e cevirdi
            str=str+strArr[i];
        }

        System.out.println(str);
        num = Integer.parseInt(str);// tip donusumu
        num= Integer.valueOf(str); // ustteki ile ayni isi yapar
        System.out.println(num);





    }
}
