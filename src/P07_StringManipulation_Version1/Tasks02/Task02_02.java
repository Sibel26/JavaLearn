package P07_StringManipulation_Version1.Tasks02;

public class Task02_02 {
    public static void main(String[] args) {
        // Verilen stringin , ilk karekterini silin

        String str = "Harika";
        System.out.println(str);
       // System.out.println(str.substring(0)); (bunlari örnek yaptik)
        System.out.println(str.substring(1));
       // System.out.println(str.substring(2));(bunlari örnek yaptik)
        //System.out.println(str.substring(3));(bunlari örnek yaptik)

        //2.yol
        str = str.replaceFirst(String.valueOf(str.charAt(0)), "");
        System.out.println(str);

    }
}
