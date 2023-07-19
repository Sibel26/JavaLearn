package P02_DataTypes;

public class C03_CharDataType {
     /*
        Not: char variable'lari matematiksel islemlerde kullanirsaniz, Java onlarin ASCII degerlerini kullanir.
             Ornegin; System.out.println('A' + 'C'); ekrana AC yerine 132 yazdirir
        Note: Java'da "+" sembolunun iki anlami vardir. i)Toplama islemi ii)Birlestirme Islemi(Concatenation)
              Java "+" sembolu gorunce once toplama yapmaya calisir, yapamazsa birlestirme islemi yapmaya calisir, o da olmazsa hata verir.
     */
     public static void main(String[] args) {
         char ch1 = 'A';
         char ch2 = 'C';
         System.out.println(ch1+ch2);
         // ASCII
         System.out.println(ch1);
         System.out.println(ch1+0);
         System.out.println('?');
         System.out.println('?'+0);

         // ASCII tablo oluşturalım (konu dışı)
         for (int i = 0; i <255;i++){
             System.out.print((char)(i));
             if (i%24 == 0) System.out.println(); else System.out.print(" ");
         }
         System.out.println();
         // 'A' dan 10 sonraki karekter nedir?
         char aa='A';
         System.out.println("A dan 10 sonraki karekter = "+(char) (aa+10));


     }
}
