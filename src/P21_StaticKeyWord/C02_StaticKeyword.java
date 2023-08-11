package P21_StaticKeyWord;

public class C02_StaticKeyword {
    public static void main(String[] args) {
        C01_StaticKeyWord.x2 = 25;
        System.out.println(C01_StaticKeyWord.x2);
        C01_StaticKeyWord obje = new C01_StaticKeyWord();
       obje.x2 = 25;
       C01_StaticKeyWord.metotStatic();
       obje.metotNonStatic();
    }
}
