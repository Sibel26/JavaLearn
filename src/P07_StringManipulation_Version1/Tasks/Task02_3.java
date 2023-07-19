package P07_StringManipulation_Version1.Tasks;

public class Task02_3 {
    public static void main(String[] args) {
        // verilen string tümü ile büyük harflerden veya küçük harflerden oluşmaktadır.
        // harfler büyükmüdür/küçükmüdür belirtiniiz

        String str1 = "AADHFG";
        String str2= str1.toUpperCase();



        String str3 = "daskjhf";
        String str4= str3.toUpperCase();

        if (str1.equals(str2)) System.out.println("str1 buyuk harflerden oluşmaktadır");
        else System.out.println("str1 küçük harflerden oluşmaktadır");

        if (str3.equals(str4)) System.out.println("str3 buyuk harflerden oluşmaktadır");
        else System.out.println("str3 küçük harflerden oluşmaktadır");

    }
}
