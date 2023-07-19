package P05_IfStatementAndTernary.Tasks;

public class _01_if_statement {

    public static void main(String[] args) {

    /*  İki tane int oluşturun. Birinci (1.) int 35. İkinci (2.) int 23.
        Eğer (if) Birinci int, İkinci int'den büyükse "int 1 is greater than 2" yazdırın.
        Eğer (if) Birinci int, İkinci int'den küçükse "int 1 is smaller than 2" yazdırın.  */

        //Kodu aşağıya yazınız.
        //if cozumu
        int a = 15;
        int b = 15;
        if (a > b) {
            System.out.println("int 1 is greater than 2");

        } else {
            System.out.println("int 1 is smaller than 2");
        }

        //ternary cozumu
        //cikti hangi data tipiyse buna göre variable yazdiririz,

        String sonuc = (a > b) ? ("int 1 is greater than 2") : ("int 1 is smaller than 2");
        System.out.println(sonuc);

        //Esitlik durumu
        String sonuc2 = (a>b) ? "int 1 is greater than 2" : a==b ? "esittirler": "a kucuktur b den";
        System.out.println(sonuc2);


    }
}
