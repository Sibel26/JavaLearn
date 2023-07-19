package P07_StringManipulation_Version1;

public class C09_Replace {
    public static void main(String[] args) {
        // verilen string teki "al" geçen ifadeleri, kaldırınız
        String str = "selamlar alı al karalı olmalı";
        str= str.replace("al", "");
        System.out.println(str);

        // soru 2 : Verilen string de Ali yerine yanlışlıkla alı yazılmıştır,
        // bunları bulup düzeltin
        // output = "selamlar Ali al karalı olmalı"
        System.out.println("- soru 2 -");
        String str1 = "selamlar alı al karalı olmalı";
        System.out.println(str1);
        System.out.println(str1.replaceAll( " alı ", " Ali "));
        /** replace()
         * Metin icerisindeki karakter ya da bir parcasinin, istenilen karakter ya da metinle degistirilmesini
         * (update -set) saglar. Sonuc String'dir..
         *
         */
        System.out.println(str1.replaceFirst("alı","Ali"));




    }
}
