package P07_StringManipulation04;

public class C02_StringManuplation {
    public static void main(String[] args) {
        // substring(): Karakterleri bir dizeden, belirtilen bir başlangıç konumundan başlayarak
        // ve belirtilen yere kadar ayıklar. String döndürür.
        String str = "haSaN";

        String str2 = str.substring(1); // 1. index den itibaren stringi al
        str2 = str.substring(1,3); // 1 den 3 kadar koparır , 1 dahil 3 hariç
        System.out.println(str2);
        String str3=str;
        //cozum 1
        str = str.substring(0,1).toUpperCase()+str.substring(1).toLowerCase();
        str = str.substring(0,1).toUpperCase()+str.substring(1,str.length()).toLowerCase();
        System.out.println(str);

        // cozum 2
        str = str3.toUpperCase().charAt(0)+str3.substring(1).toLowerCase();
        System.out.println(str);
    }
}
