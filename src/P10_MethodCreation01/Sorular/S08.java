package P10_MethodCreation01.Sorular;

public class S08 {
    public static void main(String[] args) {
        // Verilen Stringin sonu "et" bitiyırsa true değilse false dur bir method ile kontrol ediniz
        String str="selamet";
        String suffix="et";
        boolean result = sonKontrol(str,suffix);
        System.out.println("sonuc "+ result);
    }

    private static boolean sonKontrol(String str,String suffix) {

        return str.endsWith(suffix);
    }
}
