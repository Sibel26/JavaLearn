package P04_IIK4dersDegerlendirmeSorulari;

public class C06_Math02Aciklama {
    public static void main(String[] args) {
        double a = 10;
        double b = 15;
        double c = 26;
        double d = 26;

        double result5 = Math.max(    a    ,       b         );
        double result  = Math.max(    a    ,    Math.max(b,c));


        double result2 = Math.max(a,Math.max(b,Math.max(c,d)));
        double result3 = Math.max(Math.max(a,d),Math.max(b,c));

        System.out.println(result);
    }
}
