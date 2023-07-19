package P07_StringManipulation_Version1.Tasks02;

public class Task02_03 {
    public static void main(String[] args) {
        // Verilen stringin , son karekterini '*' ile değiştirin bunu substring ile yapin

        String str = "Harika";
        System.out.println(str);
        //System.out.println(str.replaceAll( " Harik* " , " Harika " ));

        str = str.substring(0, str.length() - 1) + "*";
        System.out.println(str);














    }
}
