package P21_StaticKeyWord;

public class C03_StaticBlok {
    static String name;
    static {
        System.out.println("selamlar");

        if (name.equals("isimdir")) {
            name="dlasfjlkdf1";
        } else  {
            name = "isimdirQQQ";
        }
    }

    public static void main(String[] args) {

        System.out.println(name);
    }
}
